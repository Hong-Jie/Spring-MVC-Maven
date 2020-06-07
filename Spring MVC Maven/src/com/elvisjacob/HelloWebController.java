package com.elvisjacob;

import java.util.HashMap;
import java.util.Map;

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
		
		Map<String,String> genderMap = new HashMap<String, String>();
		genderMap.put("female","Female");
		genderMap.put("male","Male");
		modelandview.addObject("genderMap",genderMap);
		
		Map<String,String> countryMap = new HashMap<String, String>();
		countryMap.put("TW","Taiwan");
		countryMap.put("US","United States");
		countryMap.put("UK","United Kingdom");
		countryMap.put("JP","Japan");
		countryMap.put("SG","Singapore");
		modelandview.addObject("countryMap",countryMap);
		
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
