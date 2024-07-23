package homework_01.test_02.test_02;

public class MyThread01 extends Thread {

  @Override
  public void run() {
    for (int i = 0; i <= 1_000_000; i++) {
      Counter.calculateCounter(i);
    }
  }
}
