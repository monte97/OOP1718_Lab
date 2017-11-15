package it.unibo.oop.lab.mvc;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements the Contoller interface
 * 
 *
 */
class ControllerImpl implements Controller {

    private String current;
    private final List<String> history = new ArrayList<String>();

    @Override
    public void setNextStringToPrint(final String s) throws IllegalArgumentException {
       if (s == null) {
           throw new IllegalArgumentException();
       } else {
           this.current = s;
       }
    }

    @Override
    public String getNextStringToPrint() {
        return current;
    }

    @Override
    public List<String> getPrintedStringHistory() {
        return history;
    }

    @Override
    public void printCurrentString() throws IllegalStateException {
        this.history.add(this.current);
        System.out.println(this.current);
    }

}
