package ru.homework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.homework.repositories.BooksRepository;
import ru.homework.repositories.CardsRepository;
import ru.homework.repositories.ReadersRepository;

import javax.validation.Valid;


@Controller
public class CardsController {
    @Autowired
    CardsRepository repository;

    @Autowired
    ReadersRepository readersRepository;

    @Autowired
    BooksRepository booksRepository;

    @GetMapping("/cards")
    public String getCardsPage(ModelMap model) {
        model.addAttribute("cardsFromServer", repository.findAll());
        model.addAttribute("readers", readersRepository.findAll());
        model.addAttribute("freeBooks", booksRepository.findFreeBooks());
        return "cards";
    }

    @PostMapping("/cards")
    public String AddReader(String reader, String book) {
        System.out.println(reader);
        System.out.println(book);
        return "redirect:/cards";
    }
}
