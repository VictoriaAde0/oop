package org.oop;

public class ExceptionHandling {
    public static class Mathcal {
        private static int addCount = 0;
        private static int multiplyCount = 0;

        public static int add(int a, int b) {
            addCount++;
            return a + b;
        }

        public static int multiply(int a, int b) {
            multiplyCount++;
            return a * b;
        }

        public static int getAddCount() {
            return addCount;
        }

        public static int getMultiplyCount() {
            return multiplyCount;
        }

        public static void main(String[] args) {

            int result1 = Mathcal.add(3, 4);
            int result2 = Mathcal.multiply(5, 6);
            int result3 = Mathcal.add(7, 8);


            System.out.println("Result 1: " + result1);
            System.out.println("Result 2: " + result2);
            System.out.println("Result 3: " + result3);


            System.out.println("Add count: " + Mathcal.getAddCount());
            System.out.println("Multiply count: " + Mathcal.getMultiplyCount());
        }
    }
}
