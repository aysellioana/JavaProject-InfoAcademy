package Final;

import CreareContact.Contact;
import javax.swing.JOptionPane;

/*@author Aysel */
public class AddContact extends javax.swing.JDialog {
    
    private boolean bEncapsulatedContactCreatedOk;
    private Contact contactIncapsulat = null;
    
    public Contact getContactEditat(){
        return contactIncapsulat;
    }
    public void setEncapsulatedContactCreatedOk(boolean bEncapsulatedContactCreatedOk){
        this.bEncapsulatedContactCreatedOk = bEncapsulatedContactCreatedOk;
    }
    public boolean getEncapsulatedContactCreatedValid(){
        return contactIncapsulat == null ? false : true;
    }

    public AddContact(java.awt.Frame parent, boolean modal, boolean bIsEditare, Contact contactSel) {
        super(parent, modal);
        initComponents();
        if(bIsEditare){
            tfNume.setEditable(false);
            tfNume.setText(contactSel.getNume());
            tfPrenume.setText(contactSel.getPrenume());
            tfDataNasterii.setText(contactSel.getDataNasterii_asSTR());
            tfTelefon.setText(contactSel.getTelefon());
        }else{
            tfNume.setEditable(true);
            tfPrenume.setText("");
            tfDataNasterii.setText("");
            tfTelefon.setText("");
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNume = new javax.swing.JLabel();
        lbPrenume = new javax.swing.JLabel();
        lbDataNasterii = new javax.swing.JLabel();
        lbTelefon = new javax.swing.JLabel();
        btnCreearePersoana = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        tfNume = new javax.swing.JTextField();
        tfPrenume = new javax.swing.JTextField();
        tfDataNasterii = new javax.swing.JTextField();
        tfTelefon = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbNume.setText("Nume:");

        lbPrenume.setText("Prenume:");

        lbDataNasterii.setText("Data nasterii:");

        lbTelefon.setText("Telefon:");

        btnCreearePersoana.setText("Creeaza Persoana");
        btnCreearePersoana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreearePersoanaActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbPrenume, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbNume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbDataNasterii, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfDataNasterii)
                            .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNume, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfPrenume, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfTelefon, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnCreearePersoana, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNume, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNume, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrenume, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPrenume, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataNasterii, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDataNasterii, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTelefon, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(tfTelefon))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreearePersoana, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        contactIncapsulat = null;
        setEncapsulatedContactCreatedOk(false);
        
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCreearePersoanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreearePersoanaActionPerformed
       contactIncapsulat = Contact.getInstance(tfNume.getText(), tfPrenume.getText(), tfDataNasterii.getText(), tfTelefon.getText());
       if(contactIncapsulat == null){
           JOptionPane.showMessageDialog(this, "Contactul nu a putut fi creat");
           setEncapsulatedContactCreatedOk(false);
       }else{
           setEncapsulatedContactCreatedOk(true);
           dispose();
       }
    }//GEN-LAST:event_btnCreearePersoanaActionPerformed


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
            java.util.logging.Logger.getLogger(AddContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreearePersoana;
    private javax.swing.JLabel lbDataNasterii;
    private javax.swing.JLabel lbNume;
    private javax.swing.JLabel lbPrenume;
    private javax.swing.JLabel lbTelefon;
    private javax.swing.JTextField tfDataNasterii;
    private javax.swing.JTextField tfNume;
    private javax.swing.JTextField tfPrenume;
    private javax.swing.JTextField tfTelefon;
    // End of variables declaration//GEN-END:variables
}
