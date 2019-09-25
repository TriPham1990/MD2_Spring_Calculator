package com.codegym.service.impl;

import com.codegym.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {
    private int result;
    @Override
    public int addition(int numberOne, int numberTwo) {
        result = numberOne + numberTwo;
        return result;
    }

    @Override
    public int subtraction(int numberOne, int numberTwo) {
        result = numberOne - numberTwo;
        return result;
    }

    @Override
    public int multiplication(int numberOne, int numberTwo) {
        result = numberOne * numberTwo;
        return result;
    }

    @Override
    public int division(int numberOne, int numberTwo) {
        result = numberOne / numberTwo;
        return result;
    }
}
