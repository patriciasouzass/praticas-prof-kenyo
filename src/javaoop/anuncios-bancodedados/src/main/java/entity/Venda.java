package entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.*;


@Entity
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //informando ao RDBMS que o id será gerado automaticamente
    private Long id;
    private LocalDate data;
    private BigDecimal valorTotal;
    @Enumerated(EnumType.STRING)
    private FormaPagamento formaPagamento; // a vista ou a prazo
    @ManyToOne
    private Vendedor vendedor;
    @ManyToOne
    @JoinColumn(name = "codigo")
    private Anuncio anuncio;

    public Venda() {
    }

    public Venda(Long id, LocalDate data, BigDecimal valorTotal, FormaPagamento formaPagamento, Vendedor vendedor, Anuncio anuncio) {
        this.id = id;
        this.data = data;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
        this.vendedor = vendedor;
        this.anuncio = anuncio;
    }

    public Venda(LocalDate data, BigDecimal valorTotal, FormaPagamento formaPagamento, Vendedor vendedor, Anuncio anuncio) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
        this.vendedor = vendedor;
        this.anuncio = anuncio;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Anuncio getAnuncio() {
        return anuncio;
    }

    public void setAnuncio(Anuncio anuncio) {
        this.anuncio = anuncio;
    }
}
