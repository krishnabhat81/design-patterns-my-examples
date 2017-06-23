package com.designpatterns.command.calculator;

/**
 * Created by krishna1bhat on 6/23/17.
 */
public class Calculator {
    private int current;
    Calculator(){
        this.current = 0;
    }

    public void Action(String operator, int operand){
        switch (operator){
            case "+":
                this.current += operand;
                break;
            case "-":
                this.current -= operand;
                break;
            case "*":
                this.current *= operand;
                break;
            case "/":
                this.current /= operand;
                break;
            default: System.out.println("Invalid operator.");
        }
    }

    public int getCurrent(){
        return  this.current;
    }
}
