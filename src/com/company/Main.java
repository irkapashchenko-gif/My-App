package com.company;

public class Main {
    public static void main(String[] args) {
        // Створення об'єкта співробітника
        Employee employee = new Employee(
                "Іваненко Іван Іванович",
                "Java Developer",
                "ivanenko@example.com",
                "+380501234567",
                28
        );

        System.out.println("Співробітник: " + employee.getFullName() + ", посада: " + employee.getPosition());
        System.out.println("---");

        // Створення та запуск автомобіля
        Car car = new Car();
        car.start();
    }
}
