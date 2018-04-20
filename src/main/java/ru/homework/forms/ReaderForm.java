package ru.homework.forms;

import lombok.Data;

@Data
public class ReaderForm {
    private String firstName;
    private String lastName;
    private int age=0;

    public static ReaderForm empty() {
        return new ReaderForm();
    }
}
