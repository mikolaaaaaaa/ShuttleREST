package by.mikola.shuttle.dto.route;

import by.mikola.shuttle.entity.Driver;
import lombok.Data;

@Data
public class RouteUpdateRequest {
    private String name;
    private Boolean isActive;
    private Driver driver;
}
