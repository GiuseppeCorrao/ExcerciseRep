package com.example.demo.controller;

import com.example.demo.entities.ArithmeticOperation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping()
    @ApiParam(value = "welcome msg print from MathController", required = false)
    public String welcomeMathMsg() {
        return "welcome from MathController";
    }

    @GetMapping("/division-info")
    @ApiParam(value = "print division info but return an entities", example = "ArithmeticOperation")
    public ArithmeticOperation printDivisionInfo() {

        return new ArithmeticOperation(
                "division",
                2,
                "the division are the opposite of multipl.......",
                new String[]{"the properrties of division", "the prop of div"});
    }

    @PostMapping("/multiplication")
    @ApiParam(value = "int", allowableValues = "only integer", required = true, defaultValue = "0/null")
    public int printMultiplicationInfo(int integer, int integer2) {
        return integer * integer2;
    }

    @GetMapping("/square/{n}")
    @ApiOperation(value = "Square", notes = "Prints the result of the square from a number")
    public int printSquare(@PathVariable int n) {

        int result = (int) Math.sqrt(n);

        return result;
    }
}
