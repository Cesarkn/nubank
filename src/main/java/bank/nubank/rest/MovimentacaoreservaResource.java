package bank.nubank.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MovimentacaoreservaResource {

    @GetMapping("/cliente/conta/reserva/movimentacao")
    public String index() {
        return "\"Esta é a movimentacao da sua reserva\"";
    }
}

