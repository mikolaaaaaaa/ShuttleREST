package by.mikola.shuttle.service;

import by.mikola.shuttle.dto.TicketDTO;
import by.mikola.shuttle.entity.Ticket;

import java.util.List;

public interface TicketService {
    List<Ticket> getAllTickets();

    Ticket getTicketById(Long id);

    void saveTicket(TicketDTO ticket);

    void deleteTicket(Long id);
}
