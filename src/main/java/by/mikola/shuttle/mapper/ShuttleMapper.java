package by.mikola.shuttle.mapper;

import by.mikola.shuttle.dto.shuttle.ShuttleCreateRequest;
import by.mikola.shuttle.dto.shuttle.ShuttleDTO;
import by.mikola.shuttle.dto.shuttle.ShuttleResponse;
import by.mikola.shuttle.entity.Shuttle;
import org.mapstruct.Mapper;

@Mapper
public interface ShuttleMapper {
    Shuttle toEntity(ShuttleDTO dto);

    ShuttleDTO toDto(ShuttleCreateRequest createRequest);

    ShuttleResponse toResponse(Shuttle shuttle);
}
