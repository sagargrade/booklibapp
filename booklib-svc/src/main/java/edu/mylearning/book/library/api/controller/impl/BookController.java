package edu.mylearning.book.library.api.controller.impl;

import edu.mylearning.book.library.api.controller.BookApiDefinition;
import edu.mylearning.book.library.bo.BookBO;
import edu.mylearning.book.library.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static edu.mylearning.book.library.api.controller.impl.AbstractController.ROOT_CONTEXT_PATH;
import static edu.mylearning.book.library.api.controller.impl.BookController.BASE_URL;

@RestController
@AllArgsConstructor
@RequestMapping(value = ROOT_CONTEXT_PATH + BASE_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class BookController extends AbstractController implements BookApiDefinition {
    public static final String BASE_URL = "/books";

    private final BookService bookService;

    @GetMapping
    public List<BookBO> getBooks() {
        return bookService.getBooks();
    }

}
