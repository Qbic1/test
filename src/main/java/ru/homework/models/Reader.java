package ru.homework.models;

import lombok.*;
import ru.homework.forms.ReaderForm;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "reader")
public class Reader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private int age;

    @OneToMany(mappedBy = "reader")
    private List<Card> cards;

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public static Reader from(ReaderForm form) {
        return Reader.builder()
                .firstName(form.getFirstName())
                .lastName(form.getLastName())
                .age(form.getAge())
                .build();
    }

}
