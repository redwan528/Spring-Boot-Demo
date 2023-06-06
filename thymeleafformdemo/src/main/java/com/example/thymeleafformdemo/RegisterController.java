package com.example.thymeleafformdemo;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

	@GetMapping("/register")
	public String registerForm(Model model) {
		model.addAttribute("register", new Register());
		return "register";
	}
	
	@PostMapping("/save-register")
	public String saveRegisterSubmission(Model model, @ModelAttribute Register register) {
		// save registration logic here
		//redirect to login page
		return "redirect:/login";
				
}
}
