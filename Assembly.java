public final class Assembly {
    Engine engine = new Engine();
    Cockpit cockpit = new Cockpit();
    public void launch(int destination, int power, int mass) {
        cockpit.calculateDist(destination, power, mass);
    }

}

