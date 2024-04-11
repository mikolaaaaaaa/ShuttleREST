package by.mikola.shuttle.controller.impl;

import by.mikola.shuttle.controller.ScheduleController;
import by.mikola.shuttle.dto.schedule.ScheduleCreateRequest;
import by.mikola.shuttle.dto.schedule.ScheduleDTO;
import by.mikola.shuttle.dto.schedule.ScheduleResponse;
import by.mikola.shuttle.entity.Route;
import by.mikola.shuttle.mapper.ScheduleMapper;
import by.mikola.shuttle.service.RouteService;
import by.mikola.shuttle.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ScheduleControllerImpl implements ScheduleController {
    private final ScheduleService scheduleService;
    private final RouteService routeService;
    private final ScheduleMapper mapper;

    @Override
    public List<ScheduleResponse> getAllSchedules() {
        return scheduleService.getAllSchedules()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public ScheduleResponse getScheduleById(Long id) {
        return mapper.toResponse(scheduleService.getScheduleById(id));
    }

    @Override
    public ScheduleResponse addSchedule(ScheduleCreateRequest createRequest) {
        Route route = routeService.getRouteById(createRequest.getRouteId());
        ScheduleDTO scheduleDto = mapper.toDto(createRequest, route);
        return mapper.toResponse(scheduleService.saveSchedule(scheduleDto));
    }

    @Override
    public void deleteSchedule(Long id) {
        scheduleService.deleteSchedule(id);
    }
}
