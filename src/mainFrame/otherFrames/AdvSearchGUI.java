package mainFrame.otherFrames;

import java.awt.Color;
import java.awt.Font;
import mainFrame.AgendaGUi;

public class AdvSearchGUI extends javax.swing.JDialog {

    private AgendaGUi rootFrame;

    public AdvSearchGUI(java.awt.Frame parent, boolean modal, AgendaGUi rootframe) {
        super(parent, modal);
        this.rootFrame = rootframe;

        initComponents();
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
            java.util.logging.Logger.getLogger(AdvSearchGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdvSearchGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdvSearchGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdvSearchGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        telField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mailField = new javax.swing.JTextField();
        favCheck = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        cancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Búsqueda Avanzada");
        setResizable(false);

        jLabel1.setText("Nombre:");

        nameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFieldFocusLost(evt);
            }
        });

        jLabel2.setText("Teléfono:");

        telField.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        telField.setForeground(java.awt.Color.lightGray);
        telField.setText("Ingrese un número de tel");
        telField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                telFieldFocusLost(evt);
            }
        });

        jLabel3.setText("Email:");

        mailField.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        mailField.setForeground(java.awt.Color.lightGray);
        mailField.setText("Ingrese un email");
        mailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mailFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mailFieldFocusLost(evt);
            }
        });

        favCheck.setText("Buscar solo favoritos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(favCheck))
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(telField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favCheck))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        okButton.setBackground(new java.awt.Color(206, 255, 244));
        okButton.setText("Buscar");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(okButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed

        verificarFields();

        String name = nameField.getText().trim().toLowerCase();
        String tel = telField.getText().trim().toLowerCase();
        String mail = mailField.getText().trim().toLowerCase();
        boolean onlyFavs = favCheck.isSelected();

        rootFrame.busquedaAvanzada(name, tel, mail, onlyFavs);

        dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    private void nameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusGained

        if (!nameField.getText().isEmpty()
                && nameField.getForeground().equals(Color.LIGHT_GRAY)) {
            nameField.setText("");
            nameField.setFont(new Font("Tahoma", Font.PLAIN, 11));
            nameField.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_nameFieldFocusGained

    private void nameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusLost

        if (nameField.getText().isEmpty()) {
            nameField.setFont(new Font("Tahoma", Font.ITALIC, 11));
            nameField.setForeground(Color.LIGHT_GRAY);
            nameField.setText("Ingrese un nombre");
        }

    }//GEN-LAST:event_nameFieldFocusLost

    private void telFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telFieldFocusGained

        if (!telField.getText().isEmpty()
                && telField.getForeground().equals(Color.LIGHT_GRAY)) {
            telField.setText("");
            telField.setFont(new Font("Tahoma", Font.PLAIN, 11));
            telField.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_telFieldFocusGained

    private void telFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telFieldFocusLost

        if (telField.getText().isEmpty()) {
            telField.setFont(new Font("Tahoma", Font.ITALIC, 11));
            telField.setForeground(Color.LIGHT_GRAY);
            telField.setText("Ingrese un número de tel");
        }

    }//GEN-LAST:event_telFieldFocusLost

    private void mailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailFieldFocusGained

        if (!mailField.getText().isEmpty()
                && mailField.getForeground().equals(Color.LIGHT_GRAY)) {
            mailField.setText("");
            mailField.setFont(new Font("Tahoma", Font.PLAIN, 11));
            mailField.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_mailFieldFocusGained

    private void mailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailFieldFocusLost

        if (mailField.getText().isEmpty()) {
            mailField.setFont(new Font("Tahoma", Font.ITALIC, 11));
            mailField.setForeground(Color.LIGHT_GRAY);
            mailField.setText("Ingrese un email");
        }

    }//GEN-LAST:event_mailFieldFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JCheckBox favCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField mailField;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField telField;
    // End of variables declaration//GEN-END:variables

    private void verificarFields() {

        if (nameField.getForeground().equals(Color.LIGHT_GRAY)) {
            nameField.setText("");
        }
        if (mailField.getForeground().equals(Color.LIGHT_GRAY)) {
            mailField.setText("");
        }
        if (telField.getForeground().equals(Color.LIGHT_GRAY)) {
            telField.setText("");
        }
    }

}
