package org.oop;

public class Car {
    private String brand;
    private String model;
    private int year;
    private boolean start;

    public void carttributes(String brand,String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.start = false;
    }

    public void Start() {
        if (!start) {
            start = true;
            System.out.println(brand + " " + model + " (" + year + ") started running.");
        }
    }
    public void Stop() {
        if(start) {
           start = false;
            System.out.println(brand + " " + model + " (" + year + ") stopped running.");
        }
    }

    public static void main(String[] args) {
        Car cA = new Car();
        cA.carttributes("Mercedes", "Maybach", 2024);

        Car cB = new Car();
        cB.carttributes("Ford", "GT", 2023);

        System.out.println("cA: " + cA.brand + " " + cA.model + " " + cA.year);
        System.out.println("cB: " + cB.brand + " " + cB.model + " " + cB.year);
    }
}
