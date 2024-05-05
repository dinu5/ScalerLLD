package parkinglot.models;

import java.util.List;

public class Parkinglot extends BaseModel{

    private List<Floor> floors;
    private List<Gate> gates;
    private List<SupportedVehicles> supportedVehicles;
    private Status status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<SupportedVehicles> getSupportedVehicles() {
        return supportedVehicles;
    }

    public void setSupportedVehicles(List<SupportedVehicles> supportedVehicles) {
        this.supportedVehicles = supportedVehicles;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
