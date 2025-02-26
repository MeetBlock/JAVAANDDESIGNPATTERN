package DesignPattern.Strategy;
// Path calculator cases should be singleton as they don't have any other use cases

public class BikePathCalculator implements PathCalculator{
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path via bike from "+ source + " to "+ destination);
    }
}
