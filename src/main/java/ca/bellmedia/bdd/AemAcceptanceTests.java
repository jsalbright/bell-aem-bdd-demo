package ca.bellmedia.bdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class AemAcceptanceTests {

    /* Intentionally left blank to defeat maven:repackage error due to non-existent main application */
    public static void main(String[] args) {
        SpringApplication.run(AemAcceptanceTests.class, args);
    }
}
