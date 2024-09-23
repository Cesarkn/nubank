package bank.nubank.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ItensFaturaResource {

    @GetMapping("/cliente/conta/cartao/fatura/itens")
    public String index() {
        return "\"Aqui está a fatura detalhada do cartao neste mes\"";
    }
}