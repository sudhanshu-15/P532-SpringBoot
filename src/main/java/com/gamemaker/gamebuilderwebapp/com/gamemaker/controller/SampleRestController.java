package com.gamemaker.gamebuilderwebapp.com.gamemaker.controller;

import com.gamemaker.gamebuilderwebapp.com.gamemaker.model.Score;
import com.gamemaker.gamebuilderwebapp.com.gamemaker.repository.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class SampleRestController {

    @Autowired
    GamesRepository gamesRepository;

    @GetMapping("/")
    public String hello(Model model) {
        String greet = "Hello World";
        model.addAttribute("greeting", greet);
        return "index";
    }

    @GetMapping("/games")
    public String getAll(Model model) {
        List<Score> scores = gamesRepository.findAll();
        model.addAttribute("scoreslist", scores);
        return "scoressheet";
    }

}
