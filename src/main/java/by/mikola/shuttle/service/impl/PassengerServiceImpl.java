package by.mikola.shuttle.service.impl;

import by.mikola.shuttle.entity.Passenger;
import by.mikola.shuttle.repository.PassengerRepository;
import by.mikola.shuttle.service.PassengerService;
import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PassengerServiceImpl implements PassengerService {

  @Autowired private PassengerRepository passengerRepository;
  Logger logger = LoggerFactory.getLogger(this.getClass());

  @Override
  public List<Passenger> getAllPassengers() {
      logger.info("{}",passengerRepository.findAll());
        return passengerRepository.findAll();
    }

    @Override
    public Passenger getPassengerById(Long id) {
        return passengerRepository.findById(id).orElse(null);
    }

    @Override
    public void savePassenger(Passenger passenger) {
        passengerRepository.save(passenger);
    }

    @Override
    public void deletePassenger(Long id) {
        passengerRepository.deleteById(id);
    }
}
