class StoppedState implements VehicleState {
    @Override
    public void handleAction(Vehicle vehicle) {
        System.out.println(vehicle.getName() + " is stopped.");
        vehicle.setState(new MovingState());
    }
}
