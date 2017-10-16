package com.gamemaker.gamebuilderwebapp.com.gamemaker.controller;

import com.gamemaker.gamebuilderwebapp.com.gamemaker.model.Player;
import com.gamemaker.gamebuilderwebapp.com.gamemaker.model.ScoreSheet;
import com.gamemaker.gamebuilderwebapp.com.gamemaker.repository.GamesRepository;
import com.gamemaker.gamebuilderwebapp.com.gamemaker.repository.PlayersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SampleRestController {

    @Autowired
    GamesRepository gamesRepository;
    @Autowired
    PlayersRepository playersRepository;

    @GetMapping("/")
    public String hello(Model model) {
        String greet = "Hello World";
        model.addAttribute("greeting", greet);
        return "index";
    }

    @GetMapping("/games")
    public String getAll(Model model) {
        List<ScoreSheet> scores = gamesRepository.findAll();
        model.addAttribute("scoreslist", scores);
        return "scoressheet";
    }

    @GetMapping("/players")
    public String getPlayers(Model model){
        List<Player> players = playersRepository.findAll();
        model.addAttribute("playerList", players);
        return "playerdisplay";
    }

}
