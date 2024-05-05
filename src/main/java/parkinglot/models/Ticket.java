package parkinglot.models;

import java.sql.Time;

public class Ticket extends BaseModel{
    int number;
    Vehicle vehicle;
    Time entryTime;
    Gate gate;
    Operator operator;
    ParkingSpot parkingSpot;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Time getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Time entryTime) {
        this.entryTime = entryTime;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "number=" + number +
                ", vehicle=" + vehicle +
                ", entryTime=" + entryTime +
                ", gate=" + gate +
                ", operator=" + operator +
                ", parkingSpot=" + parkingSpot +
                '}';
    }
}
