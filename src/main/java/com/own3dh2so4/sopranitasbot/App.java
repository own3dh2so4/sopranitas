package com.own3dh2so4.sopranitasbot;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.own3dh2so4.sopranitasbot.bot.Bot;
import com.own3dh2so4.sopranitasbot.bot.SopranitasBot;
import com.own3dh2so4.sopranitasbot.bot.service.action.Action;
import com.own3dh2so4.sopranitasbot.configuration.ApplicationConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void main( String[] args ) throws InterruptedException
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
    	
    	Bot bot = (SopranitasBot) context.getBean("SopranitasBot");
    	
    	bot.startBot((List<Action>) context.getBean("actions"));
    }
}
