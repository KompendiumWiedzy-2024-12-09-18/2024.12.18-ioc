package com.comarch.szkolenia.car.rent.core;

import com.comarch.szkolenia.car.rent.database.IVehicleRepository;
import com.comarch.szkolenia.car.rent.gui.IGUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Core {

    private final IVehicleRepository vehicleRepository;
    private final IGUI gui;

    public Core(IVehicleRepository vehicleRepository, IGUI gui) {
        this.vehicleRepository = vehicleRepository;
        this.gui = gui;
    }

    public void run() {
        boolean run = true;

        while(run) {
            switch(this.gui.showMenuAndReadChoose()) {
                case "1":
                    this.gui.listVehicles();
                    break;
                case "2":
                    this.gui.showResult(this.vehicleRepository.rent(this.gui.readPlate()));
                    break;
                case "3":
                    run = false;
                    break;
                default:
                    this.gui.showWrongChoose();
                    break;
            }
        }
    }

    /*@Autowired
    public void setVehicleRepository(IVehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Autowired
    public void setGui(IGUI gui) {
        this.gui = gui;
    }*/
}
