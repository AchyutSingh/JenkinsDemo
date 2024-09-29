package org.example.jenkinsdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

@SpringBootTest
class JenkinsDemoApplicationTests {
    private static final Logger logger = Logger.getLogger(JenkinsDemoApplicationTests.class.getName());

    @Test
    void contextLoads() {
        logger.info("tests executing");
        assert false;
    }

}
