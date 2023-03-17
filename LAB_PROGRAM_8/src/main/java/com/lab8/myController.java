package com.lab8;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class myController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/page2")
	public String page2(@RequestParam String pid,@RequestParam String pname,@RequestParam String price,Model model) {
		
		model.addAttribute("pid",pid);
		model.addAttribute("pname",pname);
		model.addAttribute("price",price);
		
		
		if(pid.equals("")) {
			model.addAttribute("error1" , "Id cannot be empty");5
			return "index";
		}
		
		else if(price.equalsIgnoreCase("")) {
			model.addAttribute("error3" , "price cannot be empty");
			return "index";
		}
		else if (pname.equalsIgnoreCase("computer")) {
			return "page2";
		}else {
			model.addAttribute("error",pname);
			return "error";
		}
			
		
		
	
		
	}
}
