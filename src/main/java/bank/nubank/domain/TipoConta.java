package bank.nubank.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;


@Entity
public class TipoConta {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45)
    private String descricao;

    @OneToMany(mappedBy = "tipoConta")
    private Set<Conta> tipoContaContas;

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

    public Set<Conta> getTipoContaContas() {
        return tipoContaContas;
    }

    public void setTipoContaContas(final Set<Conta> tipoContaContas) {
        this.tipoContaContas = tipoContaContas;
    }

}
