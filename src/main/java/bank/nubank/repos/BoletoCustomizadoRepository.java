package bank.nubank.repos;

import bank.nubank.domain.BoletoCustomizado;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BoletoCustomizadoRepository extends JpaRepository<BoletoCustomizado, Integer> {
}
