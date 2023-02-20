package pl.javastart.task;

public class Televisor {
    boolean power = true;

    void turnOn() {
        power = true;
    }

    void turnOff() {
        power = false;
    }

    void showStatus() {
        System.out.println("Czy tv jest włączony: " + power);
    }
}
