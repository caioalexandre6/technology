package com.manabi.technology.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ultima_res")
public class CalcUltimaRes {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "ultima_res")
    private Integer ultima_res;

    @Column(name = "deleted")
    private String deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUltima_res() {
        return ultima_res;
    }

    public void setUltima_res(Integer ultima_res) {
        this.ultima_res = ultima_res;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

}
