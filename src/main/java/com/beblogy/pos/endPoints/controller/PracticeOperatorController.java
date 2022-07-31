package com.beblogy.pos.endPoints.controller;

import com.beblogy.pos.endPoints.services.IOperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeOperatorController {
    @Autowired
    IOperatorService operatorService;

    @GetMapping("/operator")
    public int operate(@RequestParam("op3") int num3, @RequestParam("n1") int num1,@RequestParam("n2") int num2){

        return operatorService.operator(num1,num2,Character.toString ((char) num3));
    }

}
