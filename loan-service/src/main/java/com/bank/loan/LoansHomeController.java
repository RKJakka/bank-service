package com.bank.loan;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansHomeController {
	
	@RequestMapping("/home")
	public String home(){
		return "Welcome Home to Loan Service";
	}

}
