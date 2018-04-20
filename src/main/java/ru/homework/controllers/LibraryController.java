package ru.homework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.homework.forms.BookForm;
import ru.homework.forms.ReaderForm;
import ru.homework.models.Book;
import ru.homework.models.Reader;
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
    public String getLibraryPage(ModelMap model) {
        model.addAttribute("readersFromServer", readersRepository.findAll());
        model.addAttribute("booksFromServer", booksRepository.findAll());
        model.addAttribute("cardsFromServer", cardsRepository.findAll());
        return "library";
    }

    @PostMapping("/library")
    public String postLibraryPage(BookForm bookForm, ReaderForm readerForm) {
        System.out.println(readerForm.equals(ReaderForm.empty()) + " " + bookForm.equals(BookForm.empty()));
        System.out.println(readerForm + " " + bookForm);
        if (!readerForm.equals(ReaderForm.empty())) {
            Reader reader = Reader.from(readerForm);
            readersRepository.save(reader);
        }
        if (!bookForm.equals(BookForm.empty())) {
            Book book = Book.from(bookForm);
            booksRepository.save(book);
        }
        return "redirect:/library";
    }

}