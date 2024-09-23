package bank.nubank.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CompraResource {

    @GetMapping("/cliente/conta/cartao/compra")
    public String index() {
        return "\"Compra realizada, Aqui está as informações\"";
    }
}