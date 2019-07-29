package com.wildcodeschool.RESTful.SpringRestFul.repositories;

import java.util.List;

import com.wildcodeschool.RESTful.SpringRestFul.entities.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByTitleContainingOrDescriptionContaining(String text, String textAgain);

} 