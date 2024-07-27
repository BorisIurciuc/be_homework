package app.repository;

import app.domain.Book;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryList implements BookRepository{

  private final List<Book> database = new ArrayList<>();

  public BookRepositoryList() {
    database.add(new Book(1L, "History", new BigDecimal(250)));
    database.add(new Book(2L, "Geography", new BigDecimal(550)));
    database.add(new Book(3L, "Math", new BigDecimal(750)));  }

  @Override
  public Book getById(Long id) {
    return database
        .stream()
        .filter(product -> product.getId().equals(id))
        .findFirst()
        .orElse(null);
  }
}
