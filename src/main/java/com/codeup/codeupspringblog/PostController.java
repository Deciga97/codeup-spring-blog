package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String postPage() {
        return "Post index page...";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postId(@PathVariable int id) {
        return "Post page for ID: " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String postCreate() {
        return "Post page with post create form.";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String postCreateSubmission() {
        return "Post after submission}";
    }


}
