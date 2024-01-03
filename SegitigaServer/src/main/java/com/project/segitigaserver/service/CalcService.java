package com.project.segitigaserver.service;

import com.project.segitigaserver.dto.InputDTO;
import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public double calculateResult(InputDTO input){
        return input.getA() * input.getB() / 2;
    }
}
