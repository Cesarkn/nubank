package bank.nubank.repos;

import bank.nubank.domain.Compra;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CompraRepository extends JpaRepository<Compra, Integer> {
}
