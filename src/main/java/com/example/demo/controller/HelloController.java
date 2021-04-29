package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // C part of mvc
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String Hello() {

        return "Hello from Javier";

    }

    @GetMapping("/hello/{javi}")
    @ResponseBody
    public String sayHello(@PathVariable String javi) {

        return "Hello " + javi + "!!!!";

    }

    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return number + " plus one is " + (number + 1) + "!";
    }

}
