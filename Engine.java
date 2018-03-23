import enums.Destination;
import java.util.Random;

public class Engine extends Rocket {

    static int fuel;
    public Engine() {
        Nozzles nozzle = new Nozzles();
    }
    class Nozzles {
        public Nozzles() {
            Random genFuel = new Random(System.currentTimeMillis());
            fuel = genFuel.nextInt(10000);
        }

    }
}
