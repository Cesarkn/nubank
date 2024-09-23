package bank.nubank.repos;

import bank.nubank.domain.Conta;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContaRepository extends JpaRepository<Conta, Integer> {
}
