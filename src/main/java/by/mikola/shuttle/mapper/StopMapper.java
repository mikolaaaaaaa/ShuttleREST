package by.mikola.shuttle.mapper;

import by.mikola.shuttle.dto.stop.StopCreateRequest;
import by.mikola.shuttle.dto.stop.StopDTO;
import by.mikola.shuttle.dto.stop.StopResponse;
import by.mikola.shuttle.entity.Route;
import by.mikola.shuttle.entity.Stop;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface StopMapper {
    Stop toEntity(StopDTO dto);

    @Mapping(target = "name", source = "createRequest.name")
    StopDTO toDto(StopCreateRequest createRequest, Route route);

    StopResponse toResponse(Stop stop);
}
