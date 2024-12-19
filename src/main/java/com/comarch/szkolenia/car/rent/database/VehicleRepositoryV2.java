package com.comarch.szkolenia.car.rent.database;

import com.comarch.szkolenia.car.rent.model.Bus;
import com.comarch.szkolenia.car.rent.model.Car;
import com.comarch.szkolenia.car.rent.model.Motorcycle;
import com.comarch.szkolenia.car.rent.model.Vehicle;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleRepositoryV2 implements IVehicleRepository {
    private final Map<String, Vehicle> vehicles = new HashMap<>();

    public VehicleRepositoryV2() {
        this.vehicles.put("KR11000", new Car("BMW", "3", 2020, 300.0, "KR11000"));
        this.vehicles.put("KR22000", new Car("Honda", "Civic", 2022, 250.0, "KR22000"));
        this.vehicles.put("KR33000", new Car("Toyota", "Corolla", 2090, 150.0, "KR33000"));
        this.vehicles.put("KR44000", new Car("Kia", "Ceed", 2020, 200.0, "KR44000"));
        this.vehicles.put("KR55000", new Car("Fiat", "Multipla", 2005, 50.0, "KR55000"));
        this.vehicles.put("KR666000", new Bus("Solaris", "1000", 2001, 800.0, "KR666000", 50));
        this.vehicles.put("KR777000", new Bus("Solaris", "2000", 2015, 1000.0, "KR777000", 58));
        this.vehicles.put("KR888000", new Bus("Mercedes", "Jakis", 2020, 1200.0, "KR888000", 62));
        this.vehicles.put("KR9999000", new Motorcycle("Honda", "R1000", 2015, 400.0, "KR9999000", false));
    }

    @Override
    public boolean rent(String plate) {
        Vehicle v = this.vehicles.get(plate);
        if(v != null && !v.isRent()) {
            v.setRent(true);
            return true;
        }
        return false;
    }

    @Override
    public Collection<Vehicle> getVehicles() {
        return this.vehicles.values();
    }
}
