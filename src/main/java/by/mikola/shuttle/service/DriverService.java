package by.mikola.shuttle.service;

import by.mikola.shuttle.entity.Driver;

import java.util.List;

public interface DriverService {
    List<Driver> getAllDrivers();

    Driver getDriverById(Long id);
}
