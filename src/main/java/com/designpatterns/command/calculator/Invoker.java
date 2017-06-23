package com.designpatterns.command.calculator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krishna1bhat on 6/23/17.
 */
public class Invoker {
    private int current;
    private List<Command> commands;

    Invoker(){
        this.current = -1;
        this.commands = new ArrayList<>();
    }

    public void Undo(){
        if(this.current >= 0){
            this.commands.get(this.current).UnExecute();
            this.current--;
        }
    }

    public void Compute(Command command){
        command.Execute();
        this.current++;
        this.commands.add(this.current, command);
    }
}
