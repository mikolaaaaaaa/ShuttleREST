package by.mikola.shuttle.service.impl;

import by.mikola.shuttle.entity.Driver;
import by.mikola.shuttle.exception.NotFoundException;
import by.mikola.shuttle.repository.DriverRepository;
import by.mikola.shuttle.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DriverServiceImpl implements DriverService {
    private final DriverRepository driverRepository;

    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    public Driver getDriverById(Long id) {
        return driverRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Driver with %s not found".formatted(id)));
    }

}
