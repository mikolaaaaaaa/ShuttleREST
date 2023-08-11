package by.mikola.shuttle.service;

import by.mikola.shuttle.entity.Passenger;import java.util.List;

public interface PassengerService {
  List<Passenger> getAllPassengers();

    Passenger getPassengerById(Long id);
    void savePassenger(Passenger passenger);
    void deletePassenger(Long id);
}

