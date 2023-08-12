package by.mikola.shuttle.service.impl;

import by.mikola.shuttle.entity.Stop;
import by.mikola.shuttle.repository.StopRepository;
import by.mikola.shuttle.service.StopService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StopServiceImpl implements StopService {

    private final StopRepository stopRepository;

    @Override
    public List<Stop> getAllStops() {
        return stopRepository.findAll();
    }

    @Override
    public Stop getStopById(Long id) {
        return stopRepository.findById(id).orElse(null);
    }

    @Override
    public void saveStop(Stop stop) {
        stopRepository.save(stop);
    }

    @Override
    public void deleteStop(Long id) {
        stopRepository.deleteById(id);
    }
}
