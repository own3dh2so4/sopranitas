package com.own3dh2so4.sopranitasbot.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.own3dh2so4.sopranitasbot.bot.service.action.Action;
import com.own3dh2so4.sopranitasbot.bot.service.action.DavidAction;
import com.own3dh2so4.sopranitasbot.bot.service.action.GilaAction;

@Configuration
public class SpringApplicationConfiguration {

	@Bean(name = "actions")
	public List<Action> gilaAction() {
		List<Action> list = new ArrayList<Action>();
		list.add(new GilaAction());
		list.add(new DavidAction());
		return list;
	}
	
	@Bean(name = "restTemplate")
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean(name = "ObjectMapper")
	public ObjectMapper getObjectMapper(){
		ObjectMapper objectMapper = new ObjectMapper();
    	objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    	return objectMapper;
	}
	
	
}
