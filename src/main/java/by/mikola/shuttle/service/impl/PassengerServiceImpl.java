package by.mikola.shuttle.service.impl;

import by.mikola.shuttle.dto.passenger.PassengerDTO;
import by.mikola.shuttle.entity.Passenger;
import by.mikola.shuttle.exception.NotFoundException;
import by.mikola.shuttle.mapper.PassengerMapper;
import by.mikola.shuttle.repository.PassengerRepository;
import by.mikola.shuttle.service.PassengerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PassengerServiceImpl implements PassengerService {

    private final PassengerRepository passengerRepository;
    private final PassengerMapper mapper;

    @Override
    public List<Passenger> getAllPassengers() {
        log.info("{}", passengerRepository.findAll());
        return passengerRepository.findAll();
    }

    @Override
    public Passenger getPassengerById(Long id) {
        return passengerRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Passenger with id %s not found".formatted(id)));
    }

    @Override
    public Passenger savePassenger(PassengerDTO passenger) {
        return passengerRepository.save(mapper.toEntity(passenger));
    }

    @Override
    public void deletePassenger(Long id) {
        passengerRepository.deleteById(id);
    }
}
