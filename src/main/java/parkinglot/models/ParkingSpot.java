package parkinglot.models;

import java.util.List;

public class ParkingSpot extends BaseModel{
    private int spotNumber;
    private Floor floor;
    private SpotStatus status;
    private Vehicle vehicle;
    private List<SupportedVehicles> supportedVehicles;
    public SpotStatus getStatus() {
        return status;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public void setStatus(SpotStatus status) {
        this.status = status;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public List<SupportedVehicles> getSupportedVehicles() {
        return supportedVehicles;
    }

    public void setSupportedVehicles(List<SupportedVehicles> supportedVehicles) {
        this.supportedVehicles = supportedVehicles;
    }


}
