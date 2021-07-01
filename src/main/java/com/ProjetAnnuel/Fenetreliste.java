package com.ProjetAnnuel;


//Importation des différentes fonctionnalités Swing et des données des autres .java
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.hibernate.Session;

import com.Model.candidat;
import com.Model.parcours;
import com.Service.candidatService;



import javax.swing.GroupLayout.Alignment;

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
import java.awt.event.ActionEvent;
import java.awt.TextArea;

public class Fenetreliste extends javax.swing.JInternalFrame {


  DefaultTableModel model;
  static int id;


  public Fenetreliste() {
      initComponents();
      model = (DefaultTableModel) table_inv.getModel();
  }

  void load() {
      
      candidatService cs= new candidatService();
      List<candidat> listecan = cs.findAll(session);
		
		for(candidat can : listecan) 
		{
			model.addRow(new Object[]{can.getid(), can.getnom(), can.getprenom(),can.getemail(), can.gettel(),can.getParcoursid(),"En attente",can.getDateDispo()});
		}
      
  }


  void clear() {
      champnom.setText("");
      champprenom.setText("");
      champparcours.setText("");
      champmail.setText("");
      champdispo.setText("");
  }

  private void initComponents() {

      buttonGroup1 = new javax.swing.ButtonGroup();
      jPanel1 = new javax.swing.JPanel();
      jPanel2 = new javax.swing.JPanel();
      labelnom = new javax.swing.JLabel();
      labelprix = new javax.swing.JLabel();
      labelref = new javax.swing.JLabel();
      labelstock = new javax.swing.JLabel();
      champnom = new javax.swing.JTextField();
      champprenom = new javax.swing.JTextField();
      champparcours = new javax.swing.JTextField();
      champmail = new javax.swing.JTextField();
      bt_ajout = new javax.swing.JButton();
      jPanel3 = new javax.swing.JPanel();
      jScrollPane1 = new javax.swing.JScrollPane();
      table_inv = new javax.swing.JTable();

      setClosable(true);
      setIconifiable(true);
      setMaximizable(true);
      setResizable(false);

      jPanel1.setBackground(new java.awt.Color(218, 235, 244 ));
      jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

      jPanel2.setBackground(new java.awt.Color(255, 255, 255));
      jPanel2.setBorder(new TitledBorder(null, "Informations", TitledBorder.LEADING, TitledBorder.TOP, null, null));

      labelnom.setText("Nom :");

      labelprix.setText("Prenom :");

      labelref.setText("Email :");
      
      labelstock.setText("Formation :");
      
      lblDispo = new JLabel();
      lblDispo.setText("Dispo :");
      
      champdispo = new JTextField();
      
      champrop = new JTextField();
      
      lblProposition = new JLabel();
      lblProposition.setFont(new Font("Tahoma", Font.PLAIN, 10));
      lblProposition.setText("Proposition");
      


      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2Layout.setHorizontalGroup(
      	jPanel2Layout.createParallelGroup(Alignment.LEADING)
      		.addGroup(jPanel2Layout.createSequentialGroup()
      			.addContainerGap()
      			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
      				.addGroup(jPanel2Layout.createSequentialGroup()
      					.addComponent(labelprix)
      					.addPreferredGap(ComponentPlacement.RELATED)
      					.addComponent(champprenom, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
      				.addGroup(jPanel2Layout.createSequentialGroup()
      					.addComponent(labelnom)
      					.addGap(18)
      					.addComponent(champnom)))
      			.addGap(18)
      			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
      				.addComponent(labelref)
      				.addComponent(labelstock))
      			.addPreferredGap(ComponentPlacement.RELATED)
      			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
      				.addComponent(champmail)
      				.addComponent(champparcours, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
      			.addPreferredGap(ComponentPlacement.UNRELATED)
      			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
      				.addGroup(jPanel2Layout.createSequentialGroup()
      					.addComponent(lblDispo)
      					.addGap(14)
      					.addComponent(champdispo, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
      				.addGroup(jPanel2Layout.createSequentialGroup()
      					.addComponent(lblProposition, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
      					.addGap(14)
      					.addComponent(champrop, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))))
      );
      jPanel2Layout.setVerticalGroup(
      	jPanel2Layout.createParallelGroup(Alignment.LEADING)
      		.addGroup(jPanel2Layout.createSequentialGroup()
      			.addContainerGap()
      			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
      				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
      					.addComponent(labelnom)
      					.addComponent(champnom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
      					.addComponent(labelref)
      					.addComponent(champmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
      				.addGroup(jPanel2Layout.createSequentialGroup()
      					.addGap(3)
      					.addComponent(lblDispo))
      				.addComponent(champdispo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
      			.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
      			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
      				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
      					.addComponent(labelprix)
      					.addComponent(champprenom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
      					.addComponent(labelstock)
      					.addComponent(champparcours, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
      				.addGroup(jPanel2Layout.createSequentialGroup()
      					.addGap(3)
      					.addComponent(lblProposition))
      				.addComponent(champrop, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
      );
      jPanel2.setLayout(jPanel2Layout);

     bt_ajout.setText("Valider");
     
  

     
     JButton bt_ajout_1 = new JButton();
     bt_ajout_1.setText("Refuser");

      

      
      
      

      jPanel3.setBackground(new java.awt.Color(255, 255, 255));
      jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste d'entretiens en attente"));

      table_inv.setModel(new javax.swing.table.DefaultTableModel(
          new Object [][] {

          },
          new String [] {
              "ID", "Nom","Prénom", "Email", "Téléphone","Formation", "Statut","Disponibilité"
          }
      ));
      table_inv.addMouseListener(new java.awt.event.MouseAdapter() {
          public void mouseClicked(java.awt.event.MouseEvent evt) {
              tableinvMouseClicked(evt);
          }
      });
      jScrollPane1.setViewportView(table_inv);

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3Layout.setHorizontalGroup(
      	jPanel3Layout.createParallelGroup(Alignment.TRAILING)
      		.addGroup(Alignment.LEADING, jPanel3Layout.createSequentialGroup()
      			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
      			.addContainerGap())
      );
      jPanel3Layout.setVerticalGroup(
      	jPanel3Layout.createParallelGroup(Alignment.LEADING)
      		.addGroup(jPanel3Layout.createSequentialGroup()
      			.addContainerGap()
      			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
      			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel3.setLayout(jPanel3Layout);
      
      bt_ajout_2 = new JButton();
      bt_ajout_2.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		load();
      	}
      });
      bt_ajout_2.setText("Rafraichir");
      

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1Layout.setHorizontalGroup(
      	jPanel1Layout.createParallelGroup(Alignment.LEADING)
      		.addGroup(jPanel1Layout.createSequentialGroup()
      			.addGap(28)
      			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
      				.addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
      				.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
      					.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
      					.addPreferredGap(ComponentPlacement.RELATED)
      					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
      						.addComponent(bt_ajout_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      						.addComponent(bt_ajout_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      						.addComponent(bt_ajout, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))))
      			.addContainerGap())
      );
      jPanel1Layout.setVerticalGroup(
      	jPanel1Layout.createParallelGroup(Alignment.BASELINE)
      		.addGroup(jPanel1Layout.createSequentialGroup()
      			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
      				.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
      					.addContainerGap()
      					.addComponent(bt_ajout)
      					.addGap(18)
      					.addComponent(bt_ajout_1)
      					.addGap(18)
      					.addComponent(bt_ajout_2))
      				.addGroup(jPanel1Layout.createSequentialGroup()
      					.addGap(29)
      					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
      			.addPreferredGap(ComponentPlacement.RELATED)
      			.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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



  private void tableinvMouseClicked(java.awt.event.MouseEvent evt) {
      id = Integer.parseInt(model.getValueAt(table_inv.getSelectedRow(), 0).toString());
      champnom.setText(model.getValueAt(table_inv.getSelectedRow(), 1).toString());
      champprenom.setText(model.getValueAt(table_inv.getSelectedRow(), 2).toString());
      champmail.setText(model.getValueAt(table_inv.getSelectedRow(), 3).toString());
      champparcours.setText(model.getValueAt(table_inv.getSelectedRow(), 5).toString());
      champdispo.setText(model.getValueAt(table_inv.getSelectedRow(), 7).toString());
  }


 
  
  
  //Déclaration des différents composants
  
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.JButton bt_ajout;
  private javax.swing.JLabel labelnom;
  private javax.swing.JLabel labelprix;
  private javax.swing.JLabel labelref;
  private javax.swing.JLabel labelstock;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable table_inv;
  private javax.swing.JTextField champnom;
  private javax.swing.JTextField champprenom;
  private javax.swing.JTextField champparcours;
  private javax.swing.JTextField champmail;
  private Session session = HibernateUtil.getSessionFactory().openSession();
  private JLabel lblDispo;
  private JTextField champdispo;
  private JTextField champrop;
  private JLabel lblProposition;
  private JButton bt_ajout_2;
}


