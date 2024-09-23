package bank.nubank.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClienteResource {

    @GetMapping("/cliente")
    public String index() {
        return "\"Fator de risco, renda mensal\"";
    }
}