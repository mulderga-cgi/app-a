package com.cgi.appa;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AppAApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppAApplication.class, args);
    }

}

@RestController
class HelloWorld {

    @Value("${my.app.name}")
    private String MY_APP_NAME;

    @GetMapping("/hello")
    public String hello() {
        return "Hello world! From: " + MY_APP_NAME;
    }
}
