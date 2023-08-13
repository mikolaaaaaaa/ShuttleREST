package by.mikola.shuttle.service.impl;

import by.mikola.shuttle.dto.driver.DriverDTO;
import by.mikola.shuttle.entity.Driver;
import by.mikola.shuttle.exception.NotFoundException;
import by.mikola.shuttle.mapper.DriverMapper;
import by.mikola.shuttle.repository.DriverRepository;
import by.mikola.shuttle.service.DriverService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class DriverServiceImpl implements DriverService {

    private final DriverRepository driverRepository;
    private final DriverMapper mapper;

    @Override
    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    @Override
    public Driver getDriverById(Long id) {
        return driverRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Driver with id %s not found".formatted(id)));
    }

    @Override
    public Driver saveDriver(DriverDTO driver) {
        return driverRepository.save(mapper.toEntity(driver));
    }

    @Override
    public void deleteDriver(Long id) {
        driverRepository.deleteById(id);
    }
}
