package ru.homework.forms;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class BookForm {
    private String title;
    private String author;

    public static BookForm empty() {
        return new BookForm();
    }
}
