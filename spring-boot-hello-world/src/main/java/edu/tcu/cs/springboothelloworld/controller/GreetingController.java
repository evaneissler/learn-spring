package edu.tcu.cs.springboothelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    // localhost:8080/greeting?wizardName=harry
    @GetMapping("/greeting")
    public String greet(@RequestParam(name="wizardName", required = false, defaultValue = "World") String name) {
        return "Hello " + name + "!";
    }

}
