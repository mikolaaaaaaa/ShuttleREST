package by.mikola.shuttle.controller;

import by.mikola.shuttle.dto.passenger.PassengerCreateRequest;
import by.mikola.shuttle.dto.passenger.PassengerResponse;
import by.mikola.shuttle.dto.passenger.PassengerUpdateRequest;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1/passengers")
public interface PassengerController {

    @GetMapping
    List<PassengerResponse> getAllPassengers();

    @GetMapping("/{id}")
    PassengerResponse getPassengerById(@PathVariable Long id);

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    PassengerResponse addPassenger(@Valid @RequestBody PassengerCreateRequest createRequest);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deletePassenger(@PathVariable Long id);

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    PassengerResponse updatePassenger(@Valid @RequestBody PassengerUpdateRequest updateRequest);
}
