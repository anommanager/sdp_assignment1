package org.example;

public class CarDirector {
  private static final String RACING_CAR_BRAND = "Ferrari";
  private static final String RACING_CAR_MODEL = "F1";
  private static final Double RACING_CAR_PRICE = 2590000.0;
  private static final String REGULAR_CAR_BRAND = "Mercedes-Benz";
  private static final String REGULAR_CAR_MODEL = "C Class";
  private static final Double REGULAR_CAR_PRICE = 100000.0;

  public void makeRacingCar(CarBuilder builder) {
    builder.setBrand(RACING_CAR_BRAND).setModel(RACING_CAR_MODEL).setPrice(RACING_CAR_PRICE);
  }

  public void makeRegularCar(CarBuilder builder) {
    builder.setBrand(REGULAR_CAR_BRAND).setModel(REGULAR_CAR_MODEL).setPrice(REGULAR_CAR_PRICE);
  }
}
