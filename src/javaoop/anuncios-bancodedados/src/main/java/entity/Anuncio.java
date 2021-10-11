package entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "tbl_anuncios")
public class Anuncio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codigo;
    private String titulo;
    private BigDecimal preco;
    @Column(name = "data_anuncio")
    private LocalDate dataAnuncio;
    @Column(name = "num_vendas")
    private Integer numeroVendas;
    @ManyToOne
    @JoinColumn(name = "codigo_vendedor")
    private Vendedor vendedor;

    public Anuncio() {
    }

    public Anuncio(String codigo, String titulo, BigDecimal preco, LocalDate dataAnuncio, Integer numeroVendas, Vendedor vendedor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.preco = preco;
        this.dataAnuncio = dataAnuncio;
        this.numeroVendas = numeroVendas;
        this.vendedor = vendedor;
    }
}
