package bank.nubank.repos;

import bank.nubank.domain.MovimentacaoConta;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MovimentacaoContaRepository extends JpaRepository<MovimentacaoConta, Integer> {
}
