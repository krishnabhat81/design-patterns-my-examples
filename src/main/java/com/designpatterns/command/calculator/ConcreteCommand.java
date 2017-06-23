package com.designpatterns.command.calculator;

/**
 * Created by krishna1bhat on 6/23/17.
 */
public class ConcreteCommand implements Command {

    private String operator;
    private int operand;
    private Calculator calculator;

    public ConcreteCommand(Calculator calculator, String operator, int operand) {
        this.operator = operator;
        this.operand = operand;
        this.calculator = calculator;
    }

    @Override
    public void Execute() {
        this.calculator.Action(operator, operand);
    }

    @Override
    public void UnExecute() {
        this.calculator.Action(this.undo(operator), this.operand);
    }

    private String undo(String operator){
        switch (operator){
            case "+": return "-";
            case "-": return "+";
            case "*": return "/";
            case "/": return "*";
            default: return "";
        }
    }
}