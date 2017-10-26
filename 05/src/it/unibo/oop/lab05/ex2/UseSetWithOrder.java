package it.unibo.oop.lab05.ex2;

import java.util.Random;
import java.util.TreeSet;

/**
 * 
 */
public final class UseSetWithOrder {

    
	private final static int LIMIT = 1000;
    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Write a program which:
         * 
         * 1) Creates a new ORDERED TreeSet of Strings. To order the set, define
         * a new Comparator in a separate class.
         * 
         * 2) Inserts in the set a hundred strings containing randomly generated
         * numbers (use Math.random())
         * 
         * 3) Prints the set, which must be ordered
         */
    	
    	TreeSet<String> set = new TreeSet<>(new StringComparator());
    	
    	for(int i = 0; i < LIMIT; i++) {
    		set.add("" + new Random().nextInt(LIMIT));
    	}
    	
    	for (String val:set) {
    		System.out.println(val);
    	}
    	
    }
}
