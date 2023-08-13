package by.mikola.shuttle.service.impl;

import by.mikola.shuttle.dto.schedule.ScheduleDTO;
import by.mikola.shuttle.entity.Schedule;
import by.mikola.shuttle.exception.NotFoundException;
import by.mikola.shuttle.mapper.ScheduleMapper;
import by.mikola.shuttle.repository.ScheduleRepository;
import by.mikola.shuttle.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleRepository scheduleRepository;
    private final ScheduleMapper mapper;

    @Override
    public List<Schedule> getAllSchedules() {
        return scheduleRepository.findAll();
    }

    @Override
    public Schedule getScheduleById(Long id) {
        return scheduleRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Schedule with id %s not found".formatted(id)));
    }

    @Override
    public Schedule saveSchedule(ScheduleDTO scheduleDto) {
        Schedule schedule = mapper.toEntity(scheduleDto);
        return scheduleRepository.save(schedule);
    }

    @Override
    public void deleteSchedule(Long id) {
        scheduleRepository.deleteById(id);
    }
}
