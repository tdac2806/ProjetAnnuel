package com.ProjetAnnuel;

public class Fenetreliste extends javax.swing.JInternalFrame {
	
	 public Fenetreliste() {
	      initComponents();
	 }
	 
	 private void initComponents() {
		  
	      jPanel2 = new javax.swing.JPanel();
		  
		  setSize(500,400);
	      setVisible(true);
	      setClosable(true);
	      setIconifiable(true);
	      setMaximizable(true);
	      setResizable(false);
	      
	      jPanel2.setBackground(new java.awt.Color(255, 255, 255));
	      jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulaire formation"));
	      
	      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	      jPanel2.setLayout(jPanel2Layout);
	  }
	 private javax.swing.JPanel jPanel2;
}
