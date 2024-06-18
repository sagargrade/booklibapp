package edu.mylearning.book.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mylearning.book.library.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
