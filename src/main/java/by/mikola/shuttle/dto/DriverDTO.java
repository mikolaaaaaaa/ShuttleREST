package by.mikola.shuttle.dto;

import lombok.Data;

@Data
public class DriverDTO {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String licenseNumber;

}
