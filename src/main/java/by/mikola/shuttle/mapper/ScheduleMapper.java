package by.mikola.shuttle.mapper;

import by.mikola.shuttle.dto.schedule.ScheduleCreateRequest;
import by.mikola.shuttle.dto.schedule.ScheduleDTO;
import by.mikola.shuttle.dto.schedule.ScheduleResponse;
import by.mikola.shuttle.entity.Route;
import by.mikola.shuttle.entity.Schedule;
import org.mapstruct.Mapper;

@Mapper
public interface ScheduleMapper {
    ScheduleDTO toDto(ScheduleCreateRequest scheduleCreateRequest, Route route);

    Schedule toEntity(ScheduleDTO scheduleDTO);

    ScheduleResponse toResponse(Schedule scheduleDTO);
}
