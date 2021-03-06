package com.example.githubaction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {
    @GetMapping("/A")
    public String test() {
        System.out.println("TEST-A");
        System.out.println("TEST-AA");
        System.out.println("TEST-AAA");
        System.out.println("TEST-DEVELOP");
        System.out.println("TEST-DEVELOP - 1");
        System.out.println("TEST-DEVELOP - 2");
        System.out.println("TEST-DEVELOP - 3");
        System.out.println("TEST-DEVELOP - 4");
        System.out.println("TEST-DEVELOP - 5");
        return "TEST-A";
    }
}
