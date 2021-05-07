package com.example.demo.controller;

import com.example.demo.repositories.AdRepository;
import org.springframework.stereotype.Controller;


@Controller
public class AdController {
    @GetMapping("/ads/create")
    public String showCreateForm() {
        return "ads/create";
    }

    @PostMapping("/ads/create")
    public String create(
            @RequestParam(name = "title") String title,
            @RequestParam(name = "description") String description
    ) {
        Ad ad = new Ad();
        ad.setTitle(title);
        ad.setDescription(description);
        // save the ad...
    }
}
