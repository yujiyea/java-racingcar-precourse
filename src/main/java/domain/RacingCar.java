package domain;

public class RacingCar {
    private final String name;
    private final int moveDistance;

    private RacingCar(String name){
        this.name = name;
        this.moveDistance = 0;
    }

    public static RacingCar from(String name){
        return new RacingCar(name);
    }
}
