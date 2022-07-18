package com.manabi.technology.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.manabi.technology.model.CalcSoma;
import com.manabi.technology.model.CalcUltimaRes;

@Repository
public interface CalcRepository extends JpaRepository<CalcSoma, CalcSoma> {
    @Query(" SELECT a FROM CalcSoma a")
    List<CalcSoma> findAll();
}
