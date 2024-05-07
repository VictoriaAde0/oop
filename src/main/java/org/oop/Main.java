package org.oop;

public class Main {

        public static void draw(drawShape[] drawShapes) {
            for (drawShape draw : drawShapes) {
                draw.draw();
            }
        }

        public static void main(String[] args) {
            circle circle = new circle();
            rectangle rectangle = new rectangle();
        }
    }

