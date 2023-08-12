package by.mikola.shuttle.service;

import by.mikola.shuttle.dto.RouteDTO;
import by.mikola.shuttle.entity.Route;

import java.util.List;

public interface RouteService {
    List<Route> getAllRoutes();

    Route getRouteById(Long id);

    void saveRoute(RouteDTO route);

    void deleteRoute(Long id);
}
