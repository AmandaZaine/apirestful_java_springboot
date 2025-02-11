package com.amandazaine.service.impl;

import com.amandazaine.exceptions.UnsupportedMathOperationException;
import com.amandazaine.service.MathService;
import org.springframework.stereotype.Service;

import static com.amandazaine.util.NumberConverter.covertToDouble;
import static com.amandazaine.util.NumberConverter.isNumeric;

@Service
public class MathServiceImpl implements MathService {

    @Override
    public Double soma(String n1, String n2) {
        if (!isNumeric(n1) || !isNumeric(n2)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return covertToDouble(n1) + covertToDouble(n2);
    }

    @Override
    public Double subtracao(String n1, String n2) {
        if (!isNumeric(n1) || !isNumeric(n2)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return covertToDouble(n1) - covertToDouble(n2);
    }

    @Override
    public Double multiplicacao(String n1, String n2) {
        if (!isNumeric(n1) || !isNumeric(n2)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return covertToDouble(n1) * covertToDouble(n2);
    }

    @Override
    public Double divisao(String n1, String n2) {
        if (!isNumeric(n1) || !isNumeric(n2)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }

        if(covertToDouble(n2) == 0) {
            throw new UnsupportedMathOperationException("Divisão por zero não é permitida");
        }

        return covertToDouble(n1) / covertToDouble(n2);
    }

    @Override
    public Double media(String n1, String n2) {
        if (!isNumeric(n1) || !isNumeric(n2)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return (covertToDouble(n1) + covertToDouble(n2))/2;
    }

    @Override
    public Double raizQuadrada(String n1) {
        if (!isNumeric(n1)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return Math.sqrt(covertToDouble(n1));
    }
}
