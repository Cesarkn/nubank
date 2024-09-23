package bank.nubank.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PagamentoResource {

    @GetMapping("/cliente/conta/cartao/fatura/pagamento")
    public String index() {
        return "\"Gostaria de pagar sua fatura?\"";
    }
}

