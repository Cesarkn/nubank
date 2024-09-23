package bank.nubank.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;


@Entity
public class TipoBoletoCustomizado {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45)
    private String descricao;

    @OneToMany(mappedBy = "tipoBoletoCustomizado")
    private Set<BoletoCustomizado> tipoBoletoCustomizadoBoletoCustomizadoes;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(final String descricao) {
        this.descricao = descricao;
    }

    public Set<BoletoCustomizado> getTipoBoletoCustomizadoBoletoCustomizadoes() {
        return tipoBoletoCustomizadoBoletoCustomizadoes;
    }

    public void setTipoBoletoCustomizadoBoletoCustomizadoes(
            final Set<BoletoCustomizado> tipoBoletoCustomizadoBoletoCustomizadoes) {
        this.tipoBoletoCustomizadoBoletoCustomizadoes = tipoBoletoCustomizadoBoletoCustomizadoes;
    }

}
