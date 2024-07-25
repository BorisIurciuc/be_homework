package app.car.control;

import app.car.device.ignitionSystem.Engine;
import app.car.device.ignitionSystem.Radio;
import org.springframework.beans.factory.annotation.Autowired;
// зажигание
public class Ignition {
  @Autowired
  private Engine engine;
  @Autowired
  private Radio radio;


  public void setEngine(Engine engine) {
    this.engine = engine;
  }
  public void setRadio(Radio radio) {this.radio = radio;}


  public void activate() {
    engine.work();
    radio.work();
  }
}
