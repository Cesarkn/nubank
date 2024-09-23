package bank.nubank.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ContaResource {

    @GetMapping("/cliente/conta")
    public String index() {
        return "\"Esta é sua conta\"";
    }
}


