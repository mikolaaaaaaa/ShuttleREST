package by.mikola.shuttle.service;

import by.mikola.shuttle.dto.StopDTO;
import by.mikola.shuttle.entity.Stop;

import java.util.List;

public interface StopService {
    List<Stop> getAllStops();

    Stop getStopById(Long id);

    void saveStop(StopDTO stop);

    void deleteStop(Long id);
}
