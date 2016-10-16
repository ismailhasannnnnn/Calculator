package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import javax.swing.JSlider;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import java.awt.Font;

public class CalcGUI {

	private JFrame frame;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcGUI window = new CalcGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalcGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("4");
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(10, 135, 89, 42);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("7");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_1.setBounds(10, 82, 89, 42);
		frame.getContentPane().add(button_1);

		
		JButton button_2 = new JButton("1");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("1");
				label = new JLabel();
				label.setBounds(10, 64, 414, 14);
				frame.getContentPane().add(label);
				
			}
		});
		label = new JLabel();
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 24, 414, 42);
		frame.getContentPane().add(label);
		
		
		
		button_2.setBounds(10, 188, 89, 42);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_3.setBounds(109, 135, 89, 42);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("8");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_4.setBounds(109, 82, 89, 42);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("2");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_5.setBounds(109, 188, 89, 42);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("3");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_6.setBounds(208, 188, 89, 42);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("6");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_7.setBounds(208, 135, 89, 42);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_8.setBounds(208, 82, 89, 42);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("+");
		button_9.setBounds(335, 83, 89, 23);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("-");
		button_10.setBounds(335, 117, 89, 23);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("*");
		button_11.setBounds(335, 147, 89, 23);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("/");
		button_12.setBounds(335, 181, 89, 23);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.setBounds(335, 215, 89, 23);
		frame.getContentPane().add(button_13);
	}
}
