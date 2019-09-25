package com.codegym.controllers;

import com.codegym.service.CalculatorService;
import com.codegym.service.impl.CalculatorServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    private CalculatorService business = new CalculatorServiceImpl();

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/calculate")
    public String home(@RequestParam(name="firstOperand") int firstOperand,
                       @RequestParam(name="secondOperand") int secondOperand,
                       @RequestParam(name="operator") String operator,
                       Model model){
        int result = 0;
        switch (operator){
            case "+" :
                result = business.addition(firstOperand, secondOperand);
                operator = "Addition";
                break;
            case "-" :
                result = business.subtraction(firstOperand, secondOperand);
                operator = "Subtraction";
                break;
            case "*" :
                result = business.multiplication(firstOperand, secondOperand);
                operator = "Multiplication";
                break;
            case "/" :
                result = business.division(firstOperand, secondOperand);
                operator = "Division";
                break;
        }

        model.addAttribute("result", result);
        model.addAttribute("operator", operator);
        model.addAttribute("firstOperand", firstOperand);
        model.addAttribute("secondOperand", secondOperand);
        return "index";
    }
}
