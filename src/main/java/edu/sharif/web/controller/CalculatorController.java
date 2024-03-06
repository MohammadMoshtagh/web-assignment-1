package edu.sharif.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/add")
    public int add(@RequestParam("x") int x, @RequestParam("y") int y) {
        return x + y;
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam("x") int x, @RequestParam("y") int y) {
        return x * y;
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam("x") int x, @RequestParam("y") int y) {
        return x - y;
    }

    @GetMapping("/divide")
    public float divide(@RequestParam("x") int x, @RequestParam("y") int y) {
        if (y == 0) {
            throw new ArithmeticException("Division by zero!");
        }

        return (float) x / y;
    }

}
