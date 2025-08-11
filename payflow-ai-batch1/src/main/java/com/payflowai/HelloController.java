package com.payflowai;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "PayFlow AI Batch - 1 is running!";
    }

    @GetMapping("/healthcheck")
    public String health() {
        return "Application is healthy!";
    }
}
