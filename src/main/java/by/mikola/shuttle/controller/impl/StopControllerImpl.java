package by.mikola.shuttle.controller.impl;

import by.mikola.shuttle.controller.StopController;
import by.mikola.shuttle.dto.stop.StopCreateRequest;
import by.mikola.shuttle.dto.stop.StopDTO;
import by.mikola.shuttle.dto.stop.StopResponse;
import by.mikola.shuttle.entity.Route;
import by.mikola.shuttle.entity.Stop;
import by.mikola.shuttle.mapper.StopMapper;
import by.mikola.shuttle.service.RouteService;
import by.mikola.shuttle.service.StopService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StopControllerImpl implements StopController {
    private final StopService stopService;
    private final RouteService routeService;
    private final StopMapper mapper;

    @Override
    public List<StopResponse> getAllStops() {

        return stopService.getAllStops()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public StopResponse getStopById(Long id) {
        return mapper.toResponse(stopService.getStopById(id));
    }

    @Override
    public StopResponse addStop(StopCreateRequest createRequest) {
        Route route = routeService.getRouteById(createRequest.getRouteId());
        StopDTO stopDto = mapper.toDto(createRequest, route);
        return mapper.toResponse(stopService.saveStop(stopDto));
    }

    @Override
    public void deleteStop(Long id) {
        stopService.deleteStop(id);
    }
}
