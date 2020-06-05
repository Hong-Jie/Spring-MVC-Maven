package com.elvisjacob;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWebController {
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String welcome() {
		return "hello";
	}
	
	@GetMapping("displayname")
	public ModelAndView display(@RequestParam("firstname") String name) {
		ModelAndView modelandview = new ModelAndView("displayName");
		List<String> names = new ArrayList<>();
		names.add("Jay");
		names.add("John");
		names.add("Jason");
		modelandview.addObject("name", name);
		modelandview.addObject("team", names);
		return modelandview;
	}
}
