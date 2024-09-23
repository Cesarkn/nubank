package bank.nubank.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CorretorResource {

    @GetMapping("/cliente/conta/cartao/compra/corretor")
    public String index() {
        return "\"Gostaria de corrigir a compra?\"";
    }
}