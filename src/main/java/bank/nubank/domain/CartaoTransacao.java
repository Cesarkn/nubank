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
public class CartaoTransacao {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 20)
    private String numeroCartao;

    @Column(length = 5)
    private String cvc;

    @Column(length = 45)
    private String tipoCartao;

    @Column
    private String nomeCartao;

    @Column(length = 45)
    private String tipoTransacao;

    @Column
    private Integer isInternacional;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cartao_id", nullable = false)
    private CartaoCredito cartao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bandeira_cartao_id", nullable = false)
    private BandeiraCartao bandeiraCartao;

    @OneToMany(mappedBy = "cartaoTransacao")
    private Set<MovimentacaoCartao> cartaoTransacaoMovimentacaoCartaos;

    @OneToMany(mappedBy = "cartaoTransacao")
    private Set<Compra> cartaoTransacaoCompras;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(final String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(final String cvc) {
        this.cvc = cvc;
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(final String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(final String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(final String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public Integer getIsInternacional() {
        return isInternacional;
    }

    public void setIsInternacional(final Integer isInternacional) {
        this.isInternacional = isInternacional;
    }

    public CartaoCredito getCartao() {
        return cartao;
    }

    public void setCartao(final CartaoCredito cartao) {
        this.cartao = cartao;
    }

    public BandeiraCartao getBandeiraCartao() {
        return bandeiraCartao;
    }

    public void setBandeiraCartao(final BandeiraCartao bandeiraCartao) {
        this.bandeiraCartao = bandeiraCartao;
    }

    public Set<MovimentacaoCartao> getCartaoTransacaoMovimentacaoCartaos() {
        return cartaoTransacaoMovimentacaoCartaos;
    }

    public void setCartaoTransacaoMovimentacaoCartaos(
            final Set<MovimentacaoCartao> cartaoTransacaoMovimentacaoCartaos) {
        this.cartaoTransacaoMovimentacaoCartaos = cartaoTransacaoMovimentacaoCartaos;
    }

    public Set<Compra> getCartaoTransacaoCompras() {
        return cartaoTransacaoCompras;
    }

    public void setCartaoTransacaoCompras(final Set<Compra> cartaoTransacaoCompras) {
        this.cartaoTransacaoCompras = cartaoTransacaoCompras;
    }

}
