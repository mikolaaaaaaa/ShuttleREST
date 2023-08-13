package by.mikola.shuttle.service;

import by.mikola.shuttle.dto.schedule.ScheduleDTO;
import by.mikola.shuttle.entity.Schedule;

import java.util.List;

public interface ScheduleService {
    List<Schedule> getAllSchedules();

    Schedule getScheduleById(Long id);

    Schedule saveSchedule(ScheduleDTO schedule);

    void deleteSchedule(Long id);
}
