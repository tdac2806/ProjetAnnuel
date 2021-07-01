package com.ProjetAnnuel;


//Importation des différentes fonctionnalités Swing et des données des autres .java
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.hibernate.Session;

import com.Model.entretien;
import com.Model.candidat;
import com.Model.parcours;
import com.Model.personnel;
import com.Service.candidatService;
import com.Service.entretienService;
import com.Service.personnelService;

import javax.swing.GroupLayout.Alignment;

import java.util.Date;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.TextArea;

public class Fenetrelisteformation extends javax.swing.JInternalFrame {


  DefaultTableModel model;
  static int id;


  public Fenetrelisteformation() {
      initComponents();
      model = (DefaultTableModel) table_inv.getModel();
  }



  

  private void initComponents() {

      buttonGroup1 = new javax.swing.ButtonGroup();
      jPanel1 = new javax.swing.JPanel();

      jPanel3 = new javax.swing.JPanel();
      jScrollPane1 = new javax.swing.JScrollPane();
      table_inv = new javax.swing.JTable();

      setClosable(true);
      setIconifiable(true);
      setMaximizable(true);
      setResizable(false);

      jPanel1.setBackground(new java.awt.Color(218, 235, 244 ));
      jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
      

      jPanel3.setBackground(new java.awt.Color(255, 255, 255));
      jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste d'entretiens en attente"));

      table_inv.setModel(new javax.swing.table.DefaultTableModel(
          new Object [][] {

          },
          new String [] {
              "ID", "Nom","Prénom", "Competence"
          }
      ));
      table_inv.addMouseListener(new java.awt.event.MouseAdapter() {
          public void mouseClicked(java.awt.event.MouseEvent evt) {
              tableinvMouseClicked(evt);
          }
      });
      jScrollPane1.setViewportView(table_inv);
      
      JButton btnNewButton = new JButton("Rafraichir");
      btnNewButton.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		load();
      	}
      });

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3Layout.setHorizontalGroup(
      	jPanel3Layout.createParallelGroup(Alignment.LEADING)
      		.addGroup(jPanel3Layout.createSequentialGroup()
      			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
      				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
      				.addGroup(jPanel3Layout.createSequentialGroup()
      					.addGap(286)
      					.addComponent(btnNewButton)))
      			.addContainerGap())
      );
      jPanel3Layout.setVerticalGroup(
      	jPanel3Layout.createParallelGroup(Alignment.LEADING)
      		.addGroup(jPanel3Layout.createSequentialGroup()
      			.addContainerGap()
      			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
      			.addPreferredGap(ComponentPlacement.RELATED)
      			.addComponent(btnNewButton)
      			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel3.setLayout(jPanel3Layout);
      

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1Layout.setHorizontalGroup(
      	jPanel1Layout.createParallelGroup(Alignment.LEADING)
      		.addGroup(jPanel1Layout.createSequentialGroup()
      			.addContainerGap()
      			.addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
      			.addContainerGap())
      );
      jPanel1Layout.setVerticalGroup(
      	jPanel1Layout.createParallelGroup(Alignment.BASELINE)
      		.addGroup(jPanel1Layout.createSequentialGroup()
      			.addContainerGap()
      			.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
      			.addContainerGap(50, Short.MAX_VALUE))
      );
      jPanel1.setLayout(jPanel1Layout);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
          layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
          layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      );

      pack();
  }
  
  candidatService cs= new candidatService();
void load() {
      
      personnelService ps= new personnelService();
      List<personnel> listepers = ps.findAll(session);
		
		for(personnel per : listepers) 
		{
			model.addRow(new Object[]{per.getId(), per.getNom(), per.getPrenom(), per.getCompetence()});
		}
      
  }


  private void tableinvMouseClicked(java.awt.event.MouseEvent evt) {
      
  }


 
  
  
  //Déclaration des différents composants
  
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable table_inv;
  Session session = HibernateUtil.getSessionFactory().openSession();
}


