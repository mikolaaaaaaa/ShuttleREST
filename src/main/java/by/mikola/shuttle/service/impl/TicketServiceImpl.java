package by.mikola.shuttle.service.impl;

import by.mikola.shuttle.dto.ticket.TicketDTO;
import by.mikola.shuttle.entity.Ticket;
import by.mikola.shuttle.exception.NotFoundException;
import by.mikola.shuttle.mapper.TicketMapper;
import by.mikola.shuttle.repository.TicketRepository;
import by.mikola.shuttle.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {
    private final TicketRepository ticketRepository;
    private final TicketMapper mapper;

    @Override
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket getTicketById(Long id) {
        return ticketRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Ticket with id %s not found".formatted(id)));
    }

    @Override
    public Ticket saveTicket(TicketDTO ticketDto) {
        Ticket ticket = mapper.toEntity(ticketDto);
        return ticketRepository.save(ticket);
    }

    @Override
    public void deleteTicket(Long id) {
        ticketRepository.deleteById(id);
    }
}
