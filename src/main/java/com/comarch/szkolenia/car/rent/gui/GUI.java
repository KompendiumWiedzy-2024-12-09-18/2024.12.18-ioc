package com.comarch.szkolenia.car.rent.gui;

import com.comarch.szkolenia.car.rent.database.IVehicleRepository;
import com.comarch.szkolenia.car.rent.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Scanner;

//@Component
public class GUI implements IGUI {
    private final Scanner scanner;
    private final IVehicleRepository vehicleRepository;

    public GUI(Scanner scanner, IVehicleRepository vehicleRepository) {
        this.scanner = scanner;
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public String showMenuAndReadChoose() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");

        return scanner.nextLine();
    }

    @Override
    public void listVehicles() {
        for(Vehicle vehicle : this.vehicleRepository.getVehicles()) {
            System.out.println(vehicle);
        }
    }

    @Override
    public String readPlate() {
        System.out.println("Enter plate:");

        return scanner.nextLine();
    }

    @Override
    public void showResult(boolean result) {
        System.out.println(result ? "Success !!" : "Error !!");
    }

    @Override
    public void showWrongChoose() {
        System.out.println("Wrong choose !");
    }
}
