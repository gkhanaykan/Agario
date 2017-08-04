package tr.org.kamp.linux.windowsbuild;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import tr.org.kamp.linux.agarioclone.logic.GameLogic;
import tr.org.kamp.linux.agarioclone.model.Difficulty;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Color;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class FirstPanel extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;
	private ButtonGroup buttonGroup;

	/**
	 * Create the panel.
	 */
	public FirstPanel() {
		setForeground(Color.WHITE);  
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);	
		
		JLabel lblKullancAd = new JLabel("User Name: ");
		GridBagConstraints gbc_lblKullancAd = new GridBagConstraints();
		gbc_lblKullancAd.anchor = GridBagConstraints.EAST;
		gbc_lblKullancAd.insets = new Insets(0, 0, 5, 5);
		gbc_lblKullancAd.gridx = 0;
		gbc_lblKullancAd.gridy = 0;
		add(lblKullancAd, gbc_lblKullancAd);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password: ");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 2;
		add(lblPassword, gbc_lblPassword);
		 
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 2;
		add(passwordField, gbc_passwordField);
		
		JLabel lblNewLabel = new JLabel("Color: ");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 4;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 4;
		add(comboBox, gbc_comboBox);
		
		comboBox.addItem("RED");
		comboBox.addItem("BLUE");
		comboBox.addItem("GREEN");
		comboBox.addItem("MAGENTA");
		comboBox.addItem("ORANGE");
		
		JLabel lblDifficulty = new JLabel("Difficulty:");
		GridBagConstraints gbc_lblDifficulty = new GridBagConstraints();
		gbc_lblDifficulty.insets = new Insets(0, 0, 5, 5);
		gbc_lblDifficulty.gridx = 0;
		gbc_lblDifficulty.gridy = 6;
		add(lblDifficulty, gbc_lblDifficulty);
		
		JRadioButton rdbtnEasy = new JRadioButton("Easy");
		GridBagConstraints gbc_rdbtnEasy = new GridBagConstraints();
		gbc_rdbtnEasy.anchor = GridBagConstraints.WEST;
		gbc_rdbtnEasy.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnEasy.gridx = 1;
		gbc_rdbtnEasy.gridy = 6;
		add(rdbtnEasy, gbc_rdbtnEasy);
		
		JRadioButton rdbtnNormal = new JRadioButton("Normal");
		GridBagConstraints gbc_rdbtnNormal = new GridBagConstraints();
		gbc_rdbtnNormal.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNormal.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNormal.gridx = 1;
		gbc_rdbtnNormal.gridy = 7;
		add(rdbtnNormal, gbc_rdbtnNormal);
		
		JRadioButton rdbtnHard = new JRadioButton("Hard");
		GridBagConstraints gbc_rdbtnHard = new GridBagConstraints();
		gbc_rdbtnHard.anchor = GridBagConstraints.WEST;
		gbc_rdbtnHard.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnHard.gridx = 1;
		gbc_rdbtnHard.gridy = 8;
		add(rdbtnHard, gbc_rdbtnHard);
		
		JButton btnStart = new JButton("START");
		GridBagConstraints gbc_btnStart = new GridBagConstraints();
		gbc_btnStart.insets = new Insets(0, 0, 5, 0);
		gbc_btnStart.gridx = 1;
		gbc_btnStart.gridy = 9;
		add(btnStart, gbc_btnStart);
		
		JButton btnAbout = new JButton("About");
		GridBagConstraints gbc_btnAbout = new GridBagConstraints();
		gbc_btnAbout.gridx = 1;
		gbc_btnAbout.gridy = 10;
		add(btnAbout, gbc_btnAbout);

		btnStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Color selectedColor = Color.BLACK;
				switch (comboBox.getSelectedItem().toString()) {
				case "RED":
					selectedColor = Color.RED;
					break;
				case "BLUE":
					selectedColor = Color.BLUE;
					break;
				case "GREEN":
					selectedColor = Color.GREEN;
					break;
				case "MAGENTA":
					selectedColor = Color.MAGENTA;
					break;
				case "ORANGE":
					selectedColor = Color.ORANGE;
					break;
				default:
					break;
				}
				
				Difficulty difficulty = Difficulty.EASY;
				
				if(rdbtnEasy.isSelected()) {
					// EASY
					difficulty = Difficulty.EASY;
				} else if(rdbtnNormal.isSelected()) {
					// MEDIUM
					difficulty = Difficulty.NORMAL;
				} else if(rdbtnHard.isSelected()) {
					// HARD
					difficulty = Difficulty.HARD;
				}

				GameLogic gameLogic = new GameLogic(textField.getText(),selectedColor,difficulty);
				gameLogic.startApplication();
			}
		});
		
		
		
		btnAbout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}	
		}); 
		btnAbout.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(FirstPanel.this, "Bu yazilim GPL altindadır, \nOzgur bir ortamda \nOzgur yazilimlar kullanilarak "
						+ "\nOzgur bireyler tarafindan gelistirilmistir."
						+ "\n LKD 2017 #Java", "About", JOptionPane.DEFAULT_OPTION);
			}
		});
	

	}

	

}
