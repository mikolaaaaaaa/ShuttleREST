package by.mikola.shuttle.dto;

import lombok.Data;

@Data
public class ShuttleDTO {
    private Long id;
    private String driver;
    private int capacity;
    private String licensePlate;
    private String model;
}
