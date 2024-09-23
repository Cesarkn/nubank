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
public class Conta {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Double saldo;

    @Column
    private Double limiteNegativo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_conta_id", nullable = false)
    private TipoConta tipoConta;

    @OneToMany(mappedBy = "conta")
    private Set<Reserva> contaReservas;

    @OneToMany(mappedBy = "conta")
    private Set<MovimentacaoConta> contaMovimentacaoContas;

    @OneToMany(mappedBy = "conta")
    private Set<CartaoCredito> contaCartaoCreditoes;

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

    public Double getLimiteNegativo() {
        return limiteNegativo;
    }

    public void setLimiteNegativo(final Double limiteNegativo) {
        this.limiteNegativo = limiteNegativo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(final Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(final TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Set<Reserva> getContaReservas() {
        return contaReservas;
    }

    public void setContaReservas(final Set<Reserva> contaReservas) {
        this.contaReservas = contaReservas;
    }

    public Set<MovimentacaoConta> getContaMovimentacaoContas() {
        return contaMovimentacaoContas;
    }

    public void setContaMovimentacaoContas(final Set<MovimentacaoConta> contaMovimentacaoContas) {
        this.contaMovimentacaoContas = contaMovimentacaoContas;
    }

    public Set<CartaoCredito> getContaCartaoCreditoes() {
        return contaCartaoCreditoes;
    }

    public void setContaCartaoCreditoes(final Set<CartaoCredito> contaCartaoCreditoes) {
        this.contaCartaoCreditoes = contaCartaoCreditoes;
    }

}
