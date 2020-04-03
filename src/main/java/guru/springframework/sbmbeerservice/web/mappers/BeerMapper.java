package guru.springframework.sbmbeerservice.web.mappers;

import guru.springframework.sbmbeerservice.domain.Beer;
import guru.springframework.sbmbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto (Beer beer);
    Beer    beerDtoToBeer (BeerDto beerDto);
}
