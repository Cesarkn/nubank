package bank.nubank.repos;

import bank.nubank.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
