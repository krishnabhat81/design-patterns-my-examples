package com.designpatterns.iterator;

import java.util.ArrayList;

/**
 * Created by krishna1bhat on 6/25/17.
 */
public class NameRepository implements Container {
    public String names[] = {"Krishna", "John", "Hari"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator{
        int index;
        @Override
        public boolean hasNext() {
            if(index < names.length)
                return true;
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext())
                return names[index++];
            return null;
        }
    }
}
