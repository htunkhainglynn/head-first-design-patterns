package chapter1.startegy;

public class PublicTranspotationStrategy implements RouteStrategy {
    @Override
    public void buildRoute(int pointA, int pointB) {
        System.out.println("Building public transportation route from " + pointA + " to " + pointB);
    }
}
