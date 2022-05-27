package ua.javabegin.alex;

import ua.javabegin.alex.Objects.Car;

public class Start {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Toyota");

        System.out.println("car.getName() =" + car.getName());


    }
}
