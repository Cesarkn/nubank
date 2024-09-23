package bank.nubank.repos;

import bank.nubank.domain.CartaoTransacao;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartaoTransacaoRepository extends JpaRepository<CartaoTransacao, Integer> {
}
