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
public class Pagamento {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45)
    private String valorTotal;

    @Column
    private OffsetDateTime dtPagamento;

    @Column(length = 45)
    private String valorParcial;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fatura_cartao_id", nullable = false)
    private FaturaCartao faturaCartao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "boleto_customizado_id", nullable = false)
    private BoletoCustomizado boletoCustomizado;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(final String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public OffsetDateTime getDtPagamento() {
        return dtPagamento;
    }

    public void setDtPagamento(final OffsetDateTime dtPagamento) {
        this.dtPagamento = dtPagamento;
    }

    public String getValorParcial() {
        return valorParcial;
    }

    public void setValorParcial(final String valorParcial) {
        this.valorParcial = valorParcial;
    }

    public FaturaCartao getFaturaCartao() {
        return faturaCartao;
    }

    public void setFaturaCartao(final FaturaCartao faturaCartao) {
        this.faturaCartao = faturaCartao;
    }

    public BoletoCustomizado getBoletoCustomizado() {
        return boletoCustomizado;
    }

    public void setBoletoCustomizado(final BoletoCustomizado boletoCustomizado) {
        this.boletoCustomizado = boletoCustomizado;
    }

}
