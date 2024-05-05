package parkinglot.services;

import parkinglot.models.*;
import parkinglot.repositories.GateRepositories;
import parkinglot.repositories.VehicleRepository;
import parkinglot.strategies.spotassignmentstrategy.SpotAssignmentStrategies;

import java.sql.Date;
import java.sql.Time;

public class TicketService {
    VehicleRepository vehicleRepository;
    GateRepositories gateRepositories;
    SpotAssignmentStrategies spotAssignmentStrategies;
    public TicketService(VehicleRepository vehicleRepository, GateRepositories gateRepositories,
                         SpotAssignmentStrategies spotAssignmentStrategies){
        this.vehicleRepository = vehicleRepository;
        this.gateRepositories = gateRepositories;
        this.spotAssignmentStrategies = spotAssignmentStrategies;
    }
    public Ticket issueTicket(String vehicleNumber,String ownerName,Long operatorId,Long gateId) throws Exception {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(Time.valueOf(new Time(12,60,60).toLocalTime()));
        Gate gate = gateRepositories.findByGateId(gateId);
        if(gate==null){
            throw new Exception("Gate not found");
        }
        ticket.setGate(gate);
        Vehicle vehicle = vehicleRepository.findByVehicleNumber(vehicleNumber);
        if(vehicle==null){
            Vehicle vehicle1 = new Vehicle();
            vehicle1.setVehicleNumber(vehicleNumber);
            vehicle1.setVehicleOwner(new User());
            vehicleRepository.save(vehicleNumber,vehicle1);
            System.out.println("Vehicle entry successful");
        }
        ticket.setOperator(gate.getOperator());
        ParkingSpot spot = spotAssignmentStrategies.assignSpot();
        spot.setVehicle(vehicle);
        ticket.setParkingSpot(spot);
        return ticket;
    }
}
