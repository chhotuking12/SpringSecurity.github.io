package com.mypack.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mypack.model.Parent;
import com.mypack.repository.ParentRepository;

@Controller
public class UserHome {
	@Autowired
	private ParentRepository re;
	@GetMapping("/userhome")
	public String userhome() {
		
		return "userhome";
	}
	@PostMapping("/login")
	public String validation(@RequestParam String username,@RequestParam String password) {
		
		Parent byEmail = re.getByEmail(username);
		System.out.println(username+"   "+password);
		if(byEmail!=null)
			return "userhome";
		else
			return "login";
	}
	@GetMapping("/logout")
	public String logout() {
		return"redirect:/index";
	}

}
