package bank.nubank.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FaturaCartaoResource {

    @GetMapping("/cliente/conta/cartao/fatura")
    public String index() {
        return "\"Selecione o mes que deseja ver sua fatura!\"";
    }
}