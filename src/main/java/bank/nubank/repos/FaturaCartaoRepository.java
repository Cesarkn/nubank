package bank.nubank.repos;

import bank.nubank.domain.FaturaCartao;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FaturaCartaoRepository extends JpaRepository<FaturaCartao, Integer> {
}
