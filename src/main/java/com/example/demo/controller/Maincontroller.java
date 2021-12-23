package com.example.demo.controller;


import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Maincontroller 
{
		// now mana lombok ka through log4j chalaya ha isma or sa benifit ha
		// lobok dependency jo ha wo log4j or slf4j ko inbuilt use karti ha or getter setter ko bhi use karti ha jab bhi log use karo to phla ya lombok use kar
		
	  public static final Logger logger = LogManager.getLogger(Maincontroller.class);

	
	   @GetMapping("/")
	   public String showall()
	   {	
					System.out.println("USA");
					System.out.println(logger.getName());
					System.out.println(logger.getName());
				
			      logger.trace("------------------------------------------Trace Message!!!!!!!!!!!!!!");
			      logger.debug("Debug Message!!!!!!!!!!!!!!");
			      logger.info("Info Message!!!!!!!!!!!!!!");
			      logger.warn("Warn Message!!!!!!!!!!!!!!");
			      logger.error("Error Message!!!!!!!!!!!!!!");
			      logger.fatal("Fatal Message!!!!!!!!!!!!!!");
			   return "Logger";
	   }
//		}
}
