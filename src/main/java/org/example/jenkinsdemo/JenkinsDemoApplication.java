package org.example.jenkinsdemo;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class JenkinsDemoApplication {
    private static final Logger logger = Logger.getLogger(JenkinsDemoApplication.class.getName());

    @PostConstruct
    public void init(){
        logger.info("init Application RP");
    }

    @GetMapping("/get")
    public String getTest(){
        logger.info("getTest");
        return "get test API";
    }

    public static void main(String[] args) {
        logger.info("main application RP");
        SpringApplication.run(JenkinsDemoApplication.class, args);
    }

}
