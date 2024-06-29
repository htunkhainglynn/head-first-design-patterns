package chapter1.startegy;

public class RoadStrategy implements RouteStrategy {
    @Override
    public void buildRoute(int pointA, int pointB) {
        System.out.println("Building road route from " + pointA + " to " + pointB);
    }
}
