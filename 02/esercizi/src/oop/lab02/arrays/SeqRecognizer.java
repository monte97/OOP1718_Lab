package oop.lab02.arrays;

public class SeqRecognizer {

    public static boolean checkSeq1(final int[] array) {
        int i = 0; //from the beginning of the array
        for (; i < array.length && array[i] == 1; i++); //look for a series of conscutive 1
        for (; i < array.length && (array[i] == 2 || array[i] == 3); i++); //the following numbers are 2 or 3?
        return i == array.length; //we are reached the end of the array?
    }

    
    public static boolean checkSeq2(final int[] array) {
        int i = 0;

        if (array[i] == 1) {
            i++;
        } else {
            return false;
        }

        for (; i < array.length && array[i] == 2; i++);

        if ( i == (array.length -1 ) && array[i] == 3) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkSeq3(final int[] array) {
        int i = 0;

        if (array.length < 2) {
            return false;
        }

        if (array[i] == 1) {
            i++;
        } else {
            return false;
        }

        for (; i < array.length && array[i] == 2; i++);

        //potrebbe anche essere l'ultimo elemento
        if ( i == (array.length - 1) && array[i] == 3){
            return true;
        } else if ( array[i] == 3) {
            i++;
        } else {
            return false;
        }

        for (; i < array.length && array[i] == 4; i++);

        //superati i 4 devo essere in ultima posizione
        if (i == (array.length - 1)) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean checkSeq4(int[] array) {
        int i = 0;
        for (; i < array.length && array[i] == 4; i++);
        if (array[i] == 5 && i == array.length){
            return true;
        } else {
            return false;
        }
    }
    /*
     * Utility method for testing checkSeq1 method
     */
    public static boolean testCheckSeq1() {
        return checkSeq1(new int[] { 1, 1 })
                && checkSeq1(new int[] { 1, 1, 1, 2 })
                && checkSeq1(new int[] { 1, 1, 1, 2, 3, 2, 3 })
                && !checkSeq1(new int[] { 1, 1, 1, 2, 3, 1, 3 })
                && !checkSeq1(new int[] { 3, 2, 1, 1 });
    }

    /*
     * Utility method for testing checkSeq2 method
     */
    public static boolean testCheckSeq2() {
        return checkSeq2(new int[] { 1, 3 })
                && checkSeq2(new int[] { 1, 2, 3 })
                && checkSeq2(new int[] { 1, 2, 2, 2, 2, 2, 2, 3 })
                && !checkSeq2(new int[] { 1, 2, 2 })
                && !checkSeq2(new int[] { 2, 2, 2, 2, 3 });
    }

    /*
     * Utility method for testing checkSeq3 method
     */
    public static boolean testCheckSeq3() {
        return checkSeq3(new int[] { 1, 3 })
                && checkSeq3(new int[] { 1, 3, 5 })
                && checkSeq3(new int[] { 1, 2, 2, 2, 2, 2, 2, 3 })
                && checkSeq3(new int[] { 1, 2, 3, 4, 5 })
                && checkSeq3(new int[] { 1, 2, 2, 3, 4, 4, 4, 5 })
                && !checkSeq3(new int[] { 2, 2, 3, 4, 4, 4 })
                && !checkSeq3(new int[] { 1, 2, 2, 3, 4, 4, 4, 5, 6 });
    }

    public static void main(final String[] args) {
        System.out.println("testCheckSeq1: " + testCheckSeq1());
        System.out.println("testCheckSeq2: " + testCheckSeq2());
        System.out.println("testCheckSeq3: " + testCheckSeq3());
    }
}