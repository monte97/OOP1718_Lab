package it.unibo.oop.lab05.ex1;

import java.util.Set;
import java.util.TreeSet;

import org.omg.CORBA.TRANSACTION_REQUIRED;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each construct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    	
    	final TreeSet<String> treeset = new TreeSet<>();
    	for (int i = 1; i <= 20; i++) {
    		treeset.add(Integer.toString(i));
    	}
    	System.out.println(treeset);
    	
    	/*Wrong! can't use remove while iterating over on object
    	for(String val:treeset) {
    		if (Integer.parseInt(val) % 3 == 0) {
    			treeset.remove(val);
    		}
    	}
    	*/
    	
    	for (int i = 3; i <= 17; i+=3) {
    		treeset.remove(Integer.toString(i));
    	}
    	
    	for (String val:treeset) {
    		System.out.println(val);
    	}

        bool allEven = true;
        for (String val:treeset) {
            if (Strings.parseInt(val) % 2 != 0 ) {
                allEven = false;
            }
        }
    }
}
