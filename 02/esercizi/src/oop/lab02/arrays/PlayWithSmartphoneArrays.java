package oop.lab02.arrays;

import oop.lab02.constructors.Smartphone;

public class PlayWithSmartphoneArrays {

    static int search(final Smartphone[] array, final String brand) {
        int count = 0;
        for (Smartphone s:array){
            if (s.brand.equals(brand)) {
                count ++;
            }
        }
        return count;
    }

    static int search(final Smartphone[] array, final boolean hasNFC, final boolean hasGPS) {
        int count = 0;
        for (Smartphone s:array){
            if (s.hasNFC == hasNFC && s.hasGPS == hasGPS {
                count ++;
            }
        }
    }

    static int search(final Smartphone[] array, final int nCPUs, final int sdSize, final boolean has3G) {
        int count = 0;
        for (Smartphone s:array){
            if (s.nCPUs == nCPUs && s.sdSize == sdSize && s.has3G == has3G) {
                count ++;
            }
        }
    }

    public static void main(final String[] args) {
        /*
         * 1) Creare lo smarthpone HTC One ram:1024 sdSize
         * 
         * 2) Creare lo smarthpone Samsung Galaxy Note 3 ram:2048 sdSize:8192
         * gps:true nfc:true 3g:true
         * 
         * 3) Creare lo smarthpone iPhone 5S nfc:false
         * 
         * 4) Creare lo smarthpone Google Nexus 4 gps:true 3g:true
         * 
         * 5) Creare lo smarthpone Acer Liquid cpu:2 ram:512 sdSize:8192 gps:
         * true 3g:true nfc: false
         * 
         * 6) Eseuguire diverse operazioni di ricerca con i metodi search
         * implementati e controllare la corrispondenza del numero dei telefoni
         * facenti match
         */
    }
}
