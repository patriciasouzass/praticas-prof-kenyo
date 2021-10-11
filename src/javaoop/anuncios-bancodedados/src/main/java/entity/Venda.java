package entity;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.*;

@Data
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
}
