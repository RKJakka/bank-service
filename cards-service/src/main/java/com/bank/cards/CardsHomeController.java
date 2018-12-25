package com.bank.cards;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsHomeController {
	
	@RequestMapping("/home")
	public String home(){
		return "Welcome Home to Cards Service";
	}

}
