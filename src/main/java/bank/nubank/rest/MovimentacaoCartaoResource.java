package bank.nubank.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MovimentacaoCartaoResource {

    @GetMapping("/cliente/conta/cartao/transacao/movimentacao")
    public String index() {
        return "\"Esta é a movimentacao do seu cartao!\"";
    }
}