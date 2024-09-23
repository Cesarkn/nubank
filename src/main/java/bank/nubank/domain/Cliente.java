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
public class Cliente {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45)
    private String fatorRisco;

    @Column(length = 45)
    private String rendaMensal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pessoa_id", nullable = false)
    private Pessoa pessoa;

    @OneToMany(mappedBy = "cliente")
    private Set<Conta> clienteContas;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getFatorRisco() {
        return fatorRisco;
    }

    public void setFatorRisco(final String fatorRisco) {
        this.fatorRisco = fatorRisco;
    }

    public String getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(final String rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(final Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Set<Conta> getClienteContas() {
        return clienteContas;
    }

    public void setClienteContas(final Set<Conta> clienteContas) {
        this.clienteContas = clienteContas;
    }

}
