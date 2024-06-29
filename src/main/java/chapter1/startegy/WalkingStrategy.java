package chapter1.startegy;

public class WalkingStrategy implements RouteStrategy {
    @Override
    public void buildRoute(int pointA, int pointB) {
        System.out.println("Building walking route from " + pointA + " to " + pointB);
    }
}
