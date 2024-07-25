package test_01.app.car.control;

import test_01.app.car.device.ignitionSystem.Engine;
import test_01.app.car.device.ignitionSystem.Radio;

public class Ignition {

  private Engine engine;
  private Radio radio;

  public void setEngine(Engine engine) {
    this.engine = engine;
  }
  public void setRadio(Radio radio) {
    this.radio = radio;
  }

  public void activate() {
    engine.work();
    radio.work();
  }
}
