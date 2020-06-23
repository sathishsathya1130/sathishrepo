package com.sathish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.entity.Student;

@Controller
public class StudentController {

	@GetMapping(value = { "/", "/register" })
	public String loadForm(Model model) {

		Student s = new Student();
		model.addAttribute("student",s);

		return "studentReg";

	}
	
	
	@PostMapping(value="/register")
	public String handleSubmitBtn(@ModelAttribute("student") Student s,Model model) {
		
		System.out.println(s);
		
		model.addAttribute("succMsg", "REGISTRATION SUCESSFUl");
		
		return "studentReg";
		
	}
}
