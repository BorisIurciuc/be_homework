package app.repository;

import app.domain.Book;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryMap implements  BookRepository {

  private final Map<Long, Book> data = new HashMap<>();

  public BookRepositoryMap() {
    data.put(1L, new Book(1L, "History",new BigDecimal(150)));
    data.put(2L, new Book(2L, "Geography",new BigDecimal(250)));
    data.put(3L, new Book(3L, "Math",new BigDecimal(350)));
  }
  @Override
  public Book getById(Long id) {
    return data.get(id);
  }
}
