package org.oop;

public class Interface {
    interface Playable {
        void play();
    }

    static class Guitar implements Playable {
        @Override
        public void play() {
            System.out.println("Playing Guitar");
        }
    }
    static class Piano implements Playable {
        @Override
        public void play() {
            System.out.println("Playing Piano");
        }
    }

    public static class Main {
        public static void playInstrument(Playable instrument) {
            instrument.play();
        }

        public static void main(String[] args) {
            Guitar guitar = new Guitar();
            Piano piano = new Piano();

        }
    }
}
