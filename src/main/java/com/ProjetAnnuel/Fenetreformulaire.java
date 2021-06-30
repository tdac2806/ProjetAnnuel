package com.ProjetAnnuel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fenetreformulaire extends javax.swing.JInternalFrame {
	
	 public Fenetreformulaire() {
	      initComponents();
	 }
	 
	 private void initComponents() {
		  
	      jPanel2 = new javax.swing.JPanel();
		  
		  setSize(403,288);
	      setVisible(true);
	      setClosable(true);
	      setIconifiable(true);
	      setMaximizable(true);
	      setResizable(false);
	      
	      JPanel panel = new JPanel();
	      panel.setBackground(SystemColor.activeCaption);
	      getContentPane().add(panel, BorderLayout.NORTH);
	      panel.setLayout(new GridLayout(0, 1, 0, 0));
	      
	      JLabel lblNewLabel = new JLabel("Formulaire d'inscription \u00E0 une formation");
	      lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
	      lblNewLabel.setBackground(SystemColor.activeCaption);
	      panel.add(lblNewLabel);
	      
	      JPanel panel_1 = new JPanel();
	      panel_1.setBorder(new TitledBorder(null, "Informations", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	      getContentPane().add(panel_1, BorderLayout.CENTER);
	      panel_1.setLayout(null);
	      
	      JLabel lblNewLabel_1 = new JLabel("Nom :");
	      lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
	      lblNewLabel_1.setBounds(10, 42, 45, 13);
	      panel_1.add(lblNewLabel_1);
	      
	      JLabel lblNewLabel_2 = new JLabel("Prenom :");
	      lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 10));
	      lblNewLabel_2.setBounds(10, 76, 59, 13);
	      panel_1.add(lblNewLabel_2);
	      
	      JLabel lblNewLabel_3 = new JLabel("Email :");
	      lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
	      lblNewLabel_3.setBounds(172, 42, 45, 13);
	      panel_1.add(lblNewLabel_3);
	      
	      JLabel lblNewLabel_4 = new JLabel("T\u00E9l\u00E9phone :");
	      lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 10));
	      lblNewLabel_4.setBounds(172, 76, 73, 13);
	      panel_1.add(lblNewLabel_4);
	      
	      textField = new JTextField();
	      textField.setBounds(66, 39, 96, 19);
	      panel_1.add(textField);
	      textField.setColumns(10);
	      
	      textField_1 = new JTextField();
	      textField_1.setBounds(65, 73, 96, 19);
	      panel_1.add(textField_1);
	      textField_1.setColumns(10);
	      
	      textField_2 = new JTextField();
	      textField_2.setBounds(247, 39, 96, 19);
	      panel_1.add(textField_2);
	      textField_2.setColumns(10);
	      
	      textField_3 = new JTextField();
	      textField_3.setBounds(247, 73, 96, 19);
	      panel_1.add(textField_3);
	      textField_3.setColumns(10);
	      
	      JLabel lblNewLabel_5 = new JLabel("Quelle formation voulez vous choisir ? ");
	      lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
	      lblNewLabel_5.setBounds(10, 123, 246, 13);
	      panel_1.add(lblNewLabel_5);
	      
	      JComboBox comboBox = new JComboBox();
	      comboBox.setBounds(66, 146, 244, 21);
	      panel_1.add(comboBox);
	      
	      JButton btnNewButton = new JButton("Confirmer");
	      btnNewButton.setBounds(77, 194, 85, 21);
	      panel_1.add(btnNewButton);
	      
	      JButton btnNewButton_1 = new JButton("Annuler");
	      btnNewButton_1.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      	}
	      });
	      btnNewButton_1.setBounds(197, 194, 85, 21);
	      panel_1.add(btnNewButton_1);
	      
	      jPanel2.setBackground(new java.awt.Color(255, 255, 255));
	      jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulaire formation"));
	      
	      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	      jPanel2.setLayout(jPanel2Layout);
	  }
	 private javax.swing.JPanel jPanel2;
	 private JTextField textField;
	 private JTextField textField_1;
	 private JTextField textField_2;
	 private JTextField textField_3;
}