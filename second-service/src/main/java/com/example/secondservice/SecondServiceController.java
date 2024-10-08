package com.example.secondservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
@Slf4j
public class SecondServiceController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Second Service";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("second-service-req") String header) {
        log.info("::>> header : {}", header);
        return "Hello Second Service with Header Message.";
    }

    @GetMapping("/check")
    public String check() {
        return "Hello Second Service with Custom Filter.";
    }
}
