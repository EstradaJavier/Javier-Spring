package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {



@RequestMapping(path = "/posts/create", method = RequestMethod.POST)
@ResponseBody
    public String post() {

            return "creation form here";

}
}
