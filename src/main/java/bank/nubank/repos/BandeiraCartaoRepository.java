package bank.nubank.repos;

import bank.nubank.domain.BandeiraCartao;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BandeiraCartaoRepository extends JpaRepository<BandeiraCartao, Integer> {
}
