package app.car.control;

import app.car.device.steeringSystem.SteeringSystem;
import org.springframework.beans.factory.annotation.Autowired;
//руль
public class Wheel {
  @Autowired
  private SteeringSystem steeringSystem;

  public  void setSteeringSystem(SteeringSystem steeringSystem) {
    this.steeringSystem = steeringSystem;
  }

  public void turn() {
    steeringSystem.work();
  }
}
