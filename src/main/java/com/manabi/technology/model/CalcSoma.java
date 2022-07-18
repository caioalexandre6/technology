package com.manabi.technology.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "historico_soma")
public class CalcSoma {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO, generator="next_calc_val")
    @Column(name = "id")
    private Integer id;

    @Column(name = "f_numero")
    private Integer f_numero;

    @Column(name = "s_numero")
    private Integer s_numero;

    @Column(name = "resultado")
    private Integer resultado;

    @Column(name = "deleted")
    private String deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getF_numero() {
        return f_numero;
    }

    public void setF_numero(Integer f_numero) {
        this.f_numero = f_numero;
    }

    public Integer getS_numero() {
        return s_numero;
    }

    public void setS_numero(Integer s_numero) {
        this.s_numero = s_numero;
    }

    public Integer getResultado() {
        return resultado;
    }

    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

 

}
