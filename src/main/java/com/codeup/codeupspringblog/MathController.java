package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @GetMapping("/math")
    @ResponseBody
    public String landingPage() {
        return "<h1>This is the landing page.</h1>";
    }
}

