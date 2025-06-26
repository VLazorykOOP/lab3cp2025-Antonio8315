class VehicleInfoAdapter implements VehicleDisplay {
    private final LegacyVehicleInfo legacy;
    private final String vehicleDetails;

    public VehicleInfoAdapter(LegacyVehicleInfo legacy, String vehicleDetails) {
        this.legacy = legacy;
        this.vehicleDetails = vehicleDetails;
    }

    @Override
    public String displayInfo() {
        return legacy.getInfo(vehicleDetails) + " [Modern Display]";
    }
}
