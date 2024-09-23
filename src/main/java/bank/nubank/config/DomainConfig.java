package bank.nubank.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("bank.nubank.domain")
@EnableJpaRepositories("bank.nubank.repos")
@EnableTransactionManagement
public class DomainConfig {
}
