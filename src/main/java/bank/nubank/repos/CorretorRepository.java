package bank.nubank.repos;

import bank.nubank.domain.Corretor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CorretorRepository extends JpaRepository<Corretor, Integer> {
}
