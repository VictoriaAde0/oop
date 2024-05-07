package org.oop;

public class Abstraction {
    abstract static class Animal {
        abstract void eat();
        abstract void sound();
    }
    static class Dog extends Animal {
        @Override
        void eat() {
            System.out.println("Dog is wagging its tail");
        }
        @Override
        void sound() {
            System.out.println("Dog is barking loud");
        }
    }
    static class Cat extends Animal {
        @Override
        void eat() {
            System.out.println("Cat is asleep");
        }

        @Override
        void sound() {
            System.out.println("Cat is meowing");
        }
    }
    public static class Main {
        public void main(String[] args) {

            Dog dog = new Dog();
            Cat cat = new Cat();

            System.out.println("Dog:");
            dog.eat();
            dog.sound();

            System.out.println("Cat:");
            cat.eat();
            cat.sound();
        }
    }

}
