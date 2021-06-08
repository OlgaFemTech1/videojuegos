package org.factoriaf5.videojuegos.controllers;

import org.factoriaf5.videojuegos.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

    private GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/games")
    String listGames(Model model) {
        List<Games> games = gameService.allGames();
        model.addAttribute("title", "Book list");
        model.addAttribute("books", games);
        return "books/all";
    }
}
