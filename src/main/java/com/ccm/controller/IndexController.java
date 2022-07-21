package com.ccm.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/", "/index" })
public class IndexController {

	@GetMapping
	public String main(Model model) {
		return "index";
	}
	/*
	 * @GetMapping("{tab}") public String tab(@PathVariable String tab) { if
	 * (Arrays.asList("endpoints", "URL", "frequency").contains(tab)) { return tab;
	 * }
	 * 
	 * return "empty"; }
	 */
}
