package com.lab.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
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

	@RequestMapping("/processFormVerThree")
	public String processFormVerThree(@RequestParam("studentName") String theName, Model model) {

		 theName = theName.toUpperCase();

		String result = "Hey My Friend from v3 ! " + theName;

		model.addAttribute("message", result);

		return "helloworld";

	}
}
