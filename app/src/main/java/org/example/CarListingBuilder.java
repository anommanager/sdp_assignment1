package org.example;

import java.util.Locale;

public class CarListingBuilder implements CarBuilder {
  private static final String LISTING_TEMPLATE = "Car Listing\nBrand: %s\nModel: %s\nPrice: $%,.2f";

  private String brand;
  private String model;
  private Double price;

  @Override
  public CarListingBuilder setBrand(String brand) {
    this.brand = brand;
    return this;
  }

  @Override
  public CarListingBuilder setModel(String model) {
    this.model = model;
    return this;
  }

  @Override
  public CarListingBuilder setPrice(double price) {
    this.price = price;
    return this;
  }

  public String getResult() {
    if (brand == null || model == null || price == null) {
      throw new IllegalStateException("brand, model, and price are required");
    }
    return String.format(Locale.US, LISTING_TEMPLATE, brand, model, price);
  }
}
