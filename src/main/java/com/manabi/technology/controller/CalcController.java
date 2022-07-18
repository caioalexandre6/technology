package com.manabi.technology.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.manabi.technology.model.CalcSoma;
import com.manabi.technology.model.CalcUltimaRes;
import com.manabi.technology.repository.CalcHistoricoRepository;
import com.manabi.technology.repository.CalcRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")

public class CalcController {

    @Autowired
    CalcRepository calcRepository;

    @Autowired
    CalcHistoricoRepository calcUltimaRepository;


    @PostMapping("/soma")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<CalcSoma> salvaSoma(@Valid @RequestBody CalcSoma calcSoma,
        HttpServletResponse response) {
        CalcUltimaRes calcUltimaSoma = calcUltimaRepository.findById(0);

        CalcUltimaRes calcUltimaRes = new CalcUltimaRes();
        calcUltimaRes.setId(0);


      calcSoma.setResultado(calcSoma.getF_numero() + calcSoma.getS_numero() + calcUltimaSoma.getUltima_res());
      calcUltimaRes.setUltima_res(calcSoma.getResultado());

      CalcSoma calcSomaSalva = calcSoma;
      CalcUltimaRes calcUltimaResSalva = calcUltimaRes;
  
      calcSomaSalva = calcRepository.save(calcSomaSalva);
      calcUltimaRepository.save(calcUltimaResSalva);
  
      return ResponseEntity.status(HttpStatus.CREATED).body(calcSomaSalva);
    }

    @GetMapping("/historico")
    public ResponseEntity<List<CalcSoma>> findAll() {
      try {
        List<CalcSoma> calcUltimaSoma = calcRepository.findAll();
        if (calcUltimaSoma.isEmpty()) {
          return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(calcUltimaSoma, HttpStatus.OK);
      } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }
    
}
