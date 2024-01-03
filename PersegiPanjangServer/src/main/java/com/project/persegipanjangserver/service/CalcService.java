package com.project.persegipanjangserver.service;

import com.project.persegipanjangserver.dto.InputDTO;
import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public double calculateResult(InputDTO input){
        return input.getA() * input.getB();
    }
}
