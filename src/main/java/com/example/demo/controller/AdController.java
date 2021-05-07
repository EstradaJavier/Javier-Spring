package com.example.demo.controller;

import com.example.demo.models.Ad;
import com.example.demo.repositories.AdRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AdController {
    private final AdRepository adDao;

    public AdController(AdRepository adDao) {
        this.adDao = adDao;
    }

    @GetMapping("/ads/create")
    public String showCreateForm(Model model) {
        model.addAttribute("ad", new Ad());
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
        // Saving my ad
        return "redirect:/posts/";

    }
}
