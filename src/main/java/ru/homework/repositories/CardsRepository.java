package ru.homework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.homework.models.Card;


public interface CardsRepository extends JpaRepository<Card, Long>{

}
