package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

record Message(String mwssage){}

@Controller
public class HelloController {
    // Method will listen for GET requests at /hello
    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "<h1>Hello from Spring</h1>";
    }


    @GetMapping("/hello/{firstName}/{lastName}")
    @ResponseBody
    public String sayHello(@PathVariable String firstName, @PathVariable String lastName) {
        return "<h1> Hello " + firstName + " " + lastName + "<h1>";
    }
}
