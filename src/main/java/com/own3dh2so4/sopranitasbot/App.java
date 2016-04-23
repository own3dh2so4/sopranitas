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
    	/*RestTemplate rt = new RestTemplate();
    	ObjectMapper objectMapper = new ObjectMapper();
    	objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    	long offset = -1;
    	Map<String, String> params = new HashMap<String, String>();
    	while (true) {
    		params.put("offset", String.valueOf(offset));
    		TelegramApiResponse<List<Update>> o = rt.getForObject(
    				"https://api.telegram.org/bot186755766:AAG-i0wZbU_D1nwFXQrD-nSFaMsC9EUB580/getUpdates?offset={offset}", TelegramApiResponse.class,
    				params);
        	List<Update> listaNovedades = objectMapper.convertValue(o.getResult(),  new TypeReference<List<Update>>() { });
        	for (Update u: listaNovedades) {
        		offset = u.getUpdate_id() + 1;
        		if (u.getMessage().getText() != null) {        			
        			if(u.getMessage().getText().contains("/gila")){
        				int randomNum = rand.nextInt((frasesGila.size()) - 1);
        				Map<String, String> params2 = new HashMap<String, String>();
        				params2.put("chat_id", String.valueOf(u.getMessage().getChat().getId()));
        				params2.put("text", frasesGila.get(randomNum));
        				rt.getForObject(
        	    				"https://api.telegram.org/bot186755766:AAG-i0wZbU_D1nwFXQrD-nSFaMsC9EUB580/sendMessage?chat_id={chat_id}&text={text}", Object.class,
        	    				params2);
        			}
        		}
        	}
        	
        	Thread.sleep(4000);
    	}*/
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
    	
    	Bot bot = (SopranitasBot) context.getBean("SopranitasBot");
    	
    	bot.startBot((List<Action>) context.getBean("actions"));
    }
}
