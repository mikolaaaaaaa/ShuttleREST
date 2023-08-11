package by.mikola.shuttle.service.impl;

import by.mikola.shuttle.entity.Route;
import by.mikola.shuttle.repository.RouteRepository;
import by.mikola.shuttle.service.RouteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RouteServiceImpl implements RouteService {

  @Autowired private RouteRepository routeRepository;

  @Override
  public List<Route> getAllRoutes() {
    return routeRepository.findAll();
  }

  @Override
  public Route getRouteById(Long id) {
    return routeRepository.findById(id).orElse(null);
  }

  @Override
  public void saveRoute(Route route) {
    routeRepository.save(route);
  }

  @Override
  public void deleteRoute(Long id) {
    routeRepository.deleteById(id);
  }
}
