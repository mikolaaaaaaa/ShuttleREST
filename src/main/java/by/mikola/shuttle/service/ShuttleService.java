package by.mikola.shuttle.service;

import by.mikola.shuttle.entity.Shuttle;
import java.util.List;

public interface ShuttleService {
  List<Shuttle> getAllShuttles();

  Shuttle getShuttleById(Long id);

  void saveShuttle(Shuttle shuttle);

  void deleteShuttle(Long id);
}
