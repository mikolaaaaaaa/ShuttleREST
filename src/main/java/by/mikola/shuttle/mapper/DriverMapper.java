package by.mikola.shuttle.mapper;

import by.mikola.shuttle.dto.driver.DriverCreateRequest;
import by.mikola.shuttle.dto.driver.DriverDTO;
import by.mikola.shuttle.dto.driver.DriverResponse;
import by.mikola.shuttle.entity.Driver;
import org.mapstruct.Mapper;

@Mapper
public interface DriverMapper {
    Driver toEntity(DriverDTO dto);

    DriverDTO toDto(DriverCreateRequest createRequest);

    DriverResponse toResponse(Driver driver);
}
