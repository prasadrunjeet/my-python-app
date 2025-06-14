package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String helloPage() {
        return "<!DOCTYPE html>" +
               "<html>" +
               "<head><title>Hello Page</title></head>" +
               "<body>" +
               "<h1>Hello from Spring Boot</h1>" +
               "<p>This is an inline HTML page.</p>" +
               "</body>" +
               "</html>";
    }
}
