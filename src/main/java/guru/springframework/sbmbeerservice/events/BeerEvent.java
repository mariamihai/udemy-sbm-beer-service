package guru.springframework.sbmbeerservice.events;

import guru.springframework.sbmbeerservice.web.model.BeerDto;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@Builder
public class BeerEvent implements Serializable {

    private static final long serialVersionUID = 28183077429554282L;

    private final BeerDto beerDto;
}
