package bank.nubank.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CartaoCreditoResource {

    @GetMapping("/cliente/conta/cartao")
    public String index() {
        return "\"Aqui Está as informações do seu cartão de credito:\"";
    }
}