package com.bank.insurance;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsuranceHomeController {
	
	@RequestMapping("/home")
	public String home(){
		return "Welcome home to Insurance Service";
	}

}
