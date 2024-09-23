package bank.nubank.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ReservaResource {

    @GetMapping("/cliente/conta/reserva")
    public String index() {
        return "\"Esta é sua reserva.\"";
    }
}

