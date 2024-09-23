package bank.nubank.repos;

import bank.nubank.domain.TipoBoletoCustomizado;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TipoBoletoCustomizadoRepository extends JpaRepository<TipoBoletoCustomizado, Integer> {
}
