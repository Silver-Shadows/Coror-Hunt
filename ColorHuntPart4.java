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

class ColorHunt4 extends JFrame {


	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ColorHunt4 frame = new ColorHunt4();
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
	public ColorHunt4() {
		setTitle("Color Hunt");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 296);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// List of color buttons
		JButton[] color_buttons = new JButton[28];
		
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
		
		color_buttons[1] = new JButton("");
		color_buttons[1].setBounds(440, 189, 50, 50);
		contentPane.add(color_buttons[1]);
		
		color_buttons[2] = new JButton("");
		color_buttons[2].setBounds(380, 189, 50, 50);
		contentPane.add(color_buttons[2]);
		
		color_buttons[3] = new JButton("");
		color_buttons[3].setBounds(320, 189, 50, 50);
		contentPane.add(color_buttons[3]);
		
		color_buttons[4] = new JButton("");
		color_buttons[4].setBounds(260, 189, 50, 50);
		contentPane.add(color_buttons[4]);
		
		color_buttons[5] = new JButton("");
		color_buttons[5].setBounds(200, 189, 50, 50);
		contentPane.add(color_buttons[5]);
		
		color_buttons[6] = new JButton("");
		color_buttons[6].setBounds(140, 189, 50, 50);
		contentPane.add(color_buttons[6]);
		
		color_buttons[7] = new JButton("");
		color_buttons[7].setBounds(80, 189, 50, 50);
		contentPane.add(color_buttons[7]);
		
		color_buttons[8] = new JButton("");
		color_buttons[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		color_buttons[8].setBounds(20, 189, 50, 50);
		contentPane.add(color_buttons[8]);
		
		color_buttons[9] = new JButton("");
		color_buttons[9].setBounds(500, 128, 50, 50);
		contentPane.add(color_buttons[9]);
		
		color_buttons[10] = new JButton("");
		color_buttons[10].setBounds(440, 128, 50, 50);
		contentPane.add(color_buttons[10]);
		
		color_buttons[11] = new JButton("");
		color_buttons[11].setBounds(380, 128, 50, 50);
		contentPane.add(color_buttons[11]);
		
		color_buttons[12] = new JButton("");
		color_buttons[12].setBounds(320, 128, 50, 50);
		contentPane.add(color_buttons[12]);
		
		color_buttons[13] = new JButton("");
		color_buttons[13].setBounds(260, 128, 50, 50);
		contentPane.add(color_buttons[13]);
		
		color_buttons[14] = new JButton("");
		color_buttons[14].setBounds(200, 128, 50, 50);
		contentPane.add(color_buttons[14]);
		
		color_buttons[15] = new JButton("");
		color_buttons[15].setBounds(140, 128, 50, 50);
		contentPane.add(color_buttons[15]);
		
		color_buttons[16] = new JButton("");
		color_buttons[16].setBounds(80, 128, 50, 50);
		contentPane.add(color_buttons[16]);
		
		color_buttons[17] = new JButton("");
		color_buttons[17].setBounds(20, 128, 50, 50);
		contentPane.add(color_buttons[17]);
		
		color_buttons[18] = new JButton("");
		color_buttons[18].setBounds(20, 67, 50, 50);
		contentPane.add(color_buttons[18]);
		
		color_buttons[19] = new JButton("");
		color_buttons[19].setBounds(80, 67, 50, 50);
		contentPane.add(color_buttons[19]);
		
		color_buttons[20] = new JButton("");
		color_buttons[20].setBounds(140, 67, 50, 50);
		contentPane.add(color_buttons[20]);
		
		color_buttons[21] = new JButton("");
		color_buttons[21].setBounds(200, 67, 50, 50);
		contentPane.add(color_buttons[21]);
		
		color_buttons[22] = new JButton("");
		color_buttons[22].setBounds(260, 67, 50, 50);
		contentPane.add(color_buttons[22]);
		
		color_buttons[23] = new JButton("");
		color_buttons[23].setBounds(320, 67, 50, 50);
		contentPane.add(color_buttons[23]);
		
		color_buttons[24] = new JButton("");
		color_buttons[24].setBounds(380, 67, 50, 50);
		contentPane.add(color_buttons[24]);
		
		color_buttons[25] = new JButton("");
		color_buttons[25].setBounds(440, 67, 50, 50);
		contentPane.add(color_buttons[25]);
		
		color_buttons[26] = new JButton("");
		color_buttons[26].setBounds(500, 67, 50, 50);
		contentPane.add(color_buttons[26]);
		
		color_buttons[27] = new JButton("");
		color_buttons[27].setBounds(500, 189, 50, 50);
		contentPane.add(color_buttons[27]);
		
		JButton btnStart = new JButton("Start Game");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Start color hunt game
				color_hunt(color_buttons);
			}
		});
		btnStart.setBounds(20, 10, 106, 46);
		contentPane.add(btnStart);
		
	}
	
	public static void color_hunt(JButton[] color_buttons)
	{
		// Get and set colors for buttons
		get_and_set_button_color(color_buttons);
	}
	
	public static void get_and_set_button_color(JButton[] color_buttons)
	{
		// Create instance of Random class
		Random rand = new Random();
		
		for (int i = 1; i < 28; i++) {
			
			// Hold and gets a number for random color
			int new_color = rand.nextInt(13);
			
			// Get random color based off of random number
			if (new_color == 0)
			{
				color_buttons[i].setBackground(Color.RED);
			}
			else if (new_color == 1)
			{
				color_buttons[i].setBackground(Color.GREEN);
			}
			else if (new_color == 2)
			{
				color_buttons[i].setBackground(Color.BLUE);
			}
			else if (new_color == 3)
			{
				color_buttons[i].setBackground(Color.YELLOW);
			}
			else if (new_color == 4)
			{
				color_buttons[i].setBackground(Color.CYAN);
			}
			else if (new_color == 5)
			{
				color_buttons[i].setBackground(Color.MAGENTA);
			}
			else if (new_color == 6)
			{
				color_buttons[i].setBackground(Color.WHITE);
			}
			else if (new_color == 7)
			{
				color_buttons[i].setBackground(Color.BLACK);
			}
			else if (new_color == 8)
			{
				color_buttons[i].setBackground(Color.GRAY);
			}
			else if (new_color == 9)
			{
				color_buttons[i].setBackground(Color.LIGHT_GRAY);
			}
			else if (new_color == 10)
			{
				color_buttons[i].setBackground(Color.DARK_GRAY);
			}
			else if (new_color == 11)
			{
				color_buttons[i].setBackground(Color.ORANGE);
			}
			else if (new_color == 12)
			{
				color_buttons[i].setBackground(Color.PINK);
			}
		}
	}
}