package david.cardapiei_api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import david.cardapiei_api.domain.model.VendaItem;

public interface VendaItemRepository extends JpaRepository<VendaItem, Integer> {

}
