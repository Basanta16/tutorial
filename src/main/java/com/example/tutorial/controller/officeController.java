package com.example.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class officeController {
	@GetMapping(value="/form")
	public ModelAndView OpenForm() {
	ModelAndView model=new ModelAndView("tutorial");
	model.addObject("msg", "Welcome attribute");
	return model;
	}
}
