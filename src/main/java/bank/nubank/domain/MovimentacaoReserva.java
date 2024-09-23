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
public class MovimentacaoReserva {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private OffsetDateTime dtMovimentacao;

    @Column
    private Double valor;

    @Column(length = 45)
    private String tipoMovimentacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reserva_id", nullable = false)
    private Reserva reserva;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public OffsetDateTime getDtMovimentacao() {
        return dtMovimentacao;
    }

    public void setDtMovimentacao(final OffsetDateTime dtMovimentacao) {
        this.dtMovimentacao = dtMovimentacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(final Double valor) {
        this.valor = valor;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(final String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(final Reserva reserva) {
        this.reserva = reserva;
    }

}
