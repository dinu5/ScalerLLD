package parkinglot.strategies.spotassignmentstrategy;

import parkinglot.models.Floor;
import parkinglot.models.ParkingSpot;
import parkinglot.models.SpotStatus;

public class NearestSpotAssignment implements SpotAssignmentStrategies{
    @Override
    public ParkingSpot assignSpot() {
        ParkingSpot parkingSpot = new ParkingSpot();
        parkingSpot.setSpotNumber(01);
        parkingSpot.setFloor(new Floor());
        parkingSpot.setStatus(SpotStatus.OCCUPIED);
        return parkingSpot;
    }
}
