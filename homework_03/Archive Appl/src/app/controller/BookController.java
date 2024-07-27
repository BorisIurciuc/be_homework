package app.controller;

import app.domain.Book;
import app.services.BookService;
import org.springframework.stereotype.Component;

@Component
public class BookController {
  private final BookService service;

  public BookController(BookService service) {
    this.service = service;
  }

  public Book getById(Long id) {
    return service.getById(id);
  }
}
