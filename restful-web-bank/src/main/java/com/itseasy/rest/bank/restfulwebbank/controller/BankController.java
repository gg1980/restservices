package com.itseasy.rest.bank.restfulwebbank.controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itseasy.rest.bank.restfulwebbank.proxy.LoyaltyServiceProxy;
import com.itseasy.rest.bank.restfulwebbank.transdetails.TransDetailsVo;





@RestController
public class BankController
{
	static final Logger logger = Logger.getLogger(BankController.class);
	  @Autowired
	  private LoyaltyServiceProxy proxy;

	  
	@PostMapping("/debit/card")
	public TransDetailsVo transaction(@RequestBody TransDetailsVo transVo)
	{
		transVo.setTransId(java.util.UUID.randomUUID().toString());
		logger.info(" transVo="+transVo+" "+java.util.UUID.randomUUID().toString());
		TransDetailsVo response = proxy.creditLoyaltyTransaction(transVo);
		logger.info(" transVo="+transVo+" "+java.util.UUID.randomUUID().toString());
		
		return response;
		
	}

}
