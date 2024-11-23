package org.example.company;

import java.util.Objects;

    public class Car {
        private boolean engine;
        private int cylinders;
        private String name;
        private  int wheels;

     public Car(int cylinders,String name){
        this.name = name;
        this.cylinders = cylinders;
        this.engine = Boolean.TRUE;
        this.wheels = 4;
    }


    public void printSimpleName(){
         System.out.println("Class Name: "+ getClass().getSimpleName());
    }

    public String accelerate(){
         printSimpleName();
         return "the car is accelerating";
     }
     public String brake(){
         printSimpleName();
         return "the car is braking";
        }
     public String startEngine(){
         printSimpleName();
         return "the car's engine is starting";
        }


    public String getName(){
        return name;
    }
    public int getCylinders(){
        return cylinders;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cylinders, name);
    }

        @Override
        public String toString() {
            return "Car{" +
                    "engine=" + engine +
                    ", cylinders=" + cylinders +
                    ", name='" + name + '\'' +
                    ", wheels=" + wheels +
                    '}';
        }
    }

