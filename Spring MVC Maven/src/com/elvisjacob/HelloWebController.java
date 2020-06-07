package com.elvisjacob;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWebController {

	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView modelandview = new ModelAndView("userForm");
		User user = new User();
		modelandview.addObject("user", user);
		return modelandview;
	}
	
	@PostMapping("/displayUserInfo")
	public ModelAndView displayUserInfo(@ModelAttribute User user) {
		ModelAndView modelandview = new ModelAndView("displayUserInfo");
		System.out.println(user);
		modelandview.addObject("user", user);
		return modelandview;
	}
}
