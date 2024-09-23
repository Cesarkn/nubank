package bank.nubank.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TipoContaResource {

    @GetMapping("/cliente/tipoconta")
    public String index() {
        return "\"Qual tipo da conta?\"";
    }
}

