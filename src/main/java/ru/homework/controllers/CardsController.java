package ru.homework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.homework.repositories.CardsRepository;


@Controller
public class CardsController {
    @Autowired
    CardsRepository repository;

    @GetMapping("/cards")
    public String getCardsPage(ModelMap model) {
        model.addAttribute("cardsFromServer", repository.findAll());
        return "cards";
    }
}
