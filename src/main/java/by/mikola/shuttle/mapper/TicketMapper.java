package by.mikola.shuttle.mapper;

import by.mikola.shuttle.dto.ticket.TicketCreateRequest;
import by.mikola.shuttle.dto.ticket.TicketDTO;
import by.mikola.shuttle.dto.ticket.TicketResponse;
import by.mikola.shuttle.entity.Passenger;
import by.mikola.shuttle.entity.Shuttle;
import by.mikola.shuttle.entity.Stop;
import by.mikola.shuttle.entity.Ticket;
import org.mapstruct.Mapper;

@Mapper
public interface TicketMapper {
    Ticket toEntity(TicketDTO ticketDTO);

    TicketDTO toDto(TicketCreateRequest createRequest,
                    Passenger passenger,
                    Shuttle shuttle,
                    Stop departureStop,
                    Stop destinationStop);

    TicketResponse toResponse(Ticket ticket);
}
