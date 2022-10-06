package Final;

import CreareContact.*;
import java.awt.event.ActionEvent;
//import CreareContact.Contact;
//import CreareContact.DataC;
//import CreareContact.eFiltrare;
//import CreareContact.eOrdonare;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
/*@author Aysel */
public class FrmMainFinal extends javax.swing.JFrame {
    
    
        private final String sRegistrationCode = "1234";
        
    
        private DataC allContacts = new DataC();
        private List<Contact> contacteDeAfisat = allContacts.getAllContacts();
        
        private DefaultListModel<Contact> model = new DefaultListModel<>();
        private DefaultComboBoxModel modelFiltrare = new DefaultComboBoxModel(eFiltrare.values());
        private DefaultComboBoxModel modelOrdonare = new DefaultComboBoxModel(eOrdonare.values());
        
        private void enableFileOperations(boolean bEnable){
            miDeschidere.setEnabled(bEnable);
            miSalvare.setEnabled(bEnable);
        }
        
         private String[] images = {"pic0.jpg", "pic1.jpg", "pic2.jpg", "pic3.jpg", "pic4.jpg", "pic5.jpg"};
         private Timer t;
        
    public FrmMainFinal() {
        t = new Timer(2000, 
                (ActionEvent e)->{
                    int nRand = (int)(Math.random() * images.length);
                    ImageIcon img = new ImageIcon(this.getClass().getResource("/pics/" + images[nRand]));
                    lbReclame.setIcon(img);
                }
        );
        t.setInitialDelay(20);
        t.setDelay(300);
        
        
        initComponents();
        enableFileOperations(false);
        CbFiltrare.setModel(modelFiltrare);
        CbOrdonare.setModel(modelOrdonare);
        listContact.setModel(model);
        refreshModel(contacteDeAfisat);
        
    }
    private void refreshModel(List<Contact> contact){
        model.clear();
        for(Contact c: contact){
            model.addElement(c);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FileChooser = new javax.swing.JFileChooser();
        lbFiltrare = new javax.swing.JLabel();
        lbOrdonare = new javax.swing.JLabel();
        CbFiltrare = new javax.swing.JComboBox<>();
        CbOrdonare = new javax.swing.JComboBox<>();
        lbFiltru = new javax.swing.JLabel();
        ScrollPaneText = new javax.swing.JScrollPane();
        listContact = new javax.swing.JList<>();
        btnAdaugareContact = new javax.swing.JButton();
        btnStergereContact = new javax.swing.JButton();
        btnEditareContact = new javax.swing.JButton();
        tfFaramaText = new javax.swing.JTextField();
        lbReclame = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Fisiere = new javax.swing.JMenu();
        miDeschidere = new javax.swing.JMenuItem();
        miSalvare = new javax.swing.JMenuItem();
        miIesire = new javax.swing.JMenuItem();
        Ajutor = new javax.swing.JMenu();
        miInregistrare = new javax.swing.JMenuItem();
        miDespre = new javax.swing.JMenuItem();

        FileChooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbFiltrare.setText("Filtrare:");

        lbOrdonare.setText("Ordonare:");

        CbFiltrare.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CbFiltrare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbFiltrareActionPerformed(evt);
            }
        });

        CbOrdonare.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CbOrdonare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbOrdonareActionPerformed(evt);
            }
        });

        lbFiltru.setText("Filtru:");

        ScrollPaneText.setViewportView(listContact);

        btnAdaugareContact.setText("Adauga contact");
        btnAdaugareContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdaugareContactActionPerformed(evt);
            }
        });

        btnStergereContact.setText("Sterge contact selectat");
        btnStergereContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStergereContactActionPerformed(evt);
            }
        });

        btnEditareContact.setText("Editeaza contact selectat");
        btnEditareContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditareContactActionPerformed(evt);
            }
        });

        tfFaramaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFaramaTextActionPerformed(evt);
            }
        });
        tfFaramaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfFaramaTextKeyReleased(evt);
            }
        });

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        Fisiere.setText("Fisiere");

        miDeschidere.setText("Deschidere");
        miDeschidere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDeschidereActionPerformed(evt);
            }
        });
        Fisiere.add(miDeschidere);

        miSalvare.setText("Salvare");
        miSalvare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalvareActionPerformed(evt);
            }
        });
        Fisiere.add(miSalvare);

        miIesire.setText("Iesire");
        miIesire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miIesireActionPerformed(evt);
            }
        });
        Fisiere.add(miIesire);

        jMenuBar1.add(Fisiere);

        Ajutor.setText("Ajutor");

        miInregistrare.setText("Inregistrare");
        miInregistrare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miInregistrareActionPerformed(evt);
            }
        });
        Ajutor.add(miInregistrare);

        miDespre.setText("Despre");
        miDespre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDespreActionPerformed(evt);
            }
        });
        Ajutor.add(miDespre);

        jMenuBar1.add(Ajutor);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addComponent(ScrollPaneText, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnAdaugareContact)
                        .addGap(39, 39, 39)
                        .addComponent(btnStergereContact)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditareContact)))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbReclame, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbFiltrare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbOrdonare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CbFiltrare, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(lbFiltru)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfFaramaText, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CbOrdonare, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(btnStart)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbFiltru)
                        .addComponent(tfFaramaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CbFiltrare, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbFiltrare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbOrdonare, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbOrdonare))
                .addGap(18, 18, 18)
                .addComponent(ScrollPaneText, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdaugareContact)
                    .addComponent(btnStergereContact)
                    .addComponent(btnEditareContact))
                .addGap(18, 18, 18)
                .addComponent(lbReclame, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnStart)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OnFilterOrderData(){
        eFiltrare eFiltru = (eFiltrare) CbFiltrare.getSelectedItem();
        eOrdonare eOrdine = (eOrdonare) CbOrdonare.getSelectedItem();
        String sFarama = tfFaramaText.getText();
        contacteDeAfisat = allContacts.getContacteDeAfisat(eFiltru, sFarama, eOrdine);
        refreshModel(contacteDeAfisat);

        
    }
    
    private void miDeschidereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDeschidereActionPerformed
        if(FileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            JOptionPane.showMessageDialog(this, "Ai apasat pe open");
            
        }
    }//GEN-LAST:event_miDeschidereActionPerformed

    private void miDespreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDespreActionPerformed
       JOptionPane.showMessageDialog(this, "Numele meu este Aysel si sunt autorul acestei aplicatii. Aceasta aplicatie reprezinta o agenda de contact.");
    }//GEN-LAST:event_miDespreActionPerformed

    private void tfFaramaTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFaramaTextKeyReleased
        OnFilterOrderData();
    }//GEN-LAST:event_tfFaramaTextKeyReleased

    private void btnAdaugareContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdaugareContactActionPerformed
        AddContact dlgEditare = new AddContact(this, true, false, null);
        dlgEditare.setVisible(true);
       if(dlgEditare.getEncapsulatedContactCreatedValid() == true){
           Contact cAdd = dlgEditare.getContactEditat();
           if(allContacts.adaugaContact(cAdd)){
               OnFilterOrderData();
           }
           
       }
    }//GEN-LAST:event_btnAdaugareContactActionPerformed

    private void btnStergereContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStergereContactActionPerformed
       int idxSel = listContact.getSelectedIndex();
       if(idxSel >= 0){
           Contact cSelectat = model.get(idxSel);
           allContacts.stergeContact(cSelectat);
           OnFilterOrderData();
       }
    }//GEN-LAST:event_btnStergereContactActionPerformed

    private void btnEditareContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditareContactActionPerformed
        int idxSel = listContact.getSelectedIndex();
        if(idxSel >=0){
            Contact cSelectat = model.get(idxSel);
            AddContact dlgEditare = new AddContact(this, true, true, cSelectat);
            dlgEditare.setVisible(true);
            if(dlgEditare.getEncapsulatedContactCreatedValid() == true){
                Contact cEditat = dlgEditare.getContactEditat();
                allContacts.modificareContact(cSelectat, cEditat);
                OnFilterOrderData();
            }
        }else{
            JOptionPane.showMessageDialog(this, "Nu ati selectat nici un contact");
    }//GEN-LAST:event_btnEditareContactActionPerformed

    }
    private void miIesireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miIesireActionPerformed
       JOptionPane.showConfirmDialog(null, "Sunteti sigur ca doriti sa inchideti aplicatia?");
        System.exit(0);
    }//GEN-LAST:event_miIesireActionPerformed

    private void miSalvareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalvareActionPerformed
          OnFilterOrderData();      
          if(FileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            JOptionPane.showMessageDialog(this, "Aplicatia s-a salvat!");
          }
    }//GEN-LAST:event_miSalvareActionPerformed

    private void miInregistrareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miInregistrareActionPerformed
            String Inregistrare = JOptionPane.showInputDialog("Introduceti codul de inregistrare");
            if(Inregistrare != sRegistrationCode){
                t.stop();
                miDeschidere.setEnabled(true);
                miSalvare.setEnabled(true);
            }
        
    }//GEN-LAST:event_miInregistrareActionPerformed

    private void CbFiltrareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbFiltrareActionPerformed
       OnFilterOrderData();
    }//GEN-LAST:event_CbFiltrareActionPerformed

    private void CbOrdonareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbOrdonareActionPerformed
        OnFilterOrderData();
    }//GEN-LAST:event_CbOrdonareActionPerformed

    private void tfFaramaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFaramaTextActionPerformed
        OnFilterOrderData();
    }//GEN-LAST:event_tfFaramaTextActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
      t.start();
    }//GEN-LAST:event_btnStartActionPerformed

        public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMainFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMainFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMainFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMainFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMainFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Ajutor;
    private javax.swing.JComboBox<String> CbFiltrare;
    private javax.swing.JComboBox<String> CbOrdonare;
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JMenu Fisiere;
    private javax.swing.JScrollPane ScrollPaneText;
    private javax.swing.JButton btnAdaugareContact;
    private javax.swing.JButton btnEditareContact;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStergereContact;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbFiltrare;
    private javax.swing.JLabel lbFiltru;
    private javax.swing.JLabel lbOrdonare;
    private javax.swing.JLabel lbReclame;
    private javax.swing.JList<Contact> listContact;
    private javax.swing.JMenuItem miDeschidere;
    private javax.swing.JMenuItem miDespre;
    private javax.swing.JMenuItem miIesire;
    private javax.swing.JMenuItem miInregistrare;
    private javax.swing.JMenuItem miSalvare;
    private javax.swing.JTextField tfFaramaText;
    // End of variables declaration//GEN-END:variables
}

