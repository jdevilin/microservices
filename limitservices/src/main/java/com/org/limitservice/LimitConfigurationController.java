package com.org.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.limitservice.bean.LimitConfiguration;
import com.org.limitservice.con.Configuration;

@RestController
public class LimitConfigurationController {
   @Autowired
   private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {

		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());

	}
}
