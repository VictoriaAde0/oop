package org.oop;

public class Method {
    static class Vehicle {
        public void drive() {
            System.out.println("Vehicle is moving");
        }

        public void drive(int speed) {
            System.out.println("Vehicle is moving at speed " + speed + " km/h");
        }

        public void drive(String destination) {
            System.out.println("Vehicle is driving to " + destination);
        }
    }

    static class Car extends Vehicle {
        @Override
        public void drive() {
            System.out.println("Car is moving");
        }
    }

    public static class Main {
        public static void main(String[] args) {

            Vehicle vehicle = new Vehicle();
            Car car = new Car();
        }
    }
}
