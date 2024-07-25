package app.car.control;

import app.car.device.CarDisplay;
import org.springframework.beans.factory.annotation.Autowired;

public class Driver {
  @Autowired
  private CarDisplay carDisplay;
  @Autowired
  private Ignition ignition;
  @Autowired
  private Wheel wheel;

  public void setCarDisplay(CarDisplay carDisplay) {
    this.carDisplay = carDisplay;
  }
  public void setIgnition(Ignition ignition) {
    this.ignition = ignition;
  }
  public void setWheel(Wheel wheel) {
    this.wheel = wheel;
  }

  public void manageCar() {
    ignition.activate();
    wheel.turn();
    carDisplay.show();
  }
}
