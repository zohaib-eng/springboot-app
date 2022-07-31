package com.beblogy.pos.endPoints.services.impl;
import java.util.Scanner;


import com.beblogy.pos.endPoints.services.IOperatorService;
import org.springframework.stereotype.Service;

@Service
public class OperatorServiceImpl implements IOperatorService {

    @Override
    public int operator(int num1, int num2, String op) {

        int result = -1;

        if(op.equals("+")){
            result = num1 + num2;
        }
        else {
            System.out.println("error");
        }
        return result;

    }
}
