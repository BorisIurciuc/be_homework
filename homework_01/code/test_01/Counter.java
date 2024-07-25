package test_01;

/**
 * 22/07/2024 be_homework * @author Boris Iurciuc (cohort36)
 */
public class Counter {
  public static int counter;
  public static void main(String[] args) {
    counter = 0;
    for (int i = 1; i <= 2000000; i++) {
      if (i % 21 == 0 && String.valueOf(i).contains("3")) {
          counter++;
        System.out.println("counter: " + counter + " i: " + i + " div: " + (i / 21));
      }
    }
  }
}
