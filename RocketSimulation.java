public class RocketSimulation {
    public static void main(String[] args) {
        Assembly RocketX = new Assembly();
        RocketX.launch(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
    }
}
