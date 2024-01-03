package com.project.layanglayangserver.service;

import com.project.layanglayangserver.dto.InputDTO;
import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public double calculateResult(InputDTO input){
        return input.getA() * input.getB() / 2;
    }
}
