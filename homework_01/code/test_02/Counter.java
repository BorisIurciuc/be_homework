package test_02;

/**
 * 23/07/2024 be_homework * @author Boris Iurciuc (cohort36)
 */
public class Counter {

  public static int counter;

  public static void main(String[] args) {

    MyThread01 myThread01 = new MyThread01();
    MyThread02 myThread02 = new MyThread02();

    myThread01.start();
    myThread02.start();

    try {
      myThread01.join();
      myThread02.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("value of counter: " + counter);
  }
  public static synchronized void calculateCounter(int i) {

      if (i % 21 == 0 && String.valueOf(i).contains("3")) {
        counter++;
        System.out.println(Thread.currentThread().getName() + " counter: " + counter + " i: " + i
            + " div: " + (i / 21));
      }
    }
}

