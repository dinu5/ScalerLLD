package parkinglot;

import parkinglot.controllers.TicketController;
import parkinglot.dtos.IssueTicketReqDTO;
import parkinglot.dtos.TicketIssueResDTO;
import parkinglot.factory.SpotAssignmentStrategyFactory;
import parkinglot.models.Gate;
import parkinglot.models.SpotAssignmentType;
import parkinglot.repositories.GateRepositories;
import parkinglot.repositories.VehicleRepository;
import parkinglot.services.TicketService;
import parkinglot.strategies.spotassignmentstrategy.SpotAssignmentStrategies;

public class ParkingLotMainApplication {
    public static void main(String[] args) {
        VehicleRepository vehicleRepository = new VehicleRepository();
        GateRepositories gateRepositories = new GateRepositories();
        gateRepositories.save(123L,new Gate());
        SpotAssignmentStrategies spotAssignmentStrategies = SpotAssignmentStrategyFactory.getSpotAssignmentStrategy(SpotAssignmentType.NEAREST);

        TicketService ticketService = new TicketService(vehicleRepository,gateRepositories,spotAssignmentStrategies);
        TicketController ticketController = new TicketController(ticketService);
        IssueTicketReqDTO issueTicketReqDTO = new IssueTicketReqDTO();
        issueTicketReqDTO.setGateId(123L);
        issueTicketReqDTO.setOperatorId(321L);
        issueTicketReqDTO.setOwnerName("Dino");
        issueTicketReqDTO.setVehicleNumber("WB56T6561");
        TicketIssueResDTO ticketIssueResDTO =  ticketController.issueTicket(issueTicketReqDTO);
        System.out.println(ticketIssueResDTO.getTicketIssueStatus());
        System.out.println(ticketIssueResDTO.getTicket());
    }
}
