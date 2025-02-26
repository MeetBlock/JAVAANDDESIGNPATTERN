package DesignPattern.Strategy;

// Path calculator cases should be singleton as they don't have any other use cases
public class CarPathCalculator implements PathCalculator{
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path via car from "+ source + " to "+ destination);
    }
}
