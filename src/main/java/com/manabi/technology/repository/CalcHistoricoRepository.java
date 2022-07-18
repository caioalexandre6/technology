package com.manabi.technology.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.manabi.technology.model.CalcUltimaRes;

@Repository
public interface CalcHistoricoRepository extends JpaRepository<CalcUltimaRes, CalcUltimaRes>{
    @Query(" SELECT a FROM CalcUltimaRes a WHERE a.id = :id")
    CalcUltimaRes findById(@Param("id") Integer id );
}
