package Transmitter;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleLabel = new JLabel("Cipher XRay : Exposing Cryptographic Operations");
		titleLabel.setForeground(SystemColor.textHighlight);
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		titleLabel.setBounds(10, 11, 664, 38);
		contentPane.add(titleLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(338, 162, 189, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblKeyParameter = new JLabel("Key Parameter : ");
		lblKeyParameter.setHorizontalAlignment(SwingConstants.CENTER);
		lblKeyParameter.setForeground(SystemColor.textHighlight);
		lblKeyParameter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblKeyParameter.setBounds(171, 162, 133, 35);
		contentPane.add(lblKeyParameter);
		
		JButton btnStartTransmitter = new JButton("Start Transmitter");
		btnStartTransmitter.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnStartTransmitter.setBounds(100, 264, 200, 40);
		contentPane.add(btnStartTransmitter);
		
		JButton btnNewButton = new JButton("Key Parameter");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		btnNewButton.setBounds(400, 264, 200, 40);
		contentPane.add(btnNewButton);
		
		JButton btnCryptoOperations = new JButton("Crypto Operations");
		btnCryptoOperations.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCryptoOperations.setBounds(250, 364, 200, 40);
		contentPane.add(btnCryptoOperations);
		
		JLabel lblTransmitter = new JLabel("Transmitter");
		lblTransmitter.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTransmitter.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransmitter.setBounds(20, 60, 654, 38);
		contentPane.add(lblTransmitter);
	}
}
