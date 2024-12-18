package com.comarch.szkolenia.car.rent.database;

import com.comarch.szkolenia.car.rent.model.Bus;
import com.comarch.szkolenia.car.rent.model.Car;
import com.comarch.szkolenia.car.rent.model.Motorcycle;
import com.comarch.szkolenia.car.rent.model.Vehicle;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class VehicleRepository implements IVehicleRepository {
    private final Map<String, Vehicle> vehicles = new HashMap<>();

    public VehicleRepository() {
        this.vehicles.put("KR11", new Car("BMW", "3", 2020, 300.0, "KR11"));
        this.vehicles.put("KR22", new Car("Honda", "Civic", 2022, 250.0, "KR22"));
        this.vehicles.put("KR33", new Car("Toyota", "Corolla", 2090, 150.0, "KR33"));
        this.vehicles.put("KR44", new Car("Kia", "Ceed", 2020, 200.0, "KR44"));
        this.vehicles.put("KR55", new Car("Fiat", "Multipla", 2005, 50.0, "KR55"));
        this.vehicles.put("KR666", new Bus("Solaris", "1000", 2001, 800.0, "KR666", 50));
        this.vehicles.put("KR777", new Bus("Solaris", "2000", 2015, 1000.0, "KR777", 58));
        this.vehicles.put("KR888", new Bus("Mercedes", "Jakis", 2020, 1200.0, "KR888", 62));
        this.vehicles.put("KR9999", new Motorcycle("Honda", "R1000", 2015, 400.0, "KR9999", false));
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
