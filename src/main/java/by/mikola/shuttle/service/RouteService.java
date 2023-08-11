package by.mikola.shuttle.service;

import by.mikola.shuttle.entity.Route;
import java.util.List;

public interface RouteService {
  List<Route> getAllRoutes();

  Route getRouteById(Long id);

  void saveRoute(Route route);

  void deleteRoute(Long id);
}
