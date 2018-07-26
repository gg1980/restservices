package com.itseasy.rest.retailer.restfulwebretailer.controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itseasy.rest.retailer.restfulwebretailer.proxy.BankServiceProxy;
import com.itseasy.rest.retailer.restfulwebretailer.transdetails.TransDetailsVo;





@RestController
public class RetailerController
{
	static final Logger logger = Logger.getLogger(RetailerController.class);
	  @Autowired
	  private BankServiceProxy proxy;

	  
	@PostMapping("/buygoods")	
	public TransDetailsVo transaction(@RequestBody TransDetailsVo transVo)
	{
		transVo.setTransId(java.util.UUID.randomUUID().toString());
		logger.info(" before call transVo="+transVo);	
		TransDetailsVo response = proxy.performBankTransaction(transVo);
		logger.info(" after call response="+response);
		return response;
	}


}
