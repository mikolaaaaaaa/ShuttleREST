package by.mikola.shuttle.dto.schedule;

import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.time.LocalTime;

@Data
public class ScheduleUpdateRequest {

    private LocalTime departureTime;
    private LocalTime arrivalTime;
}
