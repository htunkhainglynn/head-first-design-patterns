package chapter1.startegy;

public class Application {

    public static void main(String[] args) {
        Nevigator nevigator = new Nevigator();
        nevigator.setRouteStrategy(new WalkingStrategy());
        nevigator.buildRoute(1, 2);
        nevigator.setRouteStrategy(new RoadStrategy());
        nevigator.buildRoute(1, 2);
    }
}
