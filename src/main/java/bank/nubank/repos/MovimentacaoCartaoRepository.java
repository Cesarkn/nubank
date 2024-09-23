package bank.nubank.repos;

import bank.nubank.domain.MovimentacaoCartao;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MovimentacaoCartaoRepository extends JpaRepository<MovimentacaoCartao, Integer> {
}
