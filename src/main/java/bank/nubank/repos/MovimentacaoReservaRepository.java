package bank.nubank.repos;

import bank.nubank.domain.MovimentacaoReserva;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MovimentacaoReservaRepository extends JpaRepository<MovimentacaoReserva, Integer> {
}
