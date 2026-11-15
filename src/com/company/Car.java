package com.company;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Автомобіль успішно заведено!");
    }

    private void startElectricity() {
        System.out.println("Електросистему запущено.");
    }

    private void startCommand() {
        System.out.println("Бортовий комп'ютер активовано.");
    }

    private void startFuelSystem() {
        System.out.println("Паливну систему запущено.");
    }
}
