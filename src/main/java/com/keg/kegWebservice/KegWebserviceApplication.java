package com.keg.kegWebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * 
 * @SpringBootApplication    automatically adds the following:
 * 
 * @Configuration            Tags the class as a source of Bean definitions
 * @EnableAutoConfiguration: tells springboot to start adding the beans
 * @ComponentScan:           Tells Spring to look for other components,
 *                           configurations, and services in the com/example
 *                           package, letting it find the controllers
 * 
 *                           </p>
 * 
 * @author                   Owner
 * 
 * 
 */
@SpringBootApplication
public class KegWebserviceApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(KegWebserviceApplication.class, args);
	}

}
