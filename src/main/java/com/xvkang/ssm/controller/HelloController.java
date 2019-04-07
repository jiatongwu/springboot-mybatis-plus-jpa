package com.xvkang.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xvkang.ssm.service.PersonService;

@Controller
public class HelloController {
	@Autowired
	private PersonService personService;

	@GetMapping({ "/hello" })
	public String hello(Model model,
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		model.addAttribute("name", name);
		personService.test();
		return "hello";
	}
}