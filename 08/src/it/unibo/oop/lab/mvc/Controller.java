package it.unibo.oop.lab.mvc;

import java.util.List;

/**
 * 
 */
public interface Controller {

    /*
     * This interface must model a simple controller responsible of I/O access.
     * It considers only the standard output, and it is able to print on it.
     * 
     * Write the interface and implement it in a class class in such a way that
     * it includes:
     * 
     * 1) A method for setting the next string to print. Null values are not
     * acceptable, and an exception should be produced
     * 
     * 2) A method for getting the next string to print
     * 
     * 3) A method for getting the history of the printed strings (in form of a
     * List of Strings)
     * 
     * 4) A method that prints the current string. If the current string is
     * unset, an IllegalStateException should be thrown
     * 
     */

    /**
     * Set the next string to be used.
     * @param s The string to be assigned as the next string.
     * @throws IllegalArgumentException Should introduce a check on the argument
     */
    void setNextStringToPrint(String s) throws IllegalArgumentException;

    /**
     * 
     * @return The next string to print
     */
    String getNextStringToPrint();

    /**
     * 
     * @return The hisotry of the printed string in form of List 
     */
    List<String> getPrintedStringHistory();

    /**
     * Print the current string.
     * @throws IllegalStateException if the current string is not set
     */
    void printCurrentString() throws IllegalStateException;

}
