package app;

import app.car.control.Driver;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * 25/07/2024 be_homework * @author Boris Iurciuc (cohort36)
 */
public class Application {

  public static void main(String[] args) {

    AbstractApplicationContext context = new AnnotationConfigApplicationContext("app.config");
    Driver driver = context.getBean(Driver.class);
    driver.manageCar();
  }
}
