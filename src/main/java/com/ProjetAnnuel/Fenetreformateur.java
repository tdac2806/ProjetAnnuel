package com.ProjetAnnuel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;



import com.Model.personnel;
import com.Service.candidatService;
import com.Service.entretienService;
import com.Service.parcoursService;
import com.Service.personnelService;

import org.hibernate.Session;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;

public class Fenetreformateur extends javax.swing.JInternalFrame {
	 
	public Fenetreformateur() {
	   initComponents();
      this.session.beginTransaction();
	 }
	 
	 private void initComponents() {
		  parcoursService ps 	= new parcoursService();
	      jPanel2 				= new javax.swing.JPanel();
		  
	      
	      // Paramétrage du bloc JPanel
		  setSize(572,288);
	      setVisible(true);
	      setIconifiable(true);

	      JPanel panel = new JPanel();
	      panel.setBackground(SystemColor.activeCaption);
	      panel.setLayout(new GridLayout(0, 1, 0, 0));
	      getContentPane().add(panel, BorderLayout.NORTH);
	      
	      
	      panel_1.setBorder(new TitledBorder(null, "Informations", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	      panel_1.setLayout(null);
	      getContentPane().add(panel_1, BorderLayout.CENTER);
	      
	      
	      
	      // == Création des éléments du bloc == //
	      JLabel lblNewLabel_1 = new JLabel("Nom :");
	      lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
	      lblNewLabel_1.setBounds(163, 42, 45, 13);
	      panel_1.add(lblNewLabel_1);
	      
	      
	      JLabel lblNewLabel_2 = new JLabel("Prenom :");
	      lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 10));
	      lblNewLabel_2.setBounds(163, 85, 59, 13);
	      panel_1.add(lblNewLabel_2);
	      
	      
	      JLabel lblNewLabel_3 = new JLabel("Role :");
	      lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
	      lblNewLabel_3.setBounds(163, 121, 45, 13);
	      panel_1.add(lblNewLabel_3);
	      
	      
	      JLabel lblNewLabel_4 = new JLabel("Competence :");
	      lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 10));
	      lblNewLabel_4.setBounds(163, 157, 73, 13);
	      panel_1.add(lblNewLabel_4);
	      
	      
	      textField = new JTextField();
	      textField.setBounds(257, 36, 96, 26);
	      textField.setColumns(10);
	      panel_1.add(textField);
	      
	      textField_1 = new JTextField();
	      textField_1.setBounds(257, 79, 96, 26);
	      textField_1.setColumns(10);
	      panel_1.add(textField_1);
	      
	      textField_2 = new JTextField();
	      textField_2.setBounds(257, 115, 96, 26);
	      textField_2.setColumns(10);
	      panel_1.add(textField_2);
	      
	      textField_3 = new JTextField();
	      textField_3.setBounds(257, 151, 96, 26);
	      textField_3.setColumns(10);
	      panel_1.add(textField_3);
	      
	      
	      
	      // == Configuration des boutons == //
	      JButton btnNewButton = new JButton("Confirmer");
	      btnNewButton.addActionListener(new ActionListener() {
	    	  
	      	public void actionPerformed(ActionEvent e) {
	      		btajoutActionPerformed(e);
	      	}
	      	
	      });
	      
	      btnNewButton.setBounds(163, 194, 85, 21);
	      panel_1.add(btnNewButton);
	      
	      
	      
	      JButton btnNewButton_1 = new JButton("Quitter");
	      btnNewButton_1.addActionListener(new ActionListener() {
	    	  
	      	public void actionPerformed(ActionEvent e) {
               btquitterActionPerformed(e);
	      	}
	      	
	      });
	      
	      btnNewButton_1.setBounds(268, 194, 85, 21);
	      panel_1.add(btnNewButton_1);
	      
	      
	      
	      jPanel2.setBackground(new java.awt.Color(255, 255, 255));
	      jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulaire Nouveau formateur"));
	      
	      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	      jPanel2.setLayout(jPanel2Layout);
	  }

	 
	 
	 private void btajoutActionPerformed(java.awt.event.ActionEvent evt) {
		 /**
		  * Créer et ajoute un membre du personnel à la base de données
		  */
		 
	     String nom 	= textField.getText();
         String prenom 	= textField_1.getText();
         String role 	= textField_2.getText();
         String comp 	= textField_3.getText();

         personnelService ps 	= new personnelService();
         personnel p1 			= new personnel(nom,prenom,role,comp);
        
         ps.create(p1, this.session);

         this.session.getTransaction().commit();
         this.dispose();
    }

	 
	 
    private void btquitterActionPerformed(java.awt.event.ActionEvent evt){
    	session.getTransaction().commit();
    	this.dispose();
	}
    
    
	private javax.swing.JPanel jPanel2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPanel panel_1 	= new JPanel();
	Session session 		= HibernateUtil.getSessionFactory().openSession();
}

