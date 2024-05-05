package parkinglot.controllers;

import parkinglot.dtos.IssueTicketReqDTO;
import parkinglot.dtos.TicketIssueResDTO;
import parkinglot.models.Ticket;
import parkinglot.models.TicketIssueStatus;
import parkinglot.services.TicketService;

public class TicketController {
    TicketService ticketService;
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }
    public TicketIssueResDTO issueTicket(IssueTicketReqDTO issueTicketReqDTO){
        TicketIssueResDTO ticketIssueResDTO = new TicketIssueResDTO();

        try{
            Ticket ticket = ticketService.issueTicket
                    (issueTicketReqDTO.getVehicleNumber(),issueTicketReqDTO.getOwnerName(),
                            issueTicketReqDTO.getOperatorId(),issueTicketReqDTO.getGateId());
            ticketIssueResDTO.setTicket(ticket);
            ticketIssueResDTO.setTicketIssueStatus(TicketIssueStatus.SUCCESS);

        }catch (Exception ex){
            System.out.println("Insufficient details");
            ticketIssueResDTO.setTicketIssueStatus(TicketIssueStatus.FAILURE);
        }
        return ticketIssueResDTO;
    }
}
