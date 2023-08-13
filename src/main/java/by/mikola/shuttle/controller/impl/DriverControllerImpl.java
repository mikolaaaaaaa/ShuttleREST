package by.mikola.shuttle.controller.impl;

import by.mikola.shuttle.controller.DriverController;
import by.mikola.shuttle.dto.driver.DriverCreateRequest;
import by.mikola.shuttle.dto.driver.DriverResponse;
import by.mikola.shuttle.entity.Driver;
import by.mikola.shuttle.mapper.DriverMapper;
import by.mikola.shuttle.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DriverControllerImpl implements DriverController {

    private final DriverService driverService;
    private final DriverMapper mapper;

    @Override
    public List<DriverResponse> getAllDrivers() {
        return driverService.getAllDrivers()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public DriverResponse getDriverById(Long id) {
        return mapper.toResponse(driverService.getDriverById(id));
    }

    @Override
    public Driver addDriver(DriverCreateRequest createRequest) {
        return driverService.saveDriver(mapper.toDto(createRequest));
    }

    @Override
    public void deleteDriver(Long id) {
        driverService.deleteDriver(id);
    }
}
