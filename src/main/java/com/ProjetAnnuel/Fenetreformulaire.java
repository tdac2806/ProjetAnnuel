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

import com.Model.candidat;
import com.Model.entretien;
import com.Model.parcours;
import com.Service.candidatService;
import com.Service.entretienService;
import com.Service.parcoursService;

import org.hibernate.Session;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;

public class Fenetreformulaire extends javax.swing.JInternalFrame {
	 public Fenetreformulaire() {
	   initComponents();
      
	 }
	 
	 private void initComponents() {

		  
		  parcoursService ps = new parcoursService();
	      jPanel2 = new javax.swing.JPanel();
		  
		  setSize(572,288);
	      setVisible(true);
	      setIconifiable(true);

	      JPanel panel = new JPanel();
	      panel.setBackground(SystemColor.activeCaption);
	      getContentPane().add(panel, BorderLayout.NORTH);
	      panel.setLayout(new GridLayout(0, 1, 0, 0));
	      
	      JLabel lblNewLabel = new JLabel("Formulaire d'inscription \u00E0 une formation");
	      lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
	      lblNewLabel.setBackground(SystemColor.activeCaption);
	      panel.add(lblNewLabel);
	      
	      
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
	      textField.setBounds(66, 39, 96, 26);
	      panel_1.add(textField);
	      textField.setColumns(10);
	      
	      textField_1 = new JTextField();
	      textField_1.setBounds(65, 73, 96, 26);
	      panel_1.add(textField_1);
	      textField_1.setColumns(10);
	      
	      textField_2 = new JTextField();
	      textField_2.setBounds(247, 39, 96, 26);
	      panel_1.add(textField_2);
	      textField_2.setColumns(10);
	      
	      textField_3 = new JTextField();
	      textField_3.setBounds(247, 73, 96, 26);
	      panel_1.add(textField_3);
	      textField_3.setColumns(10);
	      
	      JLabel lblNewLabel_5 = new JLabel("Quelle formation voulez vous choisir ? ");
	      lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
	      lblNewLabel_5.setBounds(130, 123, 246, 13);
	      panel_1.add(lblNewLabel_5);
	      
	      comboBox.setBounds(186, 146, 244, 21);
	      panel_1.add(comboBox);
	      
	      List<parcours> listeparc = ps.findAll(session);
			
			for(parcours parc : listeparc) 
			{
				comboBox.addItem(parc.getnom());
			}
	      
	      
	      JButton btnNewButton = new JButton("Confirmer");
	      btnNewButton.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		btajoutActionPerformed(e);
	      	}
	      });
	      btnNewButton.setBounds(197, 194, 85, 21);
	      panel_1.add(btnNewButton);
	      
	      JButton btnNewButton_1 = new JButton("Quitter");
	      btnNewButton_1.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
               btquitterActionPerformed(e);
	      	}
	      });
	      btnNewButton_1.setBounds(317, 194, 85, 21);
	      panel_1.add(btnNewButton_1);
	      
	      JLabel lblNewLabel_6 = new JLabel("Vos disponibilitées (aaaa-mm-jj) :");
	      lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 10));
	      lblNewLabel_6.setBounds(373, 42, 178, 33);
	      panel_1.add(lblNewLabel_6);
	      
	      textField_4 = new JTextField();
	      textField_4.setColumns(10);
	      textField_4.setBounds(373, 73, 168, 26);
	      panel_1.add(textField_4);
	      
	      jPanel2.setBackground(new java.awt.Color(255, 255, 255));
	      jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulaire formation"));
	      
	      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	      jPanel2.setLayout(jPanel2Layout);
	  }

	 private void btajoutActionPerformed(java.awt.event.ActionEvent evt) {
	     String Nom =textField.getText();
         String prenom =textField_1.getText();
         String email =textField_2.getText();
         String telephone =textField_3.getText();
         int ParcoursId = 1+(comboBox.getSelectedIndex());
         String Date =  textField_4.getText();
         this.session.beginTransaction();
         candidatService cs = new candidatService();
         candidat c = new candidat(Nom,prenom,email,telephone,Date);
        
         int id = cs.create(c, this.session);
         c.setParcoursId(ParcoursId);
         cs.update(session, id);
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
    private JTextField textField_4;
    private JPanel panel_1  = new JPanel();
    private JComboBox comboBox = new JComboBox();
    Session session = HibernateUtil.getSessionFactory().openSession();
}
