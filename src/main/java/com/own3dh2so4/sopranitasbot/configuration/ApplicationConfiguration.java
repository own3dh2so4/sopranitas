package com.own3dh2so4.sopranitasbot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@Import(SpringApplicationConfiguration.class)
@ComponentScan("com.own3dh2so4.sopranitasbot.bot")
@PropertySource("classpath:com/own3dh2so4/sopranitasbot/environment.properties")
public class ApplicationConfiguration {

	
	@Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
	
	
}
