package by.mikola.shuttle.service;

import by.mikola.shuttle.dto.ShuttleDTO;
import by.mikola.shuttle.entity.Shuttle;

import java.util.List;

public interface ShuttleService {
    List<Shuttle> getAllShuttles();

    Shuttle getShuttleById(Long id);

    void saveShuttle(ShuttleDTO shuttle);

    void deleteShuttle(Long id);
}
