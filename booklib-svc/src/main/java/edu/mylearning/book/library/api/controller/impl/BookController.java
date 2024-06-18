package edu.mylearning.book.library.api.controller.impl;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.mylearning.book.library.api.controller.BookApiDefinition;
import edu.mylearning.book.library.bo.BookBO;
import edu.mylearning.book.library.service.BookService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/books")
public class BookController implements BookApiDefinition {

	private final BookService bookService;

	@GetMapping
	public List<BookBO> getBooks() {
		return bookService.getBooks();
	}

}
