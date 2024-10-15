package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estufa")
public class EstufaEntity {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nome_estufa", nullable = false)
    private String nomeEstufa;
    
    @Column(name = "nome_planta", nullable = false)
    private String nomePlanta;
    
    @Column(name = "temperatura_max")
    private Double temperaturaMax;
    
    @Column(name = "temperatura_min")
    private Double temperaturaMin;
    
    @Column(name = "umidade_max")
    private Double umidadeMax;
    
    @Column(name = "umidade_min")
    private Double umidadeMin;
    
    @Column(name = "quantidade_lumens")
    private Integer quantidadeLumens;
    
    @Column(name = "estufa_selecionada")
    private boolean estufaSelecionada = false;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeEstufa() {
        return nomeEstufa;
    }

    public void setNomeEstufa(String nomeEstufa) {
        this.nomeEstufa = nomeEstufa;
    }

    public String getNomePlanta() {
        return nomePlanta;
    }

    public void setNomePlanta(String nomePlanta) {
        this.nomePlanta = nomePlanta;
    }

    public Double getTemperaturaMax() {
        return temperaturaMax;
    }

    public void setTemperaturaMax(Double temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    public Double getTemperaturaMin() {
        return temperaturaMin;
    }

    public void setTemperaturaMin(Double temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }

    public Double getUmidadeMax() {
        return umidadeMax;
    }

    public void setUmidadeMax(Double umidadeMax) {
        this.umidadeMax = umidadeMax;
    }

    public Double getUmidadeMin() {
        return umidadeMin;
    }

    public void setUmidadeMin(Double umidadeMin) {
        this.umidadeMin = umidadeMin;
    }

    public Integer getQuantidadeLumens() {
        return quantidadeLumens;
    }

    public void setQuantidadeLumens(Integer quantidadeLumens) {
        this.quantidadeLumens = quantidadeLumens;
    }

    public boolean isEstufaSelecionada() {
        return estufaSelecionada;
    }

    public void setEstufaSelecionada(boolean estufaSelecionada) {
        this.estufaSelecionada = estufaSelecionada;
    }
    
}
