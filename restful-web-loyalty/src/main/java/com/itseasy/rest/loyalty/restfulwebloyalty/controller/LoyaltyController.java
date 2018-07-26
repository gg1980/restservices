package com.itseasy.rest.loyalty.restfulwebloyalty.controller;


import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itseasy.rest.loyalty.restfulwebloyalty.transdetails.TransDetailsVo;





@RestController
public class LoyaltyController
{
	static final Logger logger = Logger.getLogger(LoyaltyController.class);

	  
	@PostMapping("/creditloyaltypoints")
	public TransDetailsVo transaction(@RequestBody TransDetailsVo transVo)
	{
		logger.info(" -> before transVo="+transVo);
		transVo.setTransId(java.util.UUID.randomUUID().toString());
		logger.info(" -> after transVo="+transVo);
		
		
		return transVo;
	}


}
