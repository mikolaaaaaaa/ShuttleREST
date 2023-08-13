package by.mikola.shuttle.service;

import by.mikola.shuttle.dto.shuttle.ShuttleDTO;
import by.mikola.shuttle.entity.Shuttle;

import java.util.List;

public interface ShuttleService {
    List<Shuttle> getAllShuttles();

    Shuttle getShuttleById(Long id);

    Shuttle saveShuttle(ShuttleDTO shuttle);

    void deleteShuttle(Long id);
}
