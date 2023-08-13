package by.mikola.shuttle.service;

import by.mikola.shuttle.dto.driver.DriverDTO;
import by.mikola.shuttle.entity.Driver;

import java.util.List;

public interface DriverService {
    List<Driver> getAllDrivers();

    Driver getDriverById(Long id);

    Driver saveDriver(DriverDTO driverDto);

    void deleteDriver(Long id);
}
