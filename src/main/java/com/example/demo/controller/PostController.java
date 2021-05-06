package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
        public String post() {

                return "Javier's Post Page.";

    }
    @GetMapping("/posts")
    @ResponseBody
    public String postIndex() {

        return "This is the posts";

    }

}
