package test_02;

public class MyThread02 extends Thread {

  @Override
  public void run() {
    for ( int i = 1_000_001; i <= 2_000_000; i++) {
      Counter.calculateCounter(i);
    }
  }
}
