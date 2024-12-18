package com.comarch.szkolenia.car.rent.gui;

public interface IGUI {
    String showMenuAndReadChoose();
    void listVehicles();
    String readPlate();
    void showResult(boolean result);
    void showWrongChoose();
}
