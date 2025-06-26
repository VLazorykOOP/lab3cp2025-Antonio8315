class MovingState implements VehicleState {
    @Override
    public void handleAction(Vehicle vehicle) {
        System.out.println(vehicle.getName() + " is moving.");
        vehicle.setState(new StoppedState());
    }
}
