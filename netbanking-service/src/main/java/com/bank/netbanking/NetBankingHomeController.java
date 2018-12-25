package com.bank.netbanking;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NetBankingHomeController {
	
	@RequestMapping("/home")
	public String home(){
		return "Welcome home to NetBanking Service";
	}

}
