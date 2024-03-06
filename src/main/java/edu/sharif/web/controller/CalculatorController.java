package edu.sharif.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculatorController {

    @GetMapping("/sum")
    public String add(@RequestParam("x") int x, @RequestParam("y") int y) {
        return String.format("%d + %d = %d", x, y, x + y);
    }

    @GetMapping("/mult")
    public String multiply(@RequestParam("x") int x, @RequestParam("y") int y) {
        return String.format("%d * %d = %d", x, y, x * y);
    }

    @GetMapping("/subtract")
    public String subtract(@RequestParam("x") int x, @RequestParam("y") int y) {
        return String.format("%d - %d = %d", x, y, x - y);
    }

    @GetMapping("/div")
    public String divide(@RequestParam("x") int x, @RequestParam("y") int y) {
        if (y == 0) {
            throw new ArithmeticException("Division by zero!");
        }

        return String.format("%d / %d = %.2f", x, y, (float) x / y);
    }

}
