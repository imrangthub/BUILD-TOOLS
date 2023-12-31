package com.imranmadbarmoduletwo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping(value = "/")
    public String welcomeMsg() {
        logger.info("Welcome to ModuleTwoApp");
        return "Welcome to ModuleTwoApp";
    }

    @GetMapping(value = "/home")
    public String helloMsg() {
        logger.info("Welcome Home to Spring Boot  ModuleTwoApp");
        return "Welcome Home to Spring Boot  ModuleTwoApp";
    }

}