package bank.nubank.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PessoaResource {

    @GetMapping("/pessoa")
    public String index() {
        return "\"Nome/CPF da pessoa\"";
    }
}