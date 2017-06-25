package com.designpatterns.command.calculator;

/**
 * Created by krishna1bhat on 6/23/17.
 */
public class Main {
    public static void main(String args[]){

        Invoker user = new Invoker();
        Calculator calculator = new Calculator();

        //Addition
        Command command = new ConcreteCommand(calculator, "+", 3);
        user.Compute(command);
        System.out.println("+3: " + calculator.getCurrent());

        //Multiplication
        command = new ConcreteCommand(calculator, "*", 5);
        user.Compute(command);
        System.out.println("*5: " + calculator.getCurrent());

        //Subtraction
        command = new ConcreteCommand(calculator, "-", 3);
        user.Compute(command);
        System.out.println("-3: " + calculator.getCurrent());

        //Division
        command = new ConcreteCommand(calculator, "/", 2);
        user.Compute(command);
        System.out.println("/2: " + calculator.getCurrent());

    }
}
