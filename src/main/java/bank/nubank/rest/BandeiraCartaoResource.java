package bank.nubank.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BandeiraCartaoResource {

    @GetMapping("/cliente/conta/cartao/bandeira")
    public String index() {
        return "\"Bandeira do Cartão:\n-Visa\n-Master Card\nELO\"";
    }
}