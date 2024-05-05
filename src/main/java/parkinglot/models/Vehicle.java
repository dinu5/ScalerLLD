package parkinglot.models;

public class Vehicle extends BaseModel{
    private String vehicleNumber;
    private User vehicleOwner;
    private VehicleType vehicleType;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public User getVehicleOwner() {
        return vehicleOwner;
    }

    public void setVehicleOwner(User vehicleOwner) {
        this.vehicleOwner = vehicleOwner;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
