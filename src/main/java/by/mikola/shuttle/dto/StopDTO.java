package by.mikola.shuttle.dto;

import lombok.Data;

@Data
public class StopDTO {
    private Long id;
    private String name;
    private double latitude;
    private double longitude;
}
