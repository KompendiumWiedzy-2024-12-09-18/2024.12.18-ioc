package com.comarch.szkolenia.car.rent.model;

public class Motorcycle extends Vehicle {
    private boolean additionalSeat;

    public Motorcycle(String brand, String model, int year, double price, String plate, boolean rent, boolean additionalSeat) {
        super(brand, model, year, price, plate, rent);
        this.additionalSeat = additionalSeat;
    }

    public Motorcycle(String brand, String model, int year, double price, String plate, boolean additionalSeat) {
        super(brand, model, year, price, plate);
        this.additionalSeat = additionalSeat;
    }

    public Motorcycle() {
    }

    public boolean isAdditionalSeat() {
        return additionalSeat;
    }

    public void setAdditionalSeat(boolean additionalSeat) {
        this.additionalSeat = additionalSeat;
    }

    @Override
    public String toString() {
        return super.toString() + " dodatkowe miejsce: " + (this.additionalSeat ? "Tak" : "Nie");
    }
}
