package it.unibo.oop.lab.mvcio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.Serializable;

/**
 * 
 */
public class Controller {

    private File currentFile;
    private final String sep = System.getProperty("file.separator");
    private final String hom = System.getProperty("user.home");
    private static final String FOL = "mvcio";
    private final File defaultFile = new File(hom + sep + FOL + "output.dat");
    /*
     * This class must implement a simple controller responsible of I/O access. It
     * considers a single file at a time, and it is able to serialize objects in it.
     * 
     * Implement this class in such a way that:
     * 
     * 1) It has a method for setting a File as current file
     * 
     * 2) It has a method for getting the current File
     * 
     * 3) It has a method for getting the path (in form of String) of the current
     * File
     * 
     * 4) It has a method that gets a Serializable as input and saves such Object in
     * the current file. Remember how to use the ObjectOutputStream. This method may
     * throw IOException.
     * 
     * 5) By default, the current file is "output.dat" inside the user home folder.
     * A String representing the local user home folder can be accessed using
     * System.getProperty("user.home"). The separator symbol (/ on *nix, \ on
     * Windows) can be obtained as String through the method
     * System.getProperty("file.separator"). The combined use of those methods leads
     * to a software that run correctly on every platform.
     */

    /** 
     * Default constructor, initialize with the default file.
     */
    public Controller() {
        this.currentFile = defaultFile;
    }
    /**
     * Assigns to the current file filed the given field.
     * @param f the file thats need to be assigned
     */
    public void setCurrentFile(final File f) {
        this.currentFile = (f == null) ? defaultFile : f;
    }

    /**
     * 
     * @return the current file.
     */
    public File getCurrentFile() {
        return this.currentFile;
    }

    /**
      * 
      * @return the current file path.
      */
    public String getPath() {
        return currentFile.getPath();
    }

   /**
    * This function writes the given serializzable object to the current file.
    * @param t a serilizzable object.
    * @param <T> a generic object that implements the Serializzable interface
    * @throws IOException in case of inaccesible file
    */
    public <T extends Serializable> void writeSerializzableToFile(final T t) throws IOException {
        try {
            final ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(this.currentFile));
            oos.writeObject(t);
            oos.close();
        } catch (IOException e) {
            throw new IOException();
        }
    }

}


