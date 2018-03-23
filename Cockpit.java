import interfaces.DistanceCalc;
import enums.Destination;

public class Cockpit extends Rocket implements DistanceCalc {
    public void calculateDist(int distance, int power, int mass) {
        distanceTraveled = (Engine.fuel * power) / mass;
        if (distanceTraveled > distance) {
            System.out.println("You have enough fuel reach your destination!");
        } else {
            System.out.println("Unfortunately, you have don't have enough fuel to reach your destination.");
            System.out.println("Please assemble another rocket.");
        }
        if (distanceTraveled > Destination.SUN.getDistance()) {
            System.out.println("You have enough fuel to reach Sun!");
        } else if (distanceTraveled > Destination.MARS.getDistance()) {
            System.out.println("You have enough fuel to reach Mars!");
        } else if (distanceTraveled > Destination.MOON.getDistance()) {
            System.out.println("You have enough fuel to reach Moon!");
        } else if (distanceTraveled > Destination.SPACE.getDistance()) {
            System.out.println("You have enough fuel to get into Earth's orbit and that's pretty much it.");
        }
    }
}

