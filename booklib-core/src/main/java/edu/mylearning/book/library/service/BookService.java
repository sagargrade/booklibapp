package edu.mylearning.book.library.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mylearning.book.library.bo.BookBO;
import edu.mylearning.book.library.bo.mapper.BookBOMapper;
import edu.mylearning.book.library.repository.BookRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class BookService {

	private final BookRepository bookRepository;
	private final BookBOMapper bookBOMapper;

	public List<BookBO> getBooks() {
		log.info("Get all books");
		return bookBOMapper.toBO(bookRepository.findAll());
	}

}
