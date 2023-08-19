package mainFrame;

import java.awt.Color;
import java.awt.Font;
import mainFrame.otherFrames.AgregarGUI;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import mainFrame.otherFrames.AdvSearchGUI;
import mainFrame.otherFrames.EditarGUi;

public class AgendaGUi extends javax.swing.JFrame {

    private ArrayList<Contacto> listaContactos = new ArrayList<>();
    private DefaultTableModel tableModel;
    private TableRowSorter<DefaultTableModel> sorter;
    private JFrame rootFrame;

    public AgendaGUi() {
        initComponents();
        rootFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        tableModel = (DefaultTableModel) contactosTabla.getModel();
        sorter = new TableRowSorter<>(tableModel);
        contactosTabla.setRowSorter(sorter);
        addButton.requestFocus();
        cargarContactos();

        contactosTabla.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                if (!lse.getValueIsAdjusting()) {
                    boolean isSelected = contactosTabla.getSelectedRow() != -1;
                    editButton.setEnabled(isSelected);
                    delButton.setEnabled(isSelected);

                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchPanel = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        advSearchButton = new javax.swing.JButton();
        buttonsPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        delButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        contactosTabla = new javax.swing.JTable();
        filterCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mi Agenda");
        setResizable(false);

        searchField.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        searchField.setForeground(java.awt.Color.lightGray);
        searchField.setText("Ingrese el nombre del contacto");
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFieldFocusLost(evt);
            }
        });
        searchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchFieldMouseClicked(evt);
            }
        });
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        searchButton.setText("Buscar");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        advSearchButton.setBackground(new java.awt.Color(206, 255, 244));
        advSearchButton.setText("Búsqueda Avanzada...");
        advSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advSearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addComponent(searchField)
                .addGap(18, 18, 18)
                .addComponent(searchButton))
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(advSearchButton))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(advSearchButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addButton.setText("Nuevo Contacto");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setText("Editar Contacto");
        editButton.setEnabled(false);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        delButton.setText("Eliminar Contacto");
        delButton.setEnabled(false);
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });

        contactosTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Nombre", "Tel.", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(contactosTabla);
        if (contactosTabla.getColumnModel().getColumnCount() > 0) {
            contactosTabla.getColumnModel().getColumn(0).setResizable(false);
            contactosTabla.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        filterCombo.setBackground(new java.awt.Color(51, 255, 255));
        filterCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ver Todos", "Ver Favoritos" }));
        filterCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filterComboItemStateChanged(evt);
            }
        });

        jLabel1.setText("Filtrar por:");

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addComponent(addButton)
                .addGap(18, 18, 18)
                .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(delButton))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filterCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filterCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        AgregarGUI agregarWindow = new AgregarGUI(this, rootPaneCheckingEnabled,
                listaContactos, tableModel);
        agregarWindow.setVisible(true);

    }//GEN-LAST:event_addButtonActionPerformed

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed

        int selectedRow = contactosTabla.getSelectedRow();

        int realSelectedRow = contactosTabla.convertRowIndexToModel(selectedRow);

        String selectedContact = (String) tableModel.getValueAt(realSelectedRow, 0);

        for (Contacto contacto : listaContactos) {
            if (contacto.getNombre().equals(selectedContact)) {
                listaContactos.remove(contacto);
                break;
            }
        }

        tableModel.removeRow(realSelectedRow);

    }//GEN-LAST:event_delButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed

        int index = contactosTabla.getSelectedRow();

        String nombre = (String) tableModel.getValueAt(index, 1);
        String telefono = (String) tableModel.getValueAt(index, 2);
        String email = (String) tableModel.getValueAt(index, 3);
        Contacto contacto = null;
        
        for (Contacto contactFound : listaContactos) {
            if (contactFound.getNombre().equals(nombre)) {
                contacto = contactFound;
            }
        }

        EditarGUi editarWindow = new EditarGUi(this, rootPaneCheckingEnabled,
                nombre, telefono, email, tableModel, index, listaContactos, contacto);
        editarWindow.setVisible(true);

    }//GEN-LAST:event_editButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        String searchText = searchField.getText().trim().toLowerCase();

        limpiarTabla();

        for (Contacto contacto : listaContactos) {
            if (contacto.getNombre().toLowerCase().startsWith(searchText)) {
                tableModel.addRow(new Object[]{
                    "", contacto.getNombre(), contacto.getTel(), contacto.getEmail()
                });
            }
        }

    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFieldMouseClicked

        searchField.setText("");
        searchField.setFont(new Font("Tahoma", Font.PLAIN, 11));
        searchField.setForeground(Color.BLACK);


    }//GEN-LAST:event_searchFieldMouseClicked

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed

        searchButtonActionPerformed(evt);

    }//GEN-LAST:event_searchFieldActionPerformed

    private void advSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advSearchButtonActionPerformed

        AdvSearchGUI advWindow = new AdvSearchGUI(this, true, this);
        advWindow.setVisible(true);


    }//GEN-LAST:event_advSearchButtonActionPerformed


    private void searchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusLost

        if (searchField.getText().isEmpty()) {
            searchField.setText("Ingrese el nombre del contacto");
            searchField.setForeground(Color.LIGHT_GRAY);
            searchField.setFont(new Font("Tahoma", Font.ITALIC, 11));
        }
    }//GEN-LAST:event_searchFieldFocusLost

    private void filterComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filterComboItemStateChanged
        if (filterCombo.getSelectedIndex() == 0) {
            filterAll();
        } else {
            filterFavs();
        }
    }//GEN-LAST:event_filterComboItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton advSearchButton;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JTable contactosTabla;
    private javax.swing.JButton delButton;
    private javax.swing.JButton editButton;
    private javax.swing.JComboBox<String> filterCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel searchPanel;
    // End of variables declaration//GEN-END:variables

    private void cargarContactos() {

        listaContactos.add(new Contacto("Beethoven", "46336464",
                "betito@gmail.com"));
        listaContactos.add(new Contacto("Huston", "46129797",
                "husto_mecopia@gmail.com"));
        listaContactos.add(new Contacto("Commander Shepard", "46129797",
                "sheplo@gmail.com"));
        listaContactos.add(new Contacto("Liara T'Soni", "46784545",
                "azure@gmail.com"));
        listaContactos.add(new Contacto("Urdnot Wrex", "46133434",
                "headbutt@gmail.com"));
        listaContactos.add(new Contacto("Garrus Vakarian", "46788989",
                "arcangel@gmail.com"));

        for (Contacto contacto : listaContactos) {
            Object[] contactos = {"", contacto.getNombre(),
                contacto.getTel(), contacto.getEmail()};
            tableModel.addRow(contactos);
        }

        contactosTabla.setModel(tableModel);

    }

    private void limpiarTabla() {
        int filas = contactosTabla.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            tableModel.removeRow(i);
        }

    }

    public void busquedaAvanzada(String nombre, String tel,
            String mail, boolean fav) {

        limpiarTabla();

        String nombreContacto;
        String telContacto;
        String emailContacto;

        for (Contacto contacto : listaContactos) {

            nombreContacto = contacto.getNombre().toLowerCase();
            telContacto = contacto.getTel().toLowerCase();
            emailContacto = contacto.getEmail().toLowerCase();

            if (nombreContacto.startsWith(nombre) && telContacto.startsWith(tel)
                    && emailContacto.startsWith(mail) && contacto.isFav() == fav) {

                tableModel.addRow(new Object[]{
                    "", contacto.getNombre(), contacto.getTel(),
                    contacto.getEmail()
                });
            }
        }
    }

    private void filterAll() {
        limpiarTabla();

        for (Contacto contacto : listaContactos) {
            tableModel.addRow(new Object[]{
                "", contacto.getNombre(), contacto.getTel(), contacto.getEmail()
            });
        }
    }

    private void filterFavs() {
        limpiarTabla();

        for (Contacto contacto : listaContactos) {
            if (contacto.isFav()) {
                tableModel.addRow(new Object[]{
                    "", contacto.getNombre(), contacto.getTel(), contacto.getEmail()
                });
            }
        }
    }

}