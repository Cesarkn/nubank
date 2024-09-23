package bank.nubank.repos;

import bank.nubank.domain.CartaoCredito;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartaoCreditoRepository extends JpaRepository<CartaoCredito, Integer> {
}
