package by.mikola.shuttle.dto;

import lombok.Data;

@Data
public class TicketDTO {
    private Long id;
    private PassengerDTO passenger;
    private ShuttleDTO shuttle;
    private String departureStop;
    private String destinationStop;
    private String departureTime;
    private String arrivalTime;
}
