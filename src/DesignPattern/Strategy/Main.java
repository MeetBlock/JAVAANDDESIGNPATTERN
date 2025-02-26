package DesignPattern.Strategy;

public class Main {
    public static void main(String[] args) {
        Maps map = new Maps();
        map.findPath("Delhi", "UP",Mode.CAR);
        map.findPath("Delhi", "UP",Mode.WALK);
        map.findPath("Delhi", "UP",Mode.BIKE);
    }
}
