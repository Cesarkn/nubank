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
public class FaturaCartao {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45)
    private String mesReferencia;

    @Column(length = 45)
    private String anoReferencia;

    @Column(length = 45)
    private String valor;

    @Column(length = 45)
    private String dataPagamento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cartao_credito_id", nullable = false)
    private CartaoCredito cartaoCredito;

    @OneToMany(mappedBy = "faturaCartao")
    private Set<ItensFatura> faturaCartaoItensFaturas;

    @OneToMany(mappedBy = "faturaCartao")
    private Set<BoletoCustomizado> faturaCartaoBoletoCustomizadoes;

    @OneToMany(mappedBy = "faturaCartao")
    private Set<Pagamento> faturaCartaoPagamentoes;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getMesReferencia() {
        return mesReferencia;
    }

    public void setMesReferencia(final String mesReferencia) {
        this.mesReferencia = mesReferencia;
    }

    public String getAnoReferencia() {
        return anoReferencia;
    }

    public void setAnoReferencia(final String anoReferencia) {
        this.anoReferencia = anoReferencia;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(final String valor) {
        this.valor = valor;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(final String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public CartaoCredito getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(final CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public Set<ItensFatura> getFaturaCartaoItensFaturas() {
        return faturaCartaoItensFaturas;
    }

    public void setFaturaCartaoItensFaturas(final Set<ItensFatura> faturaCartaoItensFaturas) {
        this.faturaCartaoItensFaturas = faturaCartaoItensFaturas;
    }

    public Set<BoletoCustomizado> getFaturaCartaoBoletoCustomizadoes() {
        return faturaCartaoBoletoCustomizadoes;
    }

    public void setFaturaCartaoBoletoCustomizadoes(
            final Set<BoletoCustomizado> faturaCartaoBoletoCustomizadoes) {
        this.faturaCartaoBoletoCustomizadoes = faturaCartaoBoletoCustomizadoes;
    }

    public Set<Pagamento> getFaturaCartaoPagamentoes() {
        return faturaCartaoPagamentoes;
    }

    public void setFaturaCartaoPagamentoes(final Set<Pagamento> faturaCartaoPagamentoes) {
        this.faturaCartaoPagamentoes = faturaCartaoPagamentoes;
    }

}
