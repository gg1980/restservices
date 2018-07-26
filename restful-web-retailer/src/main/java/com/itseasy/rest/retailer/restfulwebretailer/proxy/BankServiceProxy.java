package com.itseasy.rest.retailer.restfulwebretailer.proxy;




import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.itseasy.rest.retailer.restfulwebretailer.transdetails.TransDetailsVo;

@RibbonClient(name="bank-debit-service")
@FeignClient(name="bank-debit-service")
public interface BankServiceProxy 
{
	@PostMapping("/debit/card")
	public TransDetailsVo performBankTransaction
	  		(@RequestBody TransDetailsVo tansVo);
}


//OPTION - 3 (using Feign, Ribbon) 
// TO BE ADDED IN APPLICATION PROPERTIES -> currency-exchange-service.ribbon.listOfServers=localhost:8000,localhost:8001
//@FeignClient(name="currency-exchange-service")
//@RibbonClient(name="currency-exchange-service")
//public interface CurrencyExchangeServiceProxy 
//{
//@GetMapping("/currency-exchange/from/{from}/to/{to}")
//public CurrencyConversionBean retrieveExchangeValue
//		(@PathVariable("from") String from, @PathVariable("to") String to);
//}


//OPTION - 4 (using Feign, Ribbon) 
//REMOVE FROM APPLICATION PROPS -> currency-exchange-service.ribbon.listOfServers=localhost:8000,localhost:8001
// ADD REF to Applications PROD -> URL of naming sever --> eureka.client.service-url.default-zone=http://localhost:8761/eureka
// and enablediscoveryclient -> @EnableDiscoveryClient
//@FeignClient(name="currency-exchange-service")
//@RibbonClient(name="currency-exchange-service")
//public interface CurrencyExchangeServiceProxy 
//{
//@GetMapping("/currency-exchange/from/{from}/to/{to}")
//public CurrencyConversionBean retrieveExchangeValue
//		(@PathVariable("from") String from, @PathVariable("to") String to);
//}


