package com.corso.java.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Christian Chiama (c.chiama@silensec.com)
 * @project-Name: first-spring-boot
 * @date: 12-04-2022
 * @time: 22:00 min
 * @file: com.corso.java.boot.Application
 */

@SpringBootApplication
public class Application {
   public static void main(String[] args) throws Exception {
      SpringApplication.run(Application.class, args);
   }
}