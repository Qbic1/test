package ru.homework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.homework.repositories.BooksRepository;
import ru.homework.repositories.CardsRepository;
import ru.homework.repositories.ReadersRepository;

@Controller
public class LibraryController {

    @Autowired
    private ReadersRepository readersRepository;

    @Autowired
    private BooksRepository booksRepository;

    @Autowired
    private CardsRepository cardsRepository;

    @GetMapping("/library")
    public String getLibraryPage(ModelMap model)
    {
        model.addAttribute("readersFromServer", readersRepository.findAll());
        model.addAttribute("booksFromServer", booksRepository.findAll());
        model.addAttribute("cardsFromServer", cardsRepository.findAll());
        return "library";
    }
}
