package by.mikola.shuttle.dto.stop;

import by.mikola.shuttle.dto.route.RouteResponse;
import lombok.Data;

@Data
public class StopResponse {
    private Long id;
    private String name;
    private Double latitude;
    private Double longitude;
    private RouteResponse route;
}
