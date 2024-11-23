package org.example;

import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");

        printResult(car);

        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());

        //Polymorphism. (upcasting ile mümkün hale gelir.)
        // Downcasting: Child'daki objeye kesin ulaşmamız gerektiğinde kullanırız.



        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

       printResult(car);

        Car ford = new Ford(6, "Ford Falcon");

      printResult(ford);

        Car holden = new Holden(6, "Holden Commodore");

        printResult(holden);
    }

    public static void printResult(Car car) {
        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());
    }
}