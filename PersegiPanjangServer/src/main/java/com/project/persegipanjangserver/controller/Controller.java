package com.project.persegipanjangserver.controller;

import com.project.persegipanjangserver.dto.InputDTO;
import com.project.persegipanjangserver.dto.OutputDTO;
import com.project.persegipanjangserver.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private CalcService calcService;
    @RequestMapping(value = "/calc", method = RequestMethod.POST)
    public ResponseEntity<OutputDTO> calculatorEndPoint(@RequestBody InputDTO input){
        double result = calcService.calculateResult(input);
        OutputDTO output = new OutputDTO();
        output.setA(input.getA());
        output.setB(input.getB());
        output.setJenisPerhitungan("PersegiPanjang");
        output.setResult(result);
        return ResponseEntity.ok(output);
    }
}
