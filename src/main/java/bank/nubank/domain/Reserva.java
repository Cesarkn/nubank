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
public class Reserva {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Double saldo;

    @Column
    private Double taxa;

    @Column(length = 45)
    private String reservacol;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "conta_id", nullable = false)
    private Conta conta;

    @OneToMany(mappedBy = "reserva")
    private Set<MovimentacaoReserva> reservaMovimentacaoReservas;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(final Double saldo) {
        this.saldo = saldo;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(final Double taxa) {
        this.taxa = taxa;
    }

    public String getReservacol() {
        return reservacol;
    }

    public void setReservacol(final String reservacol) {
        this.reservacol = reservacol;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(final Conta conta) {
        this.conta = conta;
    }

    public Set<MovimentacaoReserva> getReservaMovimentacaoReservas() {
        return reservaMovimentacaoReservas;
    }

    public void setReservaMovimentacaoReservas(
            final Set<MovimentacaoReserva> reservaMovimentacaoReservas) {
        this.reservaMovimentacaoReservas = reservaMovimentacaoReservas;
    }

}
