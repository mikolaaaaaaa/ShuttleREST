package by.mikola.shuttle.controller.impl;

import by.mikola.shuttle.controller.TicketController;
import by.mikola.shuttle.dto.ticket.TicketCreateRequest;
import by.mikola.shuttle.dto.ticket.TicketDTO;
import by.mikola.shuttle.dto.ticket.TicketResponse;
import by.mikola.shuttle.entity.Passenger;
import by.mikola.shuttle.entity.Shuttle;
import by.mikola.shuttle.entity.Stop;
import by.mikola.shuttle.entity.Ticket;
import by.mikola.shuttle.mapper.TicketMapper;
import by.mikola.shuttle.service.PassengerService;
import by.mikola.shuttle.service.ShuttleService;
import by.mikola.shuttle.service.StopService;
import by.mikola.shuttle.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TicketControllerImpl implements TicketController {

    private final TicketService ticketService;
    private final StopService stopService;
    private final ShuttleService shuttleService;
    private final PassengerService passengerService;
    private final TicketMapper mapper;

    @GetMapping
    public List<TicketResponse> getAllTickets() {
        return ticketService.getAllTickets()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    @GetMapping("/{id}")
    public TicketResponse getTicketById(@PathVariable Long id) {

        return mapper.toResponse(ticketService.getTicketById(id));
    }

    @PostMapping
    public Ticket addTicket(@RequestBody TicketCreateRequest createRequest) {
        Passenger passenger = passengerService.getPassengerById(createRequest.getPassengerId());
        Shuttle shuttle = shuttleService.getShuttleById(createRequest.getShuttleId());
        Stop departureStop = stopService.getStopById(createRequest.getDepartureStopId());
        Stop destinationStop = stopService.getStopById(createRequest.getDestinationStopId());
        TicketDTO ticketDto = mapper.toDto(createRequest, passenger, shuttle, departureStop, destinationStop);
        return ticketService.saveTicket(ticketDto);
    }

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable Long id) {
        ticketService.deleteTicket(id);
    }
}
