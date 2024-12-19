package com.comarch.szkolenia.car.rent.configuration;

import com.comarch.szkolenia.car.rent.core.Core;
import com.comarch.szkolenia.car.rent.database.IVehicleRepository;
import com.comarch.szkolenia.car.rent.database.VehicleRepository;
import com.comarch.szkolenia.car.rent.gui.GUI;
import com.comarch.szkolenia.car.rent.gui.IGUI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.Scanner;

@Configuration
@ComponentScan(basePackages = "com.comarch.szkolenia.car.rent")
//@ImportResource("beans.xml")
public class AppConfiguration {

    @Bean
    public IGUI igui(Scanner scanner, IVehicleRepository vehicleRepository) {
        return new GUI(scanner, vehicleRepository);
    }

    @Bean
    public IVehicleRepository vehicleRepository() {
        return new VehicleRepository();
    }

    @Bean
    public Core core(IVehicleRepository vehicleRepository, IGUI gui) {
        return new Core(vehicleRepository, gui);
    }
    
    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }
}
