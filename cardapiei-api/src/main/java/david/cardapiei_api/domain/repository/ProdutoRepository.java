package david.cardapiei_api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import david.cardapiei_api.domain.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
