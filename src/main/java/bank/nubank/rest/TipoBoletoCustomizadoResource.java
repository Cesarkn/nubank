package bank.nubank.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TipoBoletoCustomizadoResource {

    @GetMapping("/cliente/conta/boleto/tipo")
    public String index() {
        return "\"Qual tipo do boleto?\"";
    }
}

