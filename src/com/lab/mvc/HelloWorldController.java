package com.lab.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "hellowworld-form";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processFormVertwo")
	public String letSHoutDude(HttpServletRequest request, Model model) {

		String name = request.getParameter("studentName");

		name = name.toUpperCase();

		String result = "YO! " + name;

		model.addAttribute("message", result);

		return "helloworld";

	}

}
