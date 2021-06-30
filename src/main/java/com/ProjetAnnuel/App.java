package com.ProjetAnnuel;

import org.hibernate.Session;

import com.Model.candidat;
import com.ProjetAnnuel.HibernateUtil;
import com.Service.candidatService;




public class App extends javax.swing.JFrame {


    public App() {
        initComponents();
        this.setTitle("Gestion de formations");
        this.setLocationRelativeTo(null);
        setSize(700,500);
        
    }



  
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        addMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Menu");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Calendrier");
        //openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            //public void actionPerformed(java.awt.event.ActionEvent evt) {
                //openMenuItemActionPerformed(evt);
            //}
        //});
        fileMenu.add(openMenuItem);
        
        addMenuItem.setMnemonic('x');
        addMenuItem.setText("Liste de formateurs");
        //addMenuItem.addActionListener(new java.awt.event.ActionListener() {
            //public void actionPerformed(java.awt.event.ActionEvent evt) {
                //addMenuItemActionPerformed(evt);
           // }
       // });
        fileMenu.add(addMenuItem);  

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
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
        Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		
        
        session.getTransaction().commit();
		HibernateUtil.shutdown();
    }

private javax.swing.JDesktopPane desktopPane;
private javax.swing.JMenu fileMenu;
private javax.swing.JMenuBar menuBar;
private javax.swing.JMenuItem openMenuItem;
private javax.swing.JMenuItem addMenuItem;

}

