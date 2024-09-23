package bank.nubank.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CartaoTransacaoResource {

    @GetMapping("/cliente/conta/cartao/transacao")
    public String index() {
        return "\"Transacao realizada com cartao!\"";
    }
}
