package it.unibo.oop.lab.advanced;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.StringTokenizer;

/**
 */
public class DrawNumberApp implements DrawNumberViewObserver {

    private static final int MIN = 0;
    private static final int MAX = 100;
    private static final int ATTEMPTS = 10;
    private final DrawNumber model;
    private final DrawNumberView view;

    /**
     * 
     */
    public DrawNumberApp() {
        this.model = new DrawNumberImpl(MIN, MAX, ATTEMPTS);
        this.view = new DrawNumberViewImpl();
        this.view.setObserver(this);
        this.view.start();
        initalizeVaule();
    }

    @Override
    public void newAttempt(final int n) {
        try {
            final DrawResult result = model.attempt(n);
            this.view.result(result);
        } catch (IllegalArgumentException e) {
            this.view.numberIncorrect();
        } catch (AttemptsLimitReachedException e) {
            view.limitsReached();
        }
    }

    @Override
    public void resetGame() {
        this.model.reset();
    }

    @Override
    public void quit() {
        System.exit(0);
    }

    /**
     * In this method we'll read from a resource file (contained in the res folder) the configuration 
     * 
     * You need to add the res folder to the build path!
     */
    private void initalizeVaule() {
        try {
            String s;
            final BufferedReader br = new BufferedReader(new FileReader(new File("res/config.yml")));
            s = br.readLine();
            final StringTokenizer st = new StringTokenizer(s, ":");
            System.out.println(st.nextElement());
            System.out.println(st.nextToken());
            br.close();
        } catch (final FileNotFoundException e) {
            this.view.displayError(e.getMessage());
        } catch (IOException e) {
            this.view.displayError(e.getMessage());
        }
    }
    /**
     * @param args
     *            ignored
     */
    public static void main(final String... args) {
        new DrawNumberApp();
    }

}
