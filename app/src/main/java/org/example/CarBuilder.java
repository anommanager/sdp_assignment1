package org.example;

public interface CarBuilder {
  CarBuilder setBrand(String brand);

  CarBuilder setModel(String model);

  CarBuilder setPrice(double price);
}
