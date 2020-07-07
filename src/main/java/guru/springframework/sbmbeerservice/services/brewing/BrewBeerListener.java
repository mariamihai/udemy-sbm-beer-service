package guru.springframework.sbmbeerservice.services.brewing;

import guru.springframework.sbmbeerservice.config.JmsConfig;
import guru.springframework.sbmbeerservice.domain.Beer;
import guru.springframework.sbmbeerservice.events.BrewBeerEvent;
import guru.springframework.sbmbeerservice.events.NewInventoryEvent;
import guru.springframework.sbmbeerservice.repositories.BeerRepository;
import guru.springframework.sbmbeerservice.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Component
public class BrewBeerListener {

    private final BeerRepository beerRepository;
    private final JmsTemplate jmsTemplate;

    @Transactional
    @JmsListener(destination = JmsConfig.BREWING_REQUEST_QUEUE)
    public void listen(BrewBeerEvent brewBeerEvent) {
        BeerDto beerDto = brewBeerEvent.getBeerDto();

        Beer beer = beerRepository.getOne(beerDto.getId());
        beerDto.setQuantityOnHand(beer.getQuantityToBrew());

        log.debug("Brewed " + beer.getQuantityToBrew() + " of beer " + beerDto.getId());

        jmsTemplate.convertAndSend(JmsConfig.NEW_INVENTORY_QUEUE, new NewInventoryEvent(beerDto));
    }
}
