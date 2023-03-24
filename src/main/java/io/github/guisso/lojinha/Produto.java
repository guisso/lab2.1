package io.github.guisso.lojinha;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe que representa um produto a ser comercializado pelo sistema
 * 
 * <pre>Produto p = new Produto();
 * p.setNome("Margarina 250g");
 * p.setPreco(new BigDecimal("5.99"));</pre>
 *
 * @author Luis Guisso &lt;luis.guisso at ifnmg.edu.br&gt;
 * @version 0.1
 * @see Compra
 * @since 0.1
 */
@Entity
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150, nullable = false)
    private String nome;

    // R$ 99.999,99
    @Column(nullable = false, precision = 7, scale = 2)
    private BigDecimal preco;

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="hashCode/equals/toString">
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
//        final Produto other = (Produto) obj;
//        return true;
        return this.hashCode() == obj.hashCode();
    }

    @Override
    public String toString() {
        return "Produto{"
                + "id=" + id
                + ", nome=" + nome
                + ", preco=" + preco
                + '}';
    }
    //</editor-fold>

}
