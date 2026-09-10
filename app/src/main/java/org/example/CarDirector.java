package org.example;

public class CarDirector {
  private static final String racingCarBrand = "Ferrari";
  private static final String racingCarModel = "F1";
  private static final Double racingCarPrice = 2590000.0;
  private static final String regularCarBrand = "Mercedes";
  private static final String regularCarModel = "Benz";
  private static final Double regularCarPrice = 100000.0;

  public void makeRacingCar(CarBuilder builder) {
    builder.setBrand(racingCarBrand).setModel(racingCarModel).setPrice(racingCarPrice);
  }

  public void makeRegularCar(CarBuilder builder) {
    builder.setBrand(regularCarBrand).setModel(regularCarModel).setPrice(regularCarPrice);
  }
}
