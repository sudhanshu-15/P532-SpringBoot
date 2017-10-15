package com.gamemaker.gamebuilderwebapp.com.gamemaker.controller;

import com.gamemaker.gamebuilderwebapp.com.gamemaker.model.Score;
import com.gamemaker.gamebuilderwebapp.com.gamemaker.repository.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SampleRestController {

    @Autowired
    GamesRepository gamesRepository;

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/games")
    public List<Score> getAll() {
        return gamesRepository.findAll();
    }

}
