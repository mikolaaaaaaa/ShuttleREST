package by.mikola.shuttle.service;

import by.mikola.shuttle.dto.ticket.TicketDTO;
import by.mikola.shuttle.entity.Ticket;

import java.util.List;

public interface TicketService {
    List<Ticket> getAllTickets();

    Ticket getTicketById(Long id);

    Ticket saveTicket(TicketDTO ticket);

    void deleteTicket(Long id);
}
