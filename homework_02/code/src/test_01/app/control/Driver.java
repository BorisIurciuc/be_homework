package test_01.app.control;

import test_01.app.car.CarDisplay;

public class Driver {

  private CarDisplay carDisplay;
  private Ignition ignition;
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
