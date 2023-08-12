package by.mikola.shuttle.service;

import by.mikola.shuttle.dto.PassengerDTO;
import by.mikola.shuttle.entity.Passenger;

import java.util.List;

public interface PassengerService {
    List<Passenger> getAllPassengers();

    Passenger getPassengerById(Long id);

    void savePassenger(PassengerDTO passenger);

    void deletePassenger(Long id);
}
