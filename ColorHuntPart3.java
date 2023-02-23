// Import random, awt
import java.util.Random;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Color_Hunt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Color_Hunt frame = new Color_Hunt();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Color_Hunt() {
		setTitle("Color Hunt");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 296);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Close the program
				System.exit(0);
			}
		});
		btnExit.setBounds(461, 10, 89, 46);
		contentPane.add(btnExit);
		
		JLabel lblHowtoplay = new JLabel("Click the color");
		lblHowtoplay.setHorizontalAlignment(SwingConstants.LEFT);
		lblHowtoplay.setBounds(136, 10, 83, 21);
		contentPane.add(lblHowtoplay);
		
		JLabel lblHowtoplay2 = new JLabel("that matches");
		lblHowtoplay2.setBounds(136, 42, 83, 14);
		contentPane.add(lblHowtoplay2);
		
		JButton btnColor_1 = new JButton("");
		btnColor_1.setBounds(440, 189, 50, 50);
		contentPane.add(btnColor_1);
		
		JButton btnColor_2 = new JButton("");
		btnColor_2.setBounds(380, 189, 50, 50);
		contentPane.add(btnColor_2);
		
		JButton btnColor_3 = new JButton("");
		btnColor_3.setBounds(320, 189, 50, 50);
		contentPane.add(btnColor_3);
		
		JButton btnColor_4 = new JButton("");
		btnColor_4.setBounds(260, 189, 50, 50);
		contentPane.add(btnColor_4);
		
		JButton btnColor_5 = new JButton("");
		btnColor_5.setBounds(200, 189, 50, 50);
		contentPane.add(btnColor_5);
		
		JButton btnColor_6 = new JButton("");
		btnColor_6.setBounds(140, 189, 50, 50);
		contentPane.add(btnColor_6);
		
		JButton btnColor_7 = new JButton("");
		btnColor_7.setBounds(80, 189, 50, 50);
		contentPane.add(btnColor_7);
		
		JButton btnColor_8 = new JButton("");
		btnColor_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnColor_8.setBounds(20, 189, 50, 50);
		contentPane.add(btnColor_8);
		
		JButton btnColor_9 = new JButton("");
		btnColor_9.setBounds(500, 128, 50, 50);
		contentPane.add(btnColor_9);
		
		JButton btnColor_10 = new JButton("");
		btnColor_10.setBounds(440, 128, 50, 50);
		contentPane.add(btnColor_10);
		
		JButton btnColor_11 = new JButton("");
		btnColor_11.setBounds(380, 128, 50, 50);
		contentPane.add(btnColor_11);
		
		JButton btnColor_12 = new JButton("");
		btnColor_12.setBounds(320, 128, 50, 50);
		contentPane.add(btnColor_12);
		
		JButton btnColor_13 = new JButton("");
		btnColor_13.setBounds(260, 128, 50, 50);
		contentPane.add(btnColor_13);
		
		JButton btnColor_14 = new JButton("");
		btnColor_14.setBounds(200, 128, 50, 50);
		contentPane.add(btnColor_14);
		
		JButton btnColor_15 = new JButton("");
		btnColor_15.setBounds(140, 128, 50, 50);
		contentPane.add(btnColor_15);
		
		JButton btnColor_16 = new JButton("");
		btnColor_16.setBounds(80, 128, 50, 50);
		contentPane.add(btnColor_16);
		
		JButton btnColor_17 = new JButton("");
		btnColor_17.setBounds(20, 128, 50, 50);
		contentPane.add(btnColor_17);
		
		JButton btnColor_18 = new JButton("");
		btnColor_18.setBounds(20, 67, 50, 50);
		contentPane.add(btnColor_18);
		
		JButton btnColor_19 = new JButton("");
		btnColor_19.setBounds(80, 67, 50, 50);
		contentPane.add(btnColor_19);
		
		JButton btnColor_20 = new JButton("");
		btnColor_20.setBounds(140, 67, 50, 50);
		contentPane.add(btnColor_20);
		
		JButton btnColor_21 = new JButton("");
		btnColor_21.setBounds(200, 67, 50, 50);
		contentPane.add(btnColor_21);
		
		JButton btnColor_22 = new JButton("");
		btnColor_22.setBounds(260, 67, 50, 50);
		contentPane.add(btnColor_22);
		
		JButton btnColor_23 = new JButton("");
		btnColor_23.setBounds(320, 67, 50, 50);
		contentPane.add(btnColor_23);
		
		JButton btnColor_24 = new JButton("");
		btnColor_24.setBounds(380, 67, 50, 50);
		contentPane.add(btnColor_24);
		
		JButton btnColor_25 = new JButton("");
		btnColor_25.setBounds(440, 67, 50, 50);
		contentPane.add(btnColor_25);
		
		JButton btnColor_26 = new JButton("");
		btnColor_26.setBounds(500, 67, 50, 50);
		contentPane.add(btnColor_26);
		
		JButton btnColor_27 = new JButton("");
		btnColor_27.setBounds(500, 189, 50, 50);
		contentPane.add(btnColor_27);
		
		JButton btnStart = new JButton("Start Game");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Start color hunt game
				color_hunt(btnColor_1);
			}
		});
		btnStart.setBounds(20, 10, 106, 46);
		contentPane.add(btnStart);
		
	}
	
	public static void color_hunt(JButton btnColor_1)
	{
		// Get and set colors for buttons
		get_and_set_button_color(btnColor_1);
	}
	
	public static void get_and_set_button_color(JButton btnColor_1)
	{
		// Create instance of Random class
		Random rand = new Random();
		
		// Hold a number for random color
		int new_color = rand.nextInt(13);
		
		// Get random color based off of random number
		if (new_color == 0)
		{
			btnColor_1.setBackground(Color.RED);
		}
		else if (new_color == 1)
		{
			btnColor_1.setBackground(Color.GREEN);
		}
		else if (new_color == 2)
		{
			btnColor_1.setBackground(Color.BLUE);
		}
		else if (new_color == 3)
		{
			btnColor_1.setBackground(Color.YELLOW);
		}
		else if (new_color == 4)
		{
			btnColor_1.setBackground(Color.CYAN);
		}
		else if (new_color == 5)
		{
			btnColor_1.setBackground(Color.MAGENTA);
		}
		else if (new_color == 6)
		{
			btnColor_1.setBackground(Color.WHITE);
		}
		else if (new_color == 7)
		{
			btnColor_1.setBackground(Color.BLACK);
		}
		else if (new_color == 8)
		{
			btnColor_1.setBackground(Color.GRAY);
		}
		else if (new_color == 9)
		{
			btnColor_1.setBackground(Color.LIGHT_GRAY);
		}
		else if (new_color == 10)
		{
			btnColor_1.setBackground(Color.DARK_GRAY);
		}
		else if (new_color == 11)
		{
			btnColor_1.setBackground(Color.ORANGE);
		}
		else if (new_color == 12)
		{
			btnColor_1.setBackground(Color.PINK);
		}
	}
}