package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(initialValue = 1, allocationSize = 1, name = "seq_carro", sequenceName = "seq_carro")
@Table(name = "carros")
public class Automovel {

    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_carro")
    private int id;
    
    @Column(name = "ano_fabricacao")
    private Integer anoFabricacao;
    
    @Column(name = "ano_modelo")
    private Integer anoModelo;
    
    @Column(name = "preco")
    private Float preco;
    
    @Column(name = "kilometragem")
    private Float kilometragem;
    
    @Column(name = "observacoes")
    private String observacoes;
    
    @Column(name = "modelo")
    private String modelo;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Integer getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Integer anoModelo) {
        this.anoModelo = anoModelo;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Float getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(Float kilometragem) {
        this.kilometragem = kilometragem;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}