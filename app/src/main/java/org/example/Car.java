package org.example;

public final class Car {
  private final String brand;
  private final String model;
  private final double price;

  Car(String brand, String model, double price) {
    this.brand = brand;
    this.model = model;
    this.price = price;
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "brand: " + brand + ", model: " + model + ", price: " + price + "$";
  }
}
