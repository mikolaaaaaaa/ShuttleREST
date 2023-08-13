package by.mikola.shuttle.mapper;

import by.mikola.shuttle.dto.route.RouteCreateRequest;
import by.mikola.shuttle.dto.route.RouteDTO;
import by.mikola.shuttle.dto.route.RouteResponse;
import by.mikola.shuttle.entity.Driver;
import by.mikola.shuttle.entity.Route;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface RouteMapper {
    Route toEntity(RouteDTO dto);

    @Mapping(target = "name", source = "createRequest.name")
    RouteDTO toDto(RouteCreateRequest createRequest, Driver driver);

    RouteResponse toResponse(Route route);
}
