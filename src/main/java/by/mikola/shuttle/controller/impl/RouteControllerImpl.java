package by.mikola.shuttle.controller.impl;

import by.mikola.shuttle.controller.RouteController;
import by.mikola.shuttle.dto.route.RouteCreateRequest;
import by.mikola.shuttle.dto.route.RouteDTO;
import by.mikola.shuttle.dto.route.RouteResponse;
import by.mikola.shuttle.entity.Driver;
import by.mikola.shuttle.entity.Route;
import by.mikola.shuttle.mapper.RouteMapper;
import by.mikola.shuttle.service.DriverService;
import by.mikola.shuttle.service.RouteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RouteControllerImpl implements RouteController {
    private final RouteService routeService;
    private final DriverService driverService;
    private final RouteMapper mapper;

    @Override
    public List<RouteResponse> getAllRoutes() {
        return routeService.getAllRoutes()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public RouteResponse getRouteById(Long id) {
        return mapper.toResponse(routeService.getRouteById(id));
    }

    @Override
    public RouteResponse addRoute(RouteCreateRequest createRequest) {
        Driver driver = driverService.getDriverById(createRequest.getDriverId());
        RouteDTO routeDto = mapper.toDto(createRequest, driver);
        return mapper.toResponse(routeService.saveRoute(routeDto));
    }

    @Override
    public void deleteRoute(Long id) {
        routeService.deleteRoute(id);
    }
}
