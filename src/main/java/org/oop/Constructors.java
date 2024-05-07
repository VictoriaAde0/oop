package org.oop;

public class Constructors {
    public static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Student() {
            this.name = "Unknown";
            this.age = 0;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public static void main(String[] args) {

            Student studentA = new Student("Billy", 17);
            Student studentB = new Student();


            System.out.println("Student 1:");
            System.out.println("Name: " + studentA.getName());
            System.out.println("Age: " + studentB.getAge());

            System.out.println("Student 2:");
            System.out.println("Name: " + studentA.getName());
            System.out.println("Age: " + studentB.getAge());
        }
    }
}
