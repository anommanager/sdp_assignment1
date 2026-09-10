package org.example;

public class CarModelBuilder implements CarBuilder {
  private String brand;
  private String model;
  private Double price;

  @Override
  public CarModelBuilder setBrand(String brand) {
    this.brand = brand;
    return this;
  }

  @Override
  public CarModelBuilder setModel(String model) {
    this.model = model;
    return this;
  }

  @Override
  public CarModelBuilder setPrice(double price) {
    this.price = price;
    return this;
  }

  public String getResult() {
    if (brand == null || model == null || price == null) {
      throw new IllegalStateException("brand, model, and price are required");
    }
    return String.format(
        "{\n\t\"representation\": \"3D Model\",\n\t\"brand\": \"%s\",\n\t\"model\": \"%s\",\n\t\"price\": %.2f\n}",
        brand, model, price);
  }
}
