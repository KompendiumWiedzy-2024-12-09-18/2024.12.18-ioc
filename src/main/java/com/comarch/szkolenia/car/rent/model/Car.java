package com.comarch.szkolenia.car.rent.model;

public class Car extends Vehicle {
    public Car(String brand, String model, int year, double price, String plate, boolean rent) {
        super(brand, model, year, price, plate, rent);
    }

    public Car(String brand, String model, int year, double price, String plate) {
        super(brand, model, year, price, plate);
    }

    public Car() {
    }
}
