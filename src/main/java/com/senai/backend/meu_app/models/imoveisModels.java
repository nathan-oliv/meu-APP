package com.senai.backend.meu_app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "imoveis")
public class imoveisModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_imovel")
    private Integer id;

    @Column(name = "valor_imovel", precision = 10, scale = 2)
    private BigDecimal valorImovel;

    @Column(name = "bairro_imovel", length = 100)
    private String bairroImovel;

    @ManyToOne
    @JoinColumn(name = "proprietario")
    private clienteModels proprietario;

    public imoveisModels() {
    }

    public imoveisModels(Integer id, BigDecimal valorImovel, String bairroImovel, clienteModels proprietario) {
        this.id = id;
        this.valorImovel = valorImovel;
        this.bairroImovel = bairroImovel;
        this.proprietario = proprietario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getValorImovel() {
        return valorImovel;
    }

    public void setValorImovel(BigDecimal valorImovel) {
        this.valorImovel = valorImovel;
    }

    public String getBairroImovel() {
        return bairroImovel;
    }

    public void setBairroImovel(String bairroImovel) {
        this.bairroImovel = bairroImovel;
    }

    public clienteModels getProprietario() {
        return proprietario;
    }

    public void setProprietario(clienteModels proprietario) {
        this.proprietario = proprietario;
    }
}