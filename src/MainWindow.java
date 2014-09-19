import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;


public class MainWindow {

	private JFrame frame;
	private JTextField x1;
	private JTextField z1;
	private JTextField d1;
	private JTextField x2;
	private JTextField z2;
	private JTextField d2;
	private JTextField x3;
	private JTextField z3;
	private JTextField d3;
	private JTextField xAnswer;
	private JTextField zAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 789, 478);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 48, 39, 32);
		frame.getContentPane().add(panel);
		
		JLabel lblX = new JLabel("X:");
		lblX.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblX);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 91, 39, 32);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Z:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 134, 39, 32);
		frame.getContentPane().add(panel_2);
		
		JLabel lblD = new JLabel("D:");
		lblD.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(lblD);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(59, 48, 80, 32);
		frame.getContentPane().add(panel_3);
		
		x1 = new JTextField();
		panel_3.add(x1);
		x1.setColumns(6);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(59, 91, 80, 32);
		frame.getContentPane().add(panel_4);
		
		z1 = new JTextField();
		panel_4.add(z1);
		z1.setColumns(6);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(59, 134, 80, 32);
		frame.getContentPane().add(panel_5);
		
		d1 = new JTextField();
		panel_5.add(d1);
		d1.setColumns(6);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(148, 48, 39, 32);
		frame.getContentPane().add(panel_6);
		
		JLabel lblNewLabel_1 = new JLabel("X:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_6.add(lblNewLabel_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(148, 91, 39, 32);
		frame.getContentPane().add(panel_7);
		
		JLabel lblZ = new JLabel("Z:");
		lblZ.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_7.add(lblZ);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(148, 134, 39, 32);
		frame.getContentPane().add(panel_8);
		
		JLabel lblNewLabel_2 = new JLabel("D:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_8.add(lblNewLabel_2);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(197, 48, 89, 32);
		frame.getContentPane().add(panel_9);
		
		x2 = new JTextField();
		x2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_9.add(x2);
		x2.setColumns(8);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(197, 91, 90, 32);
		frame.getContentPane().add(panel_10);
		
		z2 = new JTextField();
		panel_10.add(z2);
		z2.setColumns(6);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(197, 134, 89, 32);
		frame.getContentPane().add(panel_11);
		
		d2 = new JTextField();
		panel_11.add(d2);
		d2.setColumns(6);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(296, 48, 39, 32);
		frame.getContentPane().add(panel_12);
		
		JLabel lblX_1 = new JLabel("X:");
		lblX_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_12.add(lblX_1);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBounds(297, 91, 39, 32);
		frame.getContentPane().add(panel_13);
		
		JLabel lblZ_1 = new JLabel("Z:");
		lblZ_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_13.add(lblZ_1);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBounds(296, 134, 40, 32);
		frame.getContentPane().add(panel_14);
		
		JLabel lblD_1 = new JLabel("D:");
		lblD_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_14.add(lblD_1);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBounds(345, 48, 89, 32);
		frame.getContentPane().add(panel_15);
		
		x3 = new JTextField();
		panel_15.add(x3);
		x3.setColumns(6);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBounds(346, 91, 89, 32);
		frame.getContentPane().add(panel_16);
		
		z3 = new JTextField();
		panel_16.add(z3);
		z3.setColumns(6);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBounds(346, 134, 88, 32);
		frame.getContentPane().add(panel_17);
		
		d3 = new JTextField();
		panel_17.add(d3);
		d3.setColumns(6);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBounds(197, 266, 89, 32);
		frame.getContentPane().add(panel_18);
		
		xAnswer = new JTextField();
		panel_18.add(xAnswer);
		xAnswer.setColumns(6);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBounds(148, 266, 39, 32);
		frame.getContentPane().add(panel_19);
		
		JLabel lblX_2 = new JLabel("X:");
		lblX_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_19.add(lblX_2);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBounds(296, 266, 39, 32);
		frame.getContentPane().add(panel_20);
		
		JLabel lblNewLabel_3 = new JLabel("Z:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_20.add(lblNewLabel_3);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBounds(345, 266, 89, 32);
		frame.getContentPane().add(panel_21);
		
		zAnswer = new JTextField();
		panel_21.add(zAnswer);
		zAnswer.setColumns(6);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBounds(10, 266, 129, 32);
		frame.getContentPane().add(panel_22);
		
		JLabel lblChestLocation = new JLabel("Chest Location:");
		lblChestLocation.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_22.add(lblChestLocation);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBounds(10, 11, 129, 32);
		frame.getContentPane().add(panel_23);
		
		JButton btnAddToMemory_1 = new JButton("Add to Memory");
		panel_23.add(btnAddToMemory_1);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBounds(148, 11, 138, 32);
		frame.getContentPane().add(panel_24);
		
		JButton btnAddToMemory_2 = new JButton("Add to Memory");
		panel_24.add(btnAddToMemory_2);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBounds(294, 11, 140, 32);
		frame.getContentPane().add(panel_25);
		
		JButton btnAddToMemory_3 = new JButton("Add to Memory");
		panel_25.add(btnAddToMemory_3);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBounds(10, 221, 424, 32);
		frame.getContentPane().add(panel_26);
		
		JButton btnFindTreasure = new JButton("Find me some treasure!");
		btnFindTreasure.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_26.add(btnFindTreasure);
	}
}
