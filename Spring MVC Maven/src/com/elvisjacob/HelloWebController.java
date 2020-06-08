package com.elvisjacob;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.elvisjacob.DAO.AppDAOImpl;
import com.elvisjacob.config.AppConfig;
import com.elvisjacob.model.User;

@Controller
public class HelloWebController {

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView modelandview = new ModelAndView("index");
		AnnotationConfigApplicationContext cotext =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		AppDAOImpl dao = cotext.getBean("BeanDAO", AppDAOImpl.class);
		
		List<User> users = new ArrayList<User>();
		users = dao.listUsers();
		System.out.println(users);	
		modelandview.addObject("users", users);
		cotext.close();
		return modelandview;
	}
	
	public String addUser(Model model, @Valid User user, BindingResult result) {
		if (result.hasErrors()) {
			model.addAttribute("user", user);
			return "addUser";
		}
		else {
			if (user.getName() != null && user.getEmail() != null) {
				AnnotationConfigApplicationContext context =
						new AnnotationConfigApplicationContext(AppConfig.class);
				AppDAOImpl dao = context.getBean("BeanDAO", AppDAOImpl.class);
				dao.addUser(user);
				context.close();
				return "forward:/";
			} else {
				System.out.println("loading form");
				return "addUser";
			}
		}
	}
}
