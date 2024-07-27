package app.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class Book {

  private Long id;
  private String title;
  private BigDecimal pages;
  private String article;

  public Book(Long id, String title, BigDecimal pages) {
    this.id = id;
    this.title = title;
    this.pages = pages;

  }

  public String getArticle() {
    return article;
  }

  public Long getId() {
    return id;
  }

  public BigDecimal getPages() {
    return pages;
  }

  public String getTitle() {
    return title;
  }

  public void setArticle(String article) {
    this.article = article;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Book book)) {
      return false;
    }
    return Objects.equals(getId(), book.getId());
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(getId());
  }

  @Override
  public String toString() {
    return String.format("Product: id - %d, title - %s, price - %s, article - %s",
        id, title, pages, article);
  }
}
