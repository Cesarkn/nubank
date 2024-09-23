package bank.nubank.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.Set;


@Entity
public class CartaoCredito {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45)
    private String dtFechamento;

    @Column
    private Double limiteCredito;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "conta_id", nullable = false)
    private Conta conta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_cartao_id", nullable = false)
    private CategoriaCartao categoriaCartao;

    @OneToMany(mappedBy = "cartao")
    private Set<CartaoTransacao> cartaoCartaoTransacaos;

    @OneToMany(mappedBy = "cartaoCredito")
    private Set<FaturaCartao> cartaoCreditoFaturaCartaos;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getDtFechamento() {
        return dtFechamento;
    }

    public void setDtFechamento(final String dtFechamento) {
        this.dtFechamento = dtFechamento;
    }

    public Double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(final Double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(final Conta conta) {
        this.conta = conta;
    }

    public CategoriaCartao getCategoriaCartao() {
        return categoriaCartao;
    }

    public void setCategoriaCartao(final CategoriaCartao categoriaCartao) {
        this.categoriaCartao = categoriaCartao;
    }

    public Set<CartaoTransacao> getCartaoCartaoTransacaos() {
        return cartaoCartaoTransacaos;
    }

    public void setCartaoCartaoTransacaos(final Set<CartaoTransacao> cartaoCartaoTransacaos) {
        this.cartaoCartaoTransacaos = cartaoCartaoTransacaos;
    }

    public Set<FaturaCartao> getCartaoCreditoFaturaCartaos() {
        return cartaoCreditoFaturaCartaos;
    }

    public void setCartaoCreditoFaturaCartaos(final Set<FaturaCartao> cartaoCreditoFaturaCartaos) {
        this.cartaoCreditoFaturaCartaos = cartaoCreditoFaturaCartaos;
    }

}
