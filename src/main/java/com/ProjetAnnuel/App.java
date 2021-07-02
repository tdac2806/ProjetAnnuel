package com.ProjetAnnuel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import org.hibernate.Session;
import javax.swing.JMenu;


import com.mindfusion.scheduling.Calendar;
import com.mindfusion.scheduling.CalendarAdapter;
import com.mindfusion.scheduling.ThemeType;
import com.mindfusion.scheduling.model.Appointment;
import com.mindfusion.scheduling.model.ItemEvent;

//affectation des différentes formation du projet
public class App extends javax.swing.JFrame {

   public App() {
      initComponents();
      this.setTitle("Gestion de formations");
      this.setLocationRelativeTo(null);
      setSize(1000, 700);

   }

   private void initComponents() {

      desktopPane = new javax.swing.JDesktopPane();
      menuBar = new javax.swing.JMenuBar();
      fileMenu = new javax.swing.JMenu();
      addMenuItem = new javax.swing.JMenuItem();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      fileMenu.setMnemonic('f');
      fileMenu.setText("Formation");

      

      addMenuItem.setMnemonic('x');
      addMenuItem.setText("Liste Entretien");
      addMenuItem.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            addMenuItemActionPerformed(evt);
         }
      });
      fileMenu.add(addMenuItem);

      menuBar.add(fileMenu);

      JMenuItem mntmNewMenuItem = new JMenuItem("Formulaire inscription");
      mntmNewMenuItem.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            mntmNewMenuItemActionPerformed(e);
         }
      });
      fileMenu.add(mntmNewMenuItem);

      setJMenuBar(menuBar);
      
      JMenu mnNewMenu = new JMenu("Personnel");
      menuBar.add(mnNewMenu);
      
      JMenuItem formateuritem = new JMenuItem("Nouveau formateur");
      formateuritem.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		formateuritemActionPerformed(e);
      	}
      });
      mnNewMenu.add(formateuritem);
      
      mntmNewMenuItem_1 = new JMenuItem("Affectation Formateur");
      mntmNewMenuItem_1.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		mntmNewMenuItem1ActionPerformed(e);
      	}
      });
      mnNewMenu.add(mntmNewMenuItem_1);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE));
      layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE));

      pack();
   }

   private void addMenuItemActionPerformed(java.awt.event.ActionEvent evt) {

      Fenetreliste fl = new Fenetreliste();
      desktopPane.add(fl);
      fl.setVisible(true);
   }
   
   private void formateuritemActionPerformed(java.awt.event.ActionEvent evt) {

	      Fenetreformateur ff = new Fenetreformateur();
	      desktopPane.add(ff);
	      ff.setVisible(true);
	   }



   private void mntmNewMenuItemActionPerformed(java.awt.event.ActionEvent evt) {

      Fenetreformulaire ff = new Fenetreformulaire();
      desktopPane.add(ff);
      ff.setVisible(true);
   }
   
   private void mntmNewMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {

	      Fenetrelisteformation flf = new Fenetrelisteformation();
	      desktopPane.add(flf);
	      flf.setVisible(true);
	   }
   
   

   public static void main(String args[]) {

      try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }

      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new App().setVisible(true);
         }
      });
   }

   private javax.swing.JDesktopPane desktopPane;
   private javax.swing.JMenu fileMenu;
   private javax.swing.JMenuBar menuBar;
   private javax.swing.JMenuItem openMenuItem;
   private javax.swing.JMenuItem addMenuItem;
   private JMenuItem mntmNewMenuItem_1;
}
