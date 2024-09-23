package bank.nubank.repos;

import bank.nubank.domain.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
}
