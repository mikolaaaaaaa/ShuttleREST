package by.mikola.shuttle.service.impl;

import by.mikola.shuttle.dto.shuttle.ShuttleDTO;
import by.mikola.shuttle.entity.Shuttle;
import by.mikola.shuttle.exception.NotFoundException;
import by.mikola.shuttle.mapper.ShuttleMapper;
import by.mikola.shuttle.repository.ShuttleRepository;
import by.mikola.shuttle.service.ShuttleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShuttleServiceImpl implements ShuttleService {

    private final ShuttleRepository shuttleRepository;
    private final ShuttleMapper mapper;

    @Override
    public List<Shuttle> getAllShuttles() {
        return shuttleRepository.findAll();
    }

    @Override
    public Shuttle getShuttleById(Long id) {
        return shuttleRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Shuttle with id %s not found".formatted(id)));
    }

    @Override
    public Shuttle saveShuttle(ShuttleDTO shuttle) {
        return shuttleRepository.save(mapper.toEntity(shuttle));
    }

    @Override
    public void deleteShuttle(Long id) {
        shuttleRepository.deleteById(id);
    }
}
