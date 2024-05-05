package parkinglot.dtos;

import parkinglot.models.Ticket;
import parkinglot.models.TicketIssueStatus;

public class TicketIssueResDTO {
    Ticket ticket;
    TicketIssueStatus ticketIssueStatus;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public TicketIssueStatus getTicketIssueStatus() {
        return ticketIssueStatus;
    }

    public void setTicketIssueStatus(TicketIssueStatus ticketIssueStatus) {
        this.ticketIssueStatus = ticketIssueStatus;
    }
}
