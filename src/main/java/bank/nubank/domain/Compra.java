package bank.nubank.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.OffsetDateTime;


@Entity
public class Compra {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Double valor;

    @Column
    private Integer quantidadeParcela;

    @Column
    private Double taxaParcelamento;

    @Column(length = 45)
    private String credor;

    @Column
    private OffsetDateTime dataCompra;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "corretor_id", nullable = false)
    private Corretor corretor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cartao_transacao_id", nullable = false)
    private CartaoTransacao cartaoTransacao;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(final Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidadeParcela() {
        return quantidadeParcela;
    }

    public void setQuantidadeParcela(final Integer quantidadeParcela) {
        this.quantidadeParcela = quantidadeParcela;
    }

    public Double getTaxaParcelamento() {
        return taxaParcelamento;
    }

    public void setTaxaParcelamento(final Double taxaParcelamento) {
        this.taxaParcelamento = taxaParcelamento;
    }

    public String getCredor() {
        return credor;
    }

    public void setCredor(final String credor) {
        this.credor = credor;
    }

    public OffsetDateTime getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(final OffsetDateTime dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public void setCorretor(final Corretor corretor) {
        this.corretor = corretor;
    }

    public CartaoTransacao getCartaoTransacao() {
        return cartaoTransacao;
    }

    public void setCartaoTransacao(final CartaoTransacao cartaoTransacao) {
        this.cartaoTransacao = cartaoTransacao;
    }

}
