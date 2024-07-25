package test_01.app;

import test_01.app.car.device.CarDisplay;
import test_01.app.car.device.ignitionSystem.Engine;
import test_01.app.car.device.ignitionSystem.Radio;
import test_01.app.car.device.steerinSystem.SteeringSystem;
import test_01.app.car.control.Driver;
import test_01.app.car.control.Ignition;
import test_01.app.car.control.Wheel;

/**
 * 25/07/2024 be_homework * @author Boris Iurciuc (cohort36)
 */
public class Application {

  public static void main(String[] args) {

    CarDisplay carDisplay = new CarDisplay();

    Ignition ignition = new Ignition();
    Engine engine = new Engine();
    Radio radio = new Radio();
    ignition.setEngine(engine);
    ignition.setRadio(radio);

    Wheel wheel = new Wheel();
    SteeringSystem steeringSystem = new SteeringSystem();
    wheel.setSteeringSystem(steeringSystem);

    Driver driver = new Driver();
    driver.setIgnition(ignition);
    driver.setCarDisplay(carDisplay);
    driver.setWheel(wheel);

    driver.manageCar();
  }
}
