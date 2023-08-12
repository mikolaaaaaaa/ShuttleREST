package by.mikola.shuttle.dto;

import lombok.Data;

@Data
public class ScheduleDTO {
    private Long id;
    private String departureTime;
    private String arrivalTime;
}
