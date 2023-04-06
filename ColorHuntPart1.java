/**
 * Name: Color_Hunt.java
 * Written by: Nicoli
 * Written on: 1/25/2023
 * Purpose: Color Hunt Game
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


class Color_Hunt1 {
    public static void main(String args[]){
        // Creating the Frame
        JFrame frame = new JFrame("Color Hunt");                // Setting name for JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Makes the programe quit if the JFrame is closed
        frame.setSize(300, 300);                                // Setting borders for JFrame


        JButton exit = new JButton("exit");  // Creates new button
        frame.getContentPane().add(exit);    // Adds Button to content pane of frame
        frame.setVisible(true);              // Makes frame visible

        // Declare the handler class for exit action
        ActionListener exit_action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // close programe
            }
        };
        
        // If exit button is pressed call exit action
        exit.addActionListener(exit_action);
    }
}