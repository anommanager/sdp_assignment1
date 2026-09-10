package org.example;

public class CarObjectBuilder implements CarBuilder {
  private String brand;
  private String model;
  private Double price;

  @Override
  public CarObjectBuilder setBrand(String brand) {
    this.brand = brand;
    return this;
  }

  @Override
  public CarObjectBuilder setModel(String model) {
    this.model = model;
    return this;
  }

  @Override
  public CarObjectBuilder setPrice(double price) {
    this.price = price;
    return this;
  }

  public Car getResult() {
    if (brand == null || model == null || price == null) {
      throw new IllegalStateException("brand, model, and price are required");
    }
    return new Car(brand, model, price);
  }
}
