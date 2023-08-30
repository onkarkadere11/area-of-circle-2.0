package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class circlearea {
	@RequestMapping("/sayHi")
	public String sayHi(@RequestParam String str1, @RequestParam String str2) {
		return " hii, "+ str1 +" "+ str2;
		
	}
	@RequestMapping("/area")
	public String area(@RequestParam float r) {
		return "area of circle  having radius" + r + "is"+ " "+(3.14*r*r);
	}

}
