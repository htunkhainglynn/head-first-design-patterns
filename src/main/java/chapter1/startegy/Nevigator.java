package chapter1.startegy;

public class Nevigator {

    private RouteStrategy routeStrategy;

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }
    public void buildRoute(int pointA, int pointB) {
        routeStrategy.buildRoute(pointA, pointB);
    }
}
