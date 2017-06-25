package com.designpatterns.iterator;

/**
 * Created by krishna1bhat on 6/25/17.
 */
public class IteratorPatternDemo {
    public static void main(String[] args){
        NameRepository nameRepository = new NameRepository();
        for(Iterator it = nameRepository.getIterator(); it.hasNext();){
            String name = (String) it.next();
            System.out.println(name);
        }
    }
}
