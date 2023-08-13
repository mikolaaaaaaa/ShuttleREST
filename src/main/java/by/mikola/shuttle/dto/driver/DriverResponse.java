package by.mikola.shuttle.dto.driver;

import lombok.Data;

@Data
public class DriverResponse {
    private Long id;
    private String name;
    private String email;
    private String phone;
}
