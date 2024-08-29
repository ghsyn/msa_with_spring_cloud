package com.example.firstservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
@Slf4j
public class FirstServiceController {

    @GetMapping("/welcome")
    public String welcome() {
        return  "Welcome to First Service";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("first-service-req") String header) {
        log.info("::>> header : {}", header);
        return "Hello First Service with Header Message.";
    }

    @GetMapping("/check")
    public String check() {
        return "Hello First Service with Custom Filter.";
    }
}
