package guru.springframework.sbmbeerservice.bootstrap;

import guru.springframework.sbmbeerservice.domain.Beer;
import guru.springframework.sbmbeerservice.repositories.BeerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Slf4j
//@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public static final String BEER_1_UPC = "0631234200036";
    public static final String BEER_2_UPC = "0631234300019";
    public static final String BEER_3_UPC = "0083783375213";

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) {
        loadBeerObjects();
    }

    // Using data.sql for inserting initial data instead
    private void loadBeerObjects() {
        if(beerRepository.count() == 0) {
            Beer beer = beerRepository.save(Beer.builder()
                    .beerName("Beer 1")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(BEER_1_UPC)
                    .price(new BigDecimal("11"))
                    .build());
            log.debug("Saving 'Beer 1' - IPA - with upc and id: " + BEER_1_UPC + "   " + beer.getId());

            beer = beerRepository.save(Beer.builder()
                    .beerName("Beer 2")
                    .beerStyle("LAGER")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(BEER_2_UPC)
                    .price(new BigDecimal("11"))
                    .build());
            log.debug("Saving 'Beer 2' - LAGER - with upc and id: " + BEER_2_UPC + "   " + beer.getId());

            beer = beerRepository.save(Beer.builder()
                    .beerName("Beer 3")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(BEER_3_UPC)
                    .price(new BigDecimal("11"))
                    .build());
            log.debug("Saving 'Beer 3' - PALE_ALE - with upc and id: " + BEER_3_UPC + "   " + beer.getId());
        }
    }


}
