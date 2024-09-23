package bank.nubank.repos;

import bank.nubank.domain.TipoConta;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TipoContaRepository extends JpaRepository<TipoConta, Integer> {
}
