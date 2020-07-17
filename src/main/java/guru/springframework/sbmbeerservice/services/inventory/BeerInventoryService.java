package guru.springframework.sbmbeerservice.services.inventory;

import java.util.Optional;
import java.util.UUID;

public interface BeerInventoryService {

    Optional<Integer> getOnHandInventory(UUID beerId);
}
