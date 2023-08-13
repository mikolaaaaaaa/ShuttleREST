package by.mikola.shuttle.controller.impl;

import by.mikola.shuttle.controller.ShuttleController;
import by.mikola.shuttle.dto.shuttle.ShuttleCreateRequest;
import by.mikola.shuttle.dto.shuttle.ShuttleResponse;
import by.mikola.shuttle.entity.Shuttle;
import by.mikola.shuttle.mapper.ShuttleMapper;
import by.mikola.shuttle.service.ShuttleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ShuttleControllerImpl implements ShuttleController {
    private final ShuttleService service;
    private final ShuttleMapper mapper;

    @Override
    public List<ShuttleResponse> getAllShuttles() {
        return service.getAllShuttles()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public ShuttleResponse getShuttleById(Long id) {
        return mapper.toResponse(service.getShuttleById(id));
    }

    @Override
    public ShuttleResponse addShuttle(ShuttleCreateRequest createRequest) {
        return mapper.toResponse(service.saveShuttle(mapper.toDto(createRequest)));
    }

    @Override
    public void deleteShuttle(Long id) {
        service.deleteShuttle(id);
    }
}
