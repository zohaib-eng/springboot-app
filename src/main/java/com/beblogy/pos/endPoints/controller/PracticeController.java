package com.beblogy.pos.endPoints.controller;

import com.beblogy.pos.endPoints.services.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController {

    @Autowired
    ICalculatorService calculatorService;

    @GetMapping("/sum")
    public int doSum(@RequestParam("no1") int n1, @RequestParam("no2") int n2) {
        return calculatorService.sum(n1,n2);
    }

}
