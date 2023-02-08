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
import javax.swing.JPanel;
import java.awt.*;


class Color_HuntPart2 {
    public static void main(String args[]){
        // Creating the Frame
        JFrame frame = new JFrame("Color Hunt");        // create and set name for JFrame
        JPanel panel = new JPanel();                    // Create pane to size buttons
        JButton exit = new JButton("EXIT");             // Creates exit button
        JButton start = new JButton("Start");           // Creates start button
        JButton colorbutton = new JButton("Button");    // Creates colorbutton

        frame.getContentPane();

        frame.setSize(1000, 1000);          // Setting borders for JFrame
        panel.setLayout(null);              // Makes panel borders to frame
        exit.setBounds(300, 850, 75, 75);   // Sets button size and location for exit button
        start.setBounds(400, 850, 75, 75);  // Sets button size and location for start button
        colorbutton.setBounds(200, 75, 75, 75);

        exit.setBackground(Color.RED);      // Set the buttons color

        frame.add(panel);           // Add the panel to the frame
        panel.add(exit);            // Add exit button to panel
        panel.add(start);           // Add start button to panel
        panel.add(colorbutton);     // Add colorbutton to panel

        frame.setVisible(true);             // Makes frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Makes the programe quit if the JFrame is closed

        // Declare the handler class for exit action
        ActionListener exit_action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // close programe
            }
        };

        // Declare the handler class for start action
        ActionListener start_game = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorbuttons(colorbutton);
            }           
        };
        
        // If exit button is pressed call exit action
        exit.addActionListener(exit_action);

        // If the start button is pressed start color hunt game
        start.addActionListener(start_game);
    }

    // Changes the button colors
    public static void colorbuttons(JButton colorbutton)
    {
        colorbutton.setBackground(Color.GREEN);
    }
}