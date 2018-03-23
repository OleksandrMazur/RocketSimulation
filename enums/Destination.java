package enums;

public enum Destination {
    SPACE(1, "Space"), MOON(384, "Moon"),
    MARS(54600, "Mars"), SUN(149000, "Sun");

    private int distance;
    private String name;

    Destination(int distance, String name) {
        this.distance = distance;
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }
}


