package by.mikola.shuttle.service.impl;

import by.mikola.shuttle.dto.RouteDTO;
import by.mikola.shuttle.entity.Route;
import by.mikola.shuttle.repository.RouteRepository;
import by.mikola.shuttle.service.RouteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RouteServiceImpl implements RouteService {

    private final RouteRepository routeRepository;

    @Override
    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    @Override
    public Route getRouteById(Long id) {
        return routeRepository.findById(id).orElse(null);
    }

    @Override
    public void saveRoute(RouteDTO route) {
        routeRepository.save(route);
    }

    @Override
    public void deleteRoute(Long id) {
        routeRepository.deleteById(id);
    }
}
