package by.mikola.shuttle.service.impl;

import by.mikola.shuttle.dto.stop.StopDTO;
import by.mikola.shuttle.entity.Stop;
import by.mikola.shuttle.exception.NotFoundException;
import by.mikola.shuttle.mapper.StopMapper;
import by.mikola.shuttle.repository.StopRepository;
import by.mikola.shuttle.service.StopService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StopServiceImpl implements StopService {

    private final StopRepository stopRepository;
    private final StopMapper mapper;

    @Override
    public List<Stop> getAllStops() {
        return stopRepository.findAll();
    }

    @Override
    public Stop getStopById(Long id) {
        return stopRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Stop with id %s not found".formatted(id)));
    }

    @Override
    public Stop saveStop(StopDTO stop) {
        return stopRepository.save(mapper.toEntity(stop));
    }

    @Override
    public void deleteStop(Long id) {
        stopRepository.deleteById(id);
    }
}
