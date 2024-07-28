package app.repository;

import app.domain.Book;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryMap implements  BookRepository {

  private static final Map<Long, Book> database = new HashMap<>();

  static {
    try {
      importDatabase();
    } catch (FileNotFoundException e) {
      System.err.println("File not found: " + e.getMessage());
    }
  }

  @Override
  public Book getById(Long id) {
    return database.get(id);
  }

  public static void importDatabase() throws FileNotFoundException {

    File file = new File("src/archive.txt");
    Scanner scanner = new Scanner(new FileReader(file));

    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      String[] parts = line.split("\\s+");
      if (parts.length == 3) {
        Long id = Long.parseLong(parts[0]);
        String title = parts[1];
        BigDecimal pages = new BigDecimal(parts[2]);

        Book book = new Book(id, title, pages);
        database.put(id, book);
      }
    }
    scanner.close();
  }
}

