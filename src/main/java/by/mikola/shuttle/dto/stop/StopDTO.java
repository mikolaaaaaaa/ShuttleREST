package by.mikola.shuttle.dto.stop;

import by.mikola.shuttle.entity.Route;
import lombok.Data;

@Data
public class StopDTO {
    private String name;
    private Double latitude;
    private Double longitude;
    private Route route;
}
