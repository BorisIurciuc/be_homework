package app.services;

import app.domain.Book;
import app.repository.BookRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:application.properties")
public class BookServiceImpl implements BookService {

  private final BookRepository repository;
  private final String articlePrefix;

  public BookServiceImpl(
      @Qualifier("bookRepositoryMap") BookRepository repository,
      @Value("${article.prefix}") String articlePrefix
  ) {
    this.repository = repository;
    this.articlePrefix = articlePrefix;
  }

  @Override
  public Book getById(Long id) {
    Book book = repository.getById(id);
    setArticle(book);
    return book;
  }

  private void setArticle(Book book) {
    String article = String.format("%s-%s-%d",
        articlePrefix, book.getTitle().charAt(0), book.getId());
    book.setArticle(article);
  }
}
