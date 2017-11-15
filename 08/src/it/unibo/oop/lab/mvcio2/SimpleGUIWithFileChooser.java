package it.unibo.oop.lab.mvcio2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import it.unibo.oop.lab.mvcio.Controller;

/**
 * A very simple program using a graphical interface.
 * 
 *  /++
 *  we can use the same controller from mvcio?
 *  +/
 * 
 */
public final class SimpleGUIWithFileChooser {
    private final JFrame frame = new JFrame("mvcio2");
    private final Controller controller = new Controller();

    /**
     * Build up the GUI.
     */
    public SimpleGUIWithFileChooser() {
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(1);

        final Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        final int sw = (int) screen.getWidth();
        final int sh = (int) screen.getHeight();
        frame.setSize(sw / 2, sh / 2);

        final JTextArea textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(sw / 4, sh / 4));
        frame.getContentPane().add(textArea, BorderLayout.CENTER);

        final JButton button = new JButton("save");
        button.addActionListener(e -> {
            try {
                controller.writeSerializzableToFile(textArea.getText().toString());
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        frame.getContentPane().add(button, BorderLayout.SOUTH);

        final JPanel northPanel = new JPanel(new BorderLayout());
        final JTextField filePath = new JTextField();
        final JButton buttonBrowser = new JButton("Browse...");
        buttonBrowser.addActionListener(e -> {
            System.out.println("open file chooser");
            final JFileChooser jfc = new JFileChooser();
            if (jfc.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
                controller.setCurrentFile(jfc.getSelectedFile());
                filePath.setText(controller.getPath());
            }
        });
        filePath.setText(controller.getPath());
        filePath.setEditable(false);
        northPanel.add(filePath, BorderLayout.CENTER);
        northPanel.add(buttonBrowser, BorderLayout.EAST);
        frame.getContentPane().add(northPanel, BorderLayout.NORTH);

        frame.setLocationByPlatform(true);
        frame.pack();
        frame.setVisible(true);

    }
    /*
     * TODO: Starting from the application in mvcio:
     * 
     * 1) Add a JTextField and a button "Browse..." on the upper part of the
     * graphical interface.
     * Suggestion: use a second JPanel with a second BorderLayout, put the panel
     * in the North of the main panel, put the text field in the center of the
     * new panel and put the button in the line_end of the new panel.
     * 
     *          uno in center ed uno ad ovest!
     * 
     * 2) The JTextField should be non modifiable. And, should display the
     * current selected file.
     * 
     * 3) On press, the button should open a JFileChooser. The program should
     * use the method showSaveDialog() to display the file chooser, and if the
     * result is equal to JFileChooser.APPROVE_OPTION the program should set as
     * new file in the Controller the file chosen. If CANCEL_OPTION is returned,
     * then the program should do nothing. Otherwise, a message dialog should be
     * shown telling the user that an error has occurred (use
     * JOptionPane.showMessageDialog()).
     * 
     * 4) When in the controller a new File is set, also the graphical interface
     * must reflect such change. Suggestion: do not force the controller to
     * update the UI: in this example the UI knows when should be updated, so
     * try to keep things separated.
     */

    /**
     * 
     * Istanziate the gui.
     * @param args ignored.
     */
    public static void main(final String[] args) {
        new SimpleGUIWithFileChooser();
    }
}
