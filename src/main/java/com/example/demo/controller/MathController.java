package com.example.demo.controller;

//package com.codeup.springblog.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MathController {

    @GetMapping("/math")
    @ResponseBody
    public String landing() {

        return "This is Javis MathController page!";

    }
}