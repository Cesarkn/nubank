package bank.nubank.repos;

import bank.nubank.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
}
