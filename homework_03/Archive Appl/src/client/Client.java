package client;


import app.controller.BookController;
import app.domain.Book;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * 27/07/2024 Archive Appl * @author Boris Iurciuc (cohort36)
 */
public class Client {

  public static void main(String[] args) {

    AbstractApplicationContext context = new AnnotationConfigApplicationContext("app");
    BookController controller = context.getBean(BookController.class);
    Book book = controller.getById(1L);
    System.out.println(book);
  }

}
