package by.mikola.shuttle.service.impl;

import by.mikola.shuttle.entity.Shuttle;
import by.mikola.shuttle.repository.ShuttleRepository;
import by.mikola.shuttle.service.ShuttleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShuttleServiceImpl implements ShuttleService {

    private final ShuttleRepository shuttleRepository;

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
