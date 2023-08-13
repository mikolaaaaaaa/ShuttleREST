package by.mikola.shuttle.controller;

import by.mikola.shuttle.dto.schedule.ScheduleCreateRequest;
import by.mikola.shuttle.dto.schedule.ScheduleResponse;
import by.mikola.shuttle.entity.Schedule;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1/schedules")
public interface ScheduleController {

    @GetMapping
    List<ScheduleResponse> getAllSchedules();

    @GetMapping("/{id}")
    ScheduleResponse getScheduleById(@PathVariable Long id);

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Schedule addSchedule(@Valid @RequestBody ScheduleCreateRequest createRequest);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteSchedule(@PathVariable Long id);
}
