package by.mikola.shuttle.dto;

import lombok.Data;

@Data
public class RouteDTO {
    private Long id;
    private String name;
    private String description;
    private boolean isActive;
}
