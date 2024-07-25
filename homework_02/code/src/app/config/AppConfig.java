package app.config;

import app.car.control.Driver;
import app.car.control.Ignition;
import app.car.control.Wheel;
import app.car.device.CarDisplay;
import app.car.device.ignitionSystem.Engine;
import app.car.device.ignitionSystem.Radio;
import app.car.device.steeringSystem.SteeringSystem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
  @Bean
  public Driver driver() {
    return new Driver();
  }
  @Bean
  public Ignition ignition() {
    return new Ignition();
  }
  @Bean
  public Wheel wheel() {
    return new Wheel();
  }
  @Bean
  public Engine engine() {
    return new Engine();
  }
  @Bean
  public Radio radio() {
    return new Radio();
  }

  @Bean
  public SteeringSystem steeringSystem() {
    return new SteeringSystem();
  }
  @Bean
  public CarDisplay carDisplay() {
    return new CarDisplay();
  }

}
