package mainFrame;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import mainFrame.otherFrames.AgregarGUI;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import mainFrame.otherFrames.AdvSearchGUI;
import mainFrame.otherFrames.DetalleGUI;

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

        contactosTabla.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                if (!lse.getValueIsAdjusting()) {
                    boolean isSelected = contactosTabla.getSelectedRow() != -1;
                    editButton.setEnabled(isSelected);
                    delButton.setEnabled(isSelected);
                    favButton.setEnabled(isSelected);

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
        favButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mi Agenda");
        setResizable(false);

        searchField.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        searchField.setForeground(java.awt.Color.lightGray);
        searchField.setText("Ingrese el nombre del contacto");
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFieldFocusLost(evt);
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

        editButton.setText("Ver Contacto");
        editButton.setEnabled(false);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        delButton.setBackground(new java.awt.Color(211, 132, 132));
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
        contactosTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactosTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(contactosTabla);
        if (contactosTabla.getColumnModel().getColumnCount() > 0) {
            contactosTabla.getColumnModel().getColumn(0).setMinWidth(30);
            contactosTabla.getColumnModel().getColumn(0).setPreferredWidth(30);
            contactosTabla.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        filterCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ver Todos", "Ver Favoritos" }));
        filterCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filterComboItemStateChanged(evt);
            }
        });

        jLabel1.setText("Filtrar por:");

        favButton.setBackground(new java.awt.Color(204, 255, 153));
        favButton.setForeground(new java.awt.Color(0, 102, 0));
        favButton.setText("★");
        favButton.setEnabled(false);
        favButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addComponent(addButton)
                .addGap(18, 18, 18)
                .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(delButton))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPanelLayout.createSequentialGroup()
                .addComponent(favButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(jLabel1)
                    .addComponent(favButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        favButton.getAccessibleContext().setAccessibleName("Contacto Favorito");

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
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        AgregarGUI agregarWindow = new AgregarGUI(this, rootPaneCheckingEnabled,
                listaContactos, tableModel, this);
        agregarWindow.setVisible(true);

    }//GEN-LAST:event_addButtonActionPerformed

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed

        int respuesta = JOptionPane.showConfirmDialog(this, "¿Esta seguro?", 
                " Eliminar Contacto", JOptionPane.OK_CANCEL_OPTION);
        
        if (respuesta == JOptionPane.CANCEL_OPTION) {
            return;
        }
        
        int selectedRow = contactosTabla.getSelectedRow();
        selectedRow = contactosTabla.convertRowIndexToModel(selectedRow);
        Contacto selectedContact = (Contacto) tableModel.getValueAt(selectedRow, 1);

        Iterator<Contacto> iterator = listaContactos.iterator();

        while (iterator.hasNext()) {
            Contacto contacto = iterator.next();
            if (contacto.equals(selectedContact)) {
                
                iterator.remove();
            }

        }

        tableModel.removeRow(selectedRow);

    }//GEN-LAST:event_delButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed

        DetalleGUI contactoWindow = new DetalleGUI(this, true, contactoSeleccionado(),
                listaContactos, contactosTabla, tableModel, this);
        contactoWindow.setVisible(true);

    }//GEN-LAST:event_editButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        String searchText = searchField.getText().trim().toLowerCase();

        limpiarTabla();

        for (Contacto contacto : listaContactos) {
            if (contacto.getNombre().toLowerCase().startsWith(searchText)
                    && contacto.isFav() == false) {
                tableModel.addRow(new Object[]{
                    "", contacto, contacto.getTel(), contacto.getEmail()
                });

            } else if (contacto.getNombre().toLowerCase().startsWith(searchText)
                    && contacto.isFav() == true) {
                tableModel.addRow(new Object[]{
                    "★", contacto, contacto.getTel(), contacto.getEmail()
                });
            }

        }

    }//GEN-LAST:event_searchButtonActionPerformed

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

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained

        if (!searchField.getText().isEmpty()
                && searchField.getForeground().equals(Color.LIGHT_GRAY)) {
            searchField.setText("");
            searchField.setFont(new Font("Tahoma", Font.PLAIN, 11));
            searchField.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_searchFieldFocusGained

    private void contactosTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactosTablaMouseClicked

        int fila;
        int columna;

        if (evt.getClickCount() == 2) {
            fila = contactosTabla.rowAtPoint(evt.getPoint());
            columna = contactosTabla.columnAtPoint(evt.getPoint());

            if (fila >= 0 && columna >= 0) {
                DetalleGUI contactoWindow = new DetalleGUI(this, true,
                        contactoSeleccionado(), listaContactos, contactosTabla,
                        tableModel, this);
                contactoWindow.setVisible(true);
            }
        }

    }//GEN-LAST:event_contactosTablaMouseClicked

    private void favButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favButtonActionPerformed

        int selectedRow = contactosTabla.getSelectedRow();
        selectedRow = contactosTabla.convertRowIndexToModel(selectedRow);

        Contacto contacto = contactoSeleccionado();
        String name = contacto.getNombre();

        // Modificar Lista de contactos y Tabla de contactos        
        for (Contacto contactoFound : listaContactos) {
            if (name.equals(contactoFound.getNombre()) && !contactoFound.isFav()) {

                contactoFound.setFav(true);
                tableModel.setValueAt("★", selectedRow, 0);
            } else if (name.equals(contactoFound.getNombre()) && contactoFound.isFav()) {

                contactoFound.setFav(false);
                tableModel.setValueAt("", selectedRow, 0);
            }
        }

        refrescarRenderDeTabla();

    }//GEN-LAST:event_favButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton advSearchButton;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JTable contactosTabla;
    private javax.swing.JButton delButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton favButton;
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
            Object[] contactos = {"", contacto,
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

    public void busquedaAvanzada(String nombre, String tel, String mail,
            boolean onlyFavs) {

        limpiarTabla();

        String nombreContacto;
        String telContacto;
        String emailContacto;

        for (Contacto contacto : listaContactos) {

            nombreContacto = contacto.getNombre().toLowerCase();
            telContacto = contacto.getTel().toLowerCase();
            emailContacto = contacto.getEmail().toLowerCase();

            if (nombreContacto.startsWith(nombre) && telContacto.startsWith(tel)
                    && emailContacto.startsWith(mail) && onlyFavs == false) {

                if (contacto.isFav()) {
                    tableModel.addRow(new Object[]{
                        "★", contacto, contacto.getTel(),
                        contacto.getEmail()
                    });
                } else {
                    tableModel.addRow(new Object[]{
                        "", contacto, contacto.getTel(),
                        contacto.getEmail()
                    });
                }

            } else if (nombreContacto.startsWith(nombre) && telContacto.startsWith(tel)
                    && emailContacto.startsWith(mail) && contacto.isFav() == true
                    && onlyFavs == true) {
                tableModel.addRow(new Object[]{
                    "★", contacto, contacto.getTel(),
                    contacto.getEmail()
                });
            }
        }
    }

    private void filterAll() {
        limpiarTabla();

        for (Contacto contacto : listaContactos) {
            if (contacto.isFav()) {
                tableModel.addRow(new Object[]{
                    "★", contacto, contacto.getTel(), contacto.getEmail()
                });
            } else {
                tableModel.addRow(new Object[]{
                    "", contacto, contacto.getTel(), contacto.getEmail()
                });
            }

        }
    }

    private void filterFavs() {
        limpiarTabla();

        for (Contacto contacto : listaContactos) {
            if (contacto.isFav()) {
                tableModel.addRow(new Object[]{
                    "★", contacto, contacto.getTel(), contacto.getEmail()
                });
            }
        }
    }

    private Contacto contactoSeleccionado() {

        int selectedRow = contactosTabla.getSelectedRow();
        selectedRow = contactosTabla.convertRowIndexToModel(selectedRow);

        Contacto selectedContact = (Contacto) tableModel.getValueAt(selectedRow, 1);

        for (Contacto contacto : listaContactos) {
            if (contacto.equals(selectedContact)) {
                return contacto;
            }
        }
        return null;
    }

    public void refrescarRenderDeTabla() {

        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {

                row = contactosTabla.convertRowIndexToModel(row);

                Component component = super.getTableCellRendererComponent(
                        contactosTabla, value, isSelected, hasFocus, row, column);

                String favString = (String) contactosTabla.getModel().getValueAt(row, 0);

                if (!isSelected) {
                    if (favString.equals("★")) {
                        component.setBackground(new Color(187, 255, 189));
                    } else {
                        component.setBackground(contactosTabla.getBackground());
                    }
                } else {
                    component.setBackground(contactosTabla.getSelectionBackground());
                }

                return component;
            }

        };

        contactosTabla.setDefaultRenderer(Object.class, renderer); // Object.class se utiliza para indicar que el renderizador se aplicará a todas las celdas sin importar el tipo de datos que contengan

    }

}
