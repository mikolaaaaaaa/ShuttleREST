package by.mikola.shuttle.service;

import by.mikola.shuttle.dto.route.RouteDTO;
import by.mikola.shuttle.entity.Route;

import java.util.List;

public interface RouteService {
    List<Route> getAllRoutes();

    Route getRouteById(Long id);

    Route saveRoute(RouteDTO route);

    void deleteRoute(Long id);
}
