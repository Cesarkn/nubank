package bank.nubank.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BoletoCustomizadoResource {

    @GetMapping("/cliente/conta/boleto")
    public String index() {
        return "\"--Informações de boleto Customizado\"";
    }
}