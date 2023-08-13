package by.mikola.shuttle.dto.schedule;

import by.mikola.shuttle.entity.Route;
import lombok.Data;

@Data
public class ScheduleDTO {
    private String departureTime;
    private String arrivalTime;
    private Route route;
}
