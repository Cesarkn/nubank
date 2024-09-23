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
public class MovimentacaoConta {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45)
    private String valor;

    @Column
    private OffsetDateTime dtMovimentacao;

    @Column(length = 45)
    private String tipoMovimentacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "conta_id", nullable = false)
    private Conta conta;

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

    public OffsetDateTime getDtMovimentacao() {
        return dtMovimentacao;
    }

    public void setDtMovimentacao(final OffsetDateTime dtMovimentacao) {
        this.dtMovimentacao = dtMovimentacao;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(final String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(final Conta conta) {
        this.conta = conta;
    }

}
