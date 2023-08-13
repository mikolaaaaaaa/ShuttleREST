package by.mikola.shuttle.dto.ticket;

import by.mikola.shuttle.entity.Passenger;
import by.mikola.shuttle.entity.Shuttle;
import by.mikola.shuttle.entity.Stop;
import lombok.Data;

import java.time.LocalTime;

@Data
public class TicketDTO {
    private Passenger passenger;
    private Shuttle shuttle;
    private Stop departureStop;
    private Stop destinationStop;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
}
