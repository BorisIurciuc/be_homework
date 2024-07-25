package test_01.app.car.control;

import test_01.app.car.device.steerinSystem.SteeringSystem;

public class Wheel {
  private SteeringSystem steeringSystem;

  public  void setSteeringSystem(SteeringSystem steeringSystem) {
    this.steeringSystem = steeringSystem;
  }

  public void turn() {
    steeringSystem.work();
  }
}
