package bank.nubank.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;


@Entity
public class CategoriaCartao {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45)
    private String descricao;

    @OneToMany(mappedBy = "categoriaCartao")
    private Set<CartaoCredito> categoriaCartaoCartaoCreditoes;

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

    public Set<CartaoCredito> getCategoriaCartaoCartaoCreditoes() {
        return categoriaCartaoCartaoCreditoes;
    }

    public void setCategoriaCartaoCartaoCreditoes(
            final Set<CartaoCredito> categoriaCartaoCartaoCreditoes) {
        this.categoriaCartaoCartaoCreditoes = categoriaCartaoCartaoCreditoes;
    }

}
