package david.cardapiei_api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import david.cardapiei_api.domain.model.Venda;

public interface VendaRepository extends JpaRepository<Venda, Integer> {

}
