package com.beblogy.pos.endPoints.services.impl;

import com.beblogy.pos.endPoints.services.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements ICalculatorService {

    @Override
    public int sum(int n1, int n2) {
        return n1 + n2;
    }
}
