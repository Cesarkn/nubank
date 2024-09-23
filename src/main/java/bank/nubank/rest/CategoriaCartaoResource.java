package bank.nubank.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CategoriaCartaoResource {

    @GetMapping("/cliente/conta/cartao/categoria")
    public String index() {
        return "\"A categoria do seu cartão é: (Platinum,Black,Ultravioleta)\"";
    }
}