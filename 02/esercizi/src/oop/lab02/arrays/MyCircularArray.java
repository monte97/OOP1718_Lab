package oop.lab02.arrays;

public class MyCircularArray {

    public static final int ARRAY_DEF_SIZE = 10;
    int[] array;
    int lastInsertedPosition = 0;

    public MyCircularArray(int size){
        array = new int[size];
        reset();
    }

    public MyCircularArray(){
        array = new int[ARRAY_DEF_SIZE];
        reset();

    }

    public void add(final int elem) {

        if (lastInsertedPosition < array.length) {
            array[lastInsertedPosition++] = elem;
        } else { 
            lastInsertedPosition = 0;
            array[lastInsertedPosition++] = elem;
        }
        
    }

    public void reset() {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        lastInsertedPosition = 0;
    }

    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < this.array.length - 1; i++) {
            System.out.print(this.array[i] + ",");
        }
        System.out.print(this.array[this.array.length - 1] + "]");
    }

    public static void main(final String[] args) {
        /*
         * 1) Creare un array circolare di dieci elementi
         * 
         * 2) Aggiungere gli elementi da 1 a 10 e stampare il contenuto
         * dell'array circolare
         * 
         * 3) Aggiungere gli elementi da 11 a 15 e stampare il contenuto
         * dell'array circolare
         * 
         * 4) Invocare il metodo reset
         * 
         * 5) Stampare il contenuto dell'array circolare
         * 
         * 6) Aggiungere altri elementi a piacere e stampare il contenuto
         * dell'array circolare
         */
        MyCircularArray a = new MyCircularArray(10);
        for (int i = 0; i < 10; i++) {
            a.add(i + 1);
        }
        a.printArray();

        for (int i = 10; i < 15; i++) {
            a.add(i + 1);
        }
        a.printArray();

        a.reset();
        a.printArray();

        
        for (int i = 10; i < 15; i++) {
            a.add(i + 1);
        }
        a.printArray();


    }
}