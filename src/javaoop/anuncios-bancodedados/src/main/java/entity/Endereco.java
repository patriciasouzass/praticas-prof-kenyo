package entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "codigo_vendedor")
    private Vendedor vendedor;
    private String cep;
    private String logradouro;
    private String complemento;
    private int numero;
    private String uf;
    private String cidade;

    public Endereco(){}

    public Endereco(String cep, String logradouro, String complemento, int numero, String uf, String cidade, Vendedor vendedor) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.numero = numero;
        this.uf = uf;
        this.cidade = cidade;
        this.vendedor = vendedor;
    }

    public Endereco(Long id, String cep, String logradouro, String complemento, int numero, String uf, String cidade) {
        this.id = id;
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.numero = numero;
        this.uf = uf;
        this.cidade = cidade;
        this.vendedor = vendedor;
    }
}
