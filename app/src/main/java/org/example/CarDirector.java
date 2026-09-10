package org.example;

public class CarDirector {
  public void makeRacingCar(CarBuilder builder) {
    builder.setBrand("Ferrari").setModel("X1").setPrice(2590000);
  }

  public void makeRegularCar(CarBuilder builder) {
    builder.setBrand("Mercedes").setModel("Benz").setPrice(100000);
  }
}
