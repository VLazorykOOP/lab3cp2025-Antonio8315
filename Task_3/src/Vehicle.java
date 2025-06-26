class Vehicle {
    private final String name;
    private final String engine;
    private VehicleState state;

    public Vehicle(String name, VehicleFactory factory) {
        this.name = name;
        this.engine = factory.createEngine();
        this.state = new StoppedState(); // Initial state
    }

    public void performAction() {
        state.handleAction(this);
    }

    public void setState(VehicleState state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return name + " [Engine: " + engine + "]";
    }
}
