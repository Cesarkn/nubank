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
import java.time.OffsetDateTime;
import java.util.Set;


@Entity
public class BoletoCustomizado {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45)
    private String valor;

    @Column
    private OffsetDateTime dtVencimento;

    @Column
    private OffsetDateTime dtGeracao;

    @Column(length = 45)
    private String codigoBarras;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_boleto_customizado_id", nullable = false)
    private TipoBoletoCustomizado tipoBoletoCustomizado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fatura_cartao_id", nullable = false)
    private FaturaCartao faturaCartao;

    @OneToMany(mappedBy = "boletoCustomizado")
    private Set<Pagamento> boletoCustomizadoPagamentoes;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(final String valor) {
        this.valor = valor;
    }

    public OffsetDateTime getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(final OffsetDateTime dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public OffsetDateTime getDtGeracao() {
        return dtGeracao;
    }

    public void setDtGeracao(final OffsetDateTime dtGeracao) {
        this.dtGeracao = dtGeracao;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(final String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public TipoBoletoCustomizado getTipoBoletoCustomizado() {
        return tipoBoletoCustomizado;
    }

    public void setTipoBoletoCustomizado(final TipoBoletoCustomizado tipoBoletoCustomizado) {
        this.tipoBoletoCustomizado = tipoBoletoCustomizado;
    }

    public FaturaCartao getFaturaCartao() {
        return faturaCartao;
    }

    public void setFaturaCartao(final FaturaCartao faturaCartao) {
        this.faturaCartao = faturaCartao;
    }

    public Set<Pagamento> getBoletoCustomizadoPagamentoes() {
        return boletoCustomizadoPagamentoes;
    }

    public void setBoletoCustomizadoPagamentoes(final Set<Pagamento> boletoCustomizadoPagamentoes) {
        this.boletoCustomizadoPagamentoes = boletoCustomizadoPagamentoes;
    }

}
