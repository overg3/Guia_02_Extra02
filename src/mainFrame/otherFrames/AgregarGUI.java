package mainFrame.otherFrames;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mainFrame.AgendaGUi;
import mainFrame.Contacto;

public class AgregarGUI extends javax.swing.JDialog {

    private ArrayList<Contacto> listaContactos;
    private DefaultTableModel tableModel;
    private AgendaGUi root;

    public AgregarGUI(java.awt.Frame parent, boolean modal, ArrayList<Contacto> listaContactos,
            DefaultTableModel tableModel, AgendaGUi root) {
        super(parent, modal);
        this.listaContactos = listaContactos;
        this.tableModel = tableModel;
        this.root = root;

        initComponents();
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
            java.util.logging.Logger.getLogger(AgregarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        expandedPanel.setVisible(false);
        setSize(getWidth(), getHeight() - 91);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        telField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        favCheck = new javax.swing.JCheckBox();
        expandButton = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        expandedPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        apldoField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        webField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Agregar nuevo contacto");
        setResizable(false);

        jLabel1.setText("Nombre:");

        nombreField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreFieldFocusLost(evt);
            }
        });
        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
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
        telField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Email:");

        emailField.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        emailField.setForeground(java.awt.Color.lightGray);
        emailField.setText("Ingrese un email");
        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFieldFocusLost(evt);
            }
        });
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        favCheck.setText("Favorito");

        expandButton.setText("Más...");
        expandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expandButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(telField, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(nombreField))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(favCheck)))
                    .addComponent(expandButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)))
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(favCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(expandButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new java.awt.BorderLayout());

        okButton.setText("Agregar");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        jPanel2.add(okButton, java.awt.BorderLayout.WEST);

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel2.add(cancelButton, java.awt.BorderLayout.EAST);

        jLabel4.setText("Apellido:");

        apldoField.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        apldoField.setForeground(java.awt.Color.lightGray);
        apldoField.setText("Ingrese el apellido");
        apldoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                apldoFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                apldoFieldFocusLost(evt);
            }
        });
        apldoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apldoFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Dirección:");

        addressField.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        addressField.setForeground(java.awt.Color.lightGray);
        addressField.setText("Ingrese una dirección");
        addressField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressFieldFocusLost(evt);
            }
        });
        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });

        webField.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        webField.setForeground(java.awt.Color.lightGray);
        webField.setText("Ingrese un sitio web");
        webField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                webFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                webFieldFocusLost(evt);
            }
        });
        webField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                webFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Web:");

        javax.swing.GroupLayout expandedPanelLayout = new javax.swing.GroupLayout(expandedPanel);
        expandedPanel.setLayout(expandedPanelLayout);
        expandedPanelLayout.setHorizontalGroup(
            expandedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expandedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(expandedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(expandedPanelLayout.createSequentialGroup()
                        .addGroup(expandedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(apldoField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(expandedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(expandedPanelLayout.createSequentialGroup()
                        .addGroup(expandedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(webField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        expandedPanelLayout.setVerticalGroup(
            expandedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expandedPanelLayout.createSequentialGroup()
                .addGroup(expandedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(expandedPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(expandedPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apldoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(webField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(expandedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(expandedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed

        verificarFields();

        String contactName = nombreField.getText().trim();
        String contactTel = telField.getText().trim();
        String contactEmail = emailField.getText().trim();
        String contactApellido = apldoField.getText().trim();
        String contactWeb = webField.getText().trim();
        String contactAddress = addressField.getText().trim();
        boolean favValue = favCheck.isSelected();
        Contacto newContact;

        if (!nombreField.getText().trim().isEmpty()) {

            if (expandedPanel.isVisible()) {
                newContact = new Contacto(contactName, contactApellido,
                        contactTel, contactEmail, contactAddress, contactWeb);
            } else {
                newContact = new Contacto(contactName, contactTel, contactEmail);
            }

            newContact.setFav(favValue);
            listaContactos.add(newContact);
            if (favValue == true) {
                tableModel.addRow(new Object[]{"★", newContact.getNombre(),
                    newContact.getTel(), newContact.getEmail()});
            } else {
                tableModel.addRow(new Object[]{"", newContact.getNombre(),
                    newContact.getTel(), newContact.getEmail()});
            }
            dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre del contacto",
                    " Advertencia", JOptionPane.WARNING_MESSAGE);
            nombreField.requestFocus();
            nombreField.setFont(new Font("Tahoma", Font.PLAIN, 11));
            nombreField.setForeground(Color.BLACK);
        }

        root.refrescarRenderDeTabla();

    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed

        dispose();

    }//GEN-LAST:event_cancelButtonActionPerformed

    private void emailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusLost

        if (emailField.getText().isEmpty()) {
            emailField.setFont(new Font("Tahoma", Font.ITALIC, 11));
            emailField.setForeground(Color.LIGHT_GRAY);
            emailField.setText("Ingrese un email");
        }
    }//GEN-LAST:event_emailFieldFocusLost

    private void telFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telFieldFocusLost

        if (telField.getText().isEmpty()) {
            telField.setFont(new Font("Tahoma", Font.ITALIC, 11));
            telField.setForeground(Color.LIGHT_GRAY);
            telField.setText("Ingrese un número de tel");
        }

    }//GEN-LAST:event_telFieldFocusLost

    private void nombreFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFieldFocusLost

        if (nombreField.getText().isEmpty()) {
            nombreField.setFont(new Font("Tahoma", Font.ITALIC, 11));
            nombreField.setForeground(Color.LIGHT_GRAY);
            nombreField.setText("Ingrese un nombre");
        }

    }//GEN-LAST:event_nombreFieldFocusLost

    private void emailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusGained

        if (!emailField.getText().isEmpty()
                && emailField.getForeground().equals(Color.LIGHT_GRAY)) {
            emailField.setText("");
            emailField.setFont(new Font("Tahoma", Font.PLAIN, 11));
            emailField.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_emailFieldFocusGained

    private void telFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telFieldFocusGained

        if (!telField.getText().isEmpty()
                && telField.getForeground().equals(Color.LIGHT_GRAY)) {
            telField.setText("");
            telField.setFont(new Font("Tahoma", Font.PLAIN, 11));
            telField.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_telFieldFocusGained

    private void nombreFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFieldFocusGained

        if (!nombreField.getText().isEmpty()
                && nombreField.getForeground().equals(Color.LIGHT_GRAY)) {
            nombreField.setText("");
            nombreField.setFont(new Font("Tahoma", Font.PLAIN, 11));
            nombreField.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_nombreFieldFocusGained

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed

        okButtonActionPerformed(evt);

    }//GEN-LAST:event_nombreFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed

        okButtonActionPerformed(evt);

    }//GEN-LAST:event_emailFieldActionPerformed

    private void telFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telFieldActionPerformed

        okButtonActionPerformed(evt);

    }//GEN-LAST:event_telFieldActionPerformed

    private void expandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expandButtonActionPerformed

        if (expandButton.isSelected() == false) {
            expandedPanel.setVisible(false);
            expandButton.setText("Mas...");
            setSize(getWidth(), getHeight() - 91);
        } else {
            expandedPanel.setVisible(true);
            expandButton.setText("Menos...");
            setSize(getWidth(), getHeight() + 91);
        }

    }//GEN-LAST:event_expandButtonActionPerformed

    private void apldoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apldoFieldActionPerformed

        okButtonActionPerformed(evt);

    }//GEN-LAST:event_apldoFieldActionPerformed

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed

        okButtonActionPerformed(evt);

    }//GEN-LAST:event_addressFieldActionPerformed

    private void webFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_webFieldActionPerformed

        okButtonActionPerformed(evt);

    }//GEN-LAST:event_webFieldActionPerformed

    private void apldoFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apldoFieldFocusGained

        if (!apldoField.getText().isEmpty()
                && apldoField.getForeground().equals(Color.LIGHT_GRAY)) {
            apldoField.setText("");
            apldoField.setFont(new Font("Tahoma", Font.PLAIN, 11));
            apldoField.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_apldoFieldFocusGained

    private void apldoFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apldoFieldFocusLost

        if (apldoField.getText().isEmpty()) {
            apldoField.setFont(new Font("Tahoma", Font.ITALIC, 11));
            apldoField.setForeground(Color.LIGHT_GRAY);
            apldoField.setText("Ingrese un email");
        }

    }//GEN-LAST:event_apldoFieldFocusLost

    private void addressFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFieldFocusGained

        if (!addressField.getText().isEmpty()
                && addressField.getForeground().equals(Color.LIGHT_GRAY)) {
            addressField.setText("");
            addressField.setFont(new Font("Tahoma", Font.PLAIN, 11));
            addressField.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_addressFieldFocusGained

    private void addressFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFieldFocusLost

        if (addressField.getText().isEmpty()) {
            addressField.setFont(new Font("Tahoma", Font.ITALIC, 11));
            addressField.setForeground(Color.LIGHT_GRAY);
            addressField.setText("Ingrese un email");
        }

    }//GEN-LAST:event_addressFieldFocusLost

    private void webFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_webFieldFocusGained

        if (!webField.getText().isEmpty()
                && webField.getForeground().equals(Color.LIGHT_GRAY)) {
            webField.setText("");
            webField.setFont(new Font("Tahoma", Font.PLAIN, 11));
            webField.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_webFieldFocusGained

    private void webFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_webFieldFocusLost

        if (webField.getText().isEmpty()) {
            webField.setFont(new Font("Tahoma", Font.ITALIC, 11));
            webField.setForeground(Color.LIGHT_GRAY);
            webField.setText("Ingrese un email");
        }

    }//GEN-LAST:event_webFieldFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField apldoField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JToggleButton expandButton;
    private javax.swing.JPanel expandedPanel;
    private javax.swing.JCheckBox favCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombreField;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField telField;
    private javax.swing.JTextField webField;
    // End of variables declaration//GEN-END:variables

    private void cleanFields() {
        nombreField.setText("");
        telField.setText("");
        emailField.setText("");
    }

    private void verificarFields() {

        if (nombreField.getForeground().equals(Color.LIGHT_GRAY)) {
            nombreField.setText("");
        }
        if (emailField.getForeground().equals(Color.LIGHT_GRAY)) {
            emailField.setText("");
        }
        if (telField.getForeground().equals(Color.LIGHT_GRAY)) {
            telField.setText("");
        }
        if (apldoField.getForeground().equals(Color.LIGHT_GRAY)) {
            apldoField.setText("");
        }
        if (webField.getForeground().equals(Color.LIGHT_GRAY)) {
            webField.setText("");
        }
        if (addressField.getForeground().equals(Color.LIGHT_GRAY)) {
            addressField.setText("");
        }

    }

}
