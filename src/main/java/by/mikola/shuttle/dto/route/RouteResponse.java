package by.mikola.shuttle.dto.route;

import by.mikola.shuttle.dto.driver.DriverResponse;
import lombok.Data;

@Data
public class RouteResponse {
    private Long id;
    private String name;
    private Boolean isActive;
    private DriverResponse driver;
}
