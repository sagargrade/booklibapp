package edu.mylearning.book.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mylearning.book.library.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
