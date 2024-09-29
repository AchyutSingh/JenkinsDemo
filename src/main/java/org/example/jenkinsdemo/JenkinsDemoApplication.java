package org.example.jenkinsdemo;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class JenkinsDemoApplication {
    private static final Logger logger = Logger.getLogger(JenkinsDemoApplication.class.getName());

    @PostConstruct
    public void init(){
        logger.info("init Application");
    }

    public static void main(String[] args) {
        logger.info("main application");
        SpringApplication.run(JenkinsDemoApplication.class, args);
    }

}
