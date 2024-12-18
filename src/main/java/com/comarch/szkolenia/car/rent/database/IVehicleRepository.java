package com.comarch.szkolenia.car.rent.database;

import com.comarch.szkolenia.car.rent.model.Vehicle;

import java.util.Collection;

public interface IVehicleRepository {
    boolean rent(String plate);
    Collection<Vehicle> getVehicles();
}
