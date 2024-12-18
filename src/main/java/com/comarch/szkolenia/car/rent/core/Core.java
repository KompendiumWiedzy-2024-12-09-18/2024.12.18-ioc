package com.comarch.szkolenia.car.rent.core;

import com.comarch.szkolenia.car.rent.database.IVehicleRepository;
import com.comarch.szkolenia.car.rent.gui.IGUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Core {

    @Autowired
    IVehicleRepository vehicleRepository;

    @Autowired
    IGUI gui;

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
}
