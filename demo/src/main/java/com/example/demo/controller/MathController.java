package com.example.demo.controller;

import com.example.demo.entities.ArithmeticOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping()
    @ApiParam(value = "welcome msg print from MathController",required = false)
    public String welcomeMathMsg(){
        return "welcome from MathController";
    }
    @GetMapping("/division-info")
    @ApiParam(value = "print division info but return an entities",example = "ArithmeticOperation")
    public ArithmeticOperation printDivisionInfo(){
        return new ArithmeticOperation();
    }

    @PostMapping("/multiplication")
    @ApiParam(value = "int",allowableValues = "only integer",required = true,defaultValue = "0/null")
    public int printMultiplicationInfo(int integer,int integer2){
        return integer * integer2;
    }
    @GetMapping("square/{n}")
    @ApiParam(value = "int",allowableValues = "only int")
    public int printSquare(@PathVariable() int n){
        return n;
    }
}
