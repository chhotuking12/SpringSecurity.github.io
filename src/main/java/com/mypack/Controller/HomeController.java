package com.mypack.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner.Mode;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mypack.model.Parent;
import com.mypack.repository.ParentRepository;
import com.mypack.service.ParentService;

@Controller
public class HomeController {
	@Autowired
	private ParentService service;
	@GetMapping("/index")
	public String home() {
		return"home";
	}
	@GetMapping("/login")
	public String Login() {
		
		return "login";
	}
	@GetMapping("/register")
	public String register() {
		return "parent";
	}
	@PostMapping("/save")
	public String saveRegister(
	        @RequestParam String name,
	        @RequestParam String email,
	        @RequestParam Long phone,
	        @RequestParam String password,
	        Model model
	) {
	    try {
	        Parent p = new Parent();
	        p.setName(name);
	        p.setEmail(email);
	        p.setPhone(phone);
			p.setPassword(new BCryptPasswordEncoder().encode(password));
	        p.setRole("User");
	        Parent saveParent = service.saveParent(p);

	        if (saveParent != null) {
	            return "login";
	        } else {
	            model.addAttribute("registrationError", "Registration failed. Please try again.");
	            return "parent";
	        }
	    } catch (Exception e) {
	        model.addAttribute("registrationError", "Unexpected error during registration.");
	        return "parent";
	    }
	}


	
	@GetMapping("/save1")
	public String saveRegister1(
	) {
	    try {
	        Parent p = new Parent();
	        p.setName("sujit");
	        p.setEmail("sujit@gmail.com");
	        p.setPhone(479376984);
			p.setPassword(new BCryptPasswordEncoder().encode("sujit"));
	        p.setRole("User");
	        Parent saveParent = service.saveParent(p);

	        if (saveParent != null) {
	            return "login";
	        } else {
	           
	            return "success";
	        }
	    } catch (Exception e) {
	        	
	        return "error";
	    }
	}
}
