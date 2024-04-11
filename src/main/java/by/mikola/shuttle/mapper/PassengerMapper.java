package by.mikola.shuttle.mapper;

import by.mikola.shuttle.dto.passenger.PassengerCreateRequest;
import by.mikola.shuttle.dto.passenger.PassengerDTO;
import by.mikola.shuttle.dto.passenger.PassengerResponse;
import by.mikola.shuttle.dto.passenger.PassengerUpdateRequest;
import by.mikola.shuttle.entity.Passenger;
import org.mapstruct.Mapper;

@Mapper
public interface PassengerMapper {
    Passenger toEntity(PassengerDTO dto);

    PassengerDTO toDto(PassengerCreateRequest createRequest);

    PassengerDTO toDto(PassengerUpdateRequest updateRequest);

    PassengerResponse toResponse(Passenger passenger);
}
