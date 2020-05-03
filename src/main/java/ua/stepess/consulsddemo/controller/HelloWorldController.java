package ua.stepess.consulsddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hw")
    public String hello() {
        return "hello world!";
    }

}
