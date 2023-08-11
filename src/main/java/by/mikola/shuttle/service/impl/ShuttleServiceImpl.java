package by.mikola.shuttle.service.impl;

import by.mikola.shuttle.entity.Shuttle;
import by.mikola.shuttle.repository.ShuttleRepository;
import by.mikola.shuttle.service.ShuttleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShuttleServiceImpl implements ShuttleService {

  @Autowired private ShuttleRepository shuttleRepository;

  @Override
  public List<Shuttle> getAllShuttles() {
    return shuttleRepository.findAll();
  }

  @Override
  public Shuttle getShuttleById(Long id) {
    return shuttleRepository.findById(id).orElse(null);
  }

  @Override
  public void saveShuttle(Shuttle shuttle) {
    shuttleRepository.save(shuttle);
  }

  @Override
  public void deleteShuttle(Long id) {
    shuttleRepository.deleteById(id);
  }
}
