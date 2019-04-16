package com.main.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class YamlController {
	@Value("${welcome.message}") 
	private String m="";
	
@RequestMapping("/hello")
public ModelAndView hello()
{
	return new ModelAndView("MyPage","message",m);
	
}
}
