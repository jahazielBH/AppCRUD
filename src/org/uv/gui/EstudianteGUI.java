package org.uv.gui;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.uv.dao.IEstudianteDao;
import org.uv.factory.FactoryDAO;
import org.uv.model.Estudiante;

/**
 *
 * @author jahaziel1999
 */
public class EstudianteGUI extends javax.swing.JInternalFrame {

    private static EstudianteGUI gui = null;
    private Estudiante estudiante;
    private String msg;
    IEstudianteDao idao;
    DefaultTableModel modelo = new DefaultTableModel();

    public static EstudianteGUI getInstance() {
        if (gui == null) {
            gui = new EstudianteGUI();
        }
        return gui;
    }

    public EstudianteGUI() {
        initComponents();
        idao = FactoryDAO.createDao(FactoryDAO.TypeDAO.ESTUDIANTE);
    }

    public void limpiar() {
        txtClave.setText("");
        txtNombre.setText("");
        txtApellidoPat.setText("");
        txtApellidoMat.setText("");
        cbxGenero.getSelectedIndex();
        txtEdad.setText("");
        txtMatricula.setText("");
        txtNombreC.setText("");
    }
    
    public void listar(){
        List<Estudiante> estudiantes;
        estudiantes = idao.getAll();
        modelo = (DefaultTableModel) tablaEmpl.getModel();
        Object[] ob = new Object[8];
        for (int i = 0; i < estudiantes.size(); i++) {
            ob[0] = estudiantes.get(i).getId();
            ob[1] = estudiantes.get(i).getNombre();
            ob[2] = estudiantes.get(i).getApellidopat();
            ob[3] = estudiantes.get(i).getApellidomat();
            ob[4] = estudiantes.get(i).getSexo();
            ob[5] = estudiantes.get(i).getEdad();
            ob[6] = estudiantes.get(i).getMatricula();
            ob[7] = estudiantes.get(i).getNomCarrera();
            modelo.addRow(ob);
        }
        tablaEmpl.setModel(modelo);
    }

    public void limpiarTabla() {
        int numDatos = modelo.getRowCount();
        for (int i = 0; i < numDatos; i++) {
            modelo.removeRow(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBarEmp = new javax.swing.JToolBar();
        btoGuardar = new javax.swing.JButton();
        btoActualizar = new javax.swing.JButton();
        btoEliminar = new javax.swing.JButton();
        btoBuscar = new javax.swing.JButton();
        btoMostrar = new javax.swing.JButton();
        btoLimpiar = new javax.swing.JButton();
        desktopEmp = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrar = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidoPat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidoMat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNombreC = new javax.swing.JTextField();
        cbxGenero = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEmpl = new javax.swing.JTable();

        setClosable(true);
        setTitle("Sistema CRUD de Estudiantes");
        setMinimumSize(new java.awt.Dimension(35, 33));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1200, 550));
        setVisible(true);

        menuBarEmp.setBackground(java.awt.Color.white);
        menuBarEmp.setFloatable(false);
        menuBarEmp.setRollover(true);

        btoGuardar.setBackground(java.awt.Color.white);
        btoGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/uv/resource/nuevo.png"))); // NOI18N
        btoGuardar.setToolTipText("Guardar");
        btoGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btoGuardar.setFocusable(false);
        btoGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoGuardarActionPerformed(evt);
            }
        });
        menuBarEmp.add(btoGuardar);

        btoActualizar.setBackground(java.awt.Color.white);
        btoActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/uv/resource/pencil.png"))); // NOI18N
        btoActualizar.setToolTipText("Actualizar");
        btoActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btoActualizar.setFocusable(false);
        btoActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoActualizarActionPerformed(evt);
            }
        });
        menuBarEmp.add(btoActualizar);

        btoEliminar.setBackground(java.awt.Color.white);
        btoEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/uv/resource/eliminar.png"))); // NOI18N
        btoEliminar.setToolTipText("Eliminar");
        btoEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btoEliminar.setFocusable(false);
        btoEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoEliminarActionPerformed(evt);
            }
        });
        menuBarEmp.add(btoEliminar);

        btoBuscar.setBackground(java.awt.Color.white);
        btoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/uv/resource/buscar.png"))); // NOI18N
        btoBuscar.setToolTipText("Buscar por ID");
        btoBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btoBuscar.setFocusable(false);
        btoBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoBuscarActionPerformed(evt);
            }
        });
        menuBarEmp.add(btoBuscar);

        btoMostrar.setBackground(java.awt.Color.white);
        btoMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/uv/resource/lista.png"))); // NOI18N
        btoMostrar.setToolTipText("Mostrar Todos");
        btoMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btoMostrar.setFocusable(false);
        btoMostrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoMostrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoMostrarActionPerformed(evt);
            }
        });
        menuBarEmp.add(btoMostrar);

        btoLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/uv/resource/eraser.png"))); // NOI18N
        btoLimpiar.setToolTipText("Limpiar Tabla");
        btoLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btoLimpiar.setFocusable(false);
        btoLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoLimpiarActionPerformed(evt);
            }
        });
        menuBarEmp.add(btoLimpiar);

        getContentPane().add(menuBarEmp, java.awt.BorderLayout.PAGE_START);

        desktopEmp.setBackground(java.awt.Color.white);
        desktopEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        desktopEmp.setMaximumSize(new java.awt.Dimension(600, 450));
        desktopEmp.setMinimumSize(new java.awt.Dimension(600, 450));
        desktopEmp.setPreferredSize(new java.awt.Dimension(600, 250));

        mostrar.setEditable(false);
        mostrar.setColumns(20);
        mostrar.setRows(5);
        jScrollPane1.setViewportView(mostrar);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("ID:");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setText("Genero:");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setText("Edad:");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Apellido Paterno:");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setText("Matricula:");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("Apellido Materno:");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setText("Nombre de Carrera:");

        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Hombre", "Mujer" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidoPat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtApellidoMat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreC))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cbxGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxGenero))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEdad))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidoPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtMatricula))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellidoMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombreC))
                .addGap(28, 28, 28))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tablaEmpl.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        tablaEmpl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO PATERNO", "APELLIDO MATERNO", "SEXO", "EDAD", "MATRICULA", "CARRERA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEmpl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(tablaEmpl);
        if (tablaEmpl.getColumnModel().getColumnCount() > 0) {
            tablaEmpl.getColumnModel().getColumn(0).setPreferredWidth(1);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout desktopEmpLayout = new javax.swing.GroupLayout(desktopEmp);
        desktopEmp.setLayout(desktopEmpLayout);
        desktopEmpLayout.setHorizontalGroup(
            desktopEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopEmpLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(desktopEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopEmpLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(desktopEmpLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                        .addGap(34, 34, 34))))
        );
        desktopEmpLayout.setVerticalGroup(
            desktopEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(desktopEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(desktopEmp, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btoActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoActualizarActionPerformed
        try {
            estudiante = new Estudiante();
            estudiante.setId(Long.parseLong(txtClave.getText()));
            estudiante.setNombre(txtNombre.getText());
            estudiante.setApellidopat(txtApellidoPat.getText());
            estudiante.setApellidomat(txtApellidoMat.getText());
            String genero = (String) cbxGenero.getSelectedItem();
            estudiante.setSexo(genero);
            estudiante.setEdad(Integer.parseInt(txtEdad.getText()));
            estudiante.setMatricula(txtMatricula.getText());
            estudiante.setNomCarrera(txtNombreC.getText());
            idao.update(estudiante);
            limpiar();
            msg = "REGISTRO ACTUALIZADO: \n"
                    + "ID: " + estudiante.getId() + "\n"
                    + "NOMBRE: " + estudiante.getNombre() + "\n"
                    + "APELLIDO PATERNO: " + estudiante.getApellidopat() + "\n"
                    + "APELLIDO MATERNO: " + estudiante.getApellidomat() + "\n"
                    + "GENERO: " + estudiante.getSexo() + "\n"
                    + "EDAD: " + estudiante.getEdad() + "\n"
                    + "MATRICULA: " + estudiante.getMatricula() + "\n"
                    + "CARRERA: " + estudiante.getNomCarrera() + "\n";
        } catch (Exception e) {
            msg = "ERROR AL ACTUALIZAR SUS DATOS"
                    + "\n CAMPOS VACIOS U REGISTRI NO EXISTE";
            Logger logger = Logger.getLogger(EstudianteGUI.class.getName());
            LogRecord r = new LogRecord(Level.INFO, msg + e.getMessage());
            logger.log(r);
        }
        mostrar.setText(msg);
        limpiarTabla();
    }//GEN-LAST:event_btoActualizarActionPerformed

    private void btoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoGuardarActionPerformed
        try {
            estudiante = new Estudiante();
            estudiante.setId(Long.parseLong(txtClave.getText()));
            estudiante.setNombre(txtNombre.getText());
            estudiante.setApellidopat(txtApellidoPat.getText());
            estudiante.setApellidomat(txtApellidoMat.getText());
            String genero = (String) cbxGenero.getSelectedItem();
            estudiante.setSexo(genero);
            estudiante.setEdad(Integer.parseInt(txtEdad.getText()));
            estudiante.setMatricula(txtMatricula.getText());
            estudiante.setNomCarrera(txtNombreC.getText());
            idao.add(estudiante);
            limpiar();
            msg = "NUEVO REGISTRO: \n"
                    + "ID: " + estudiante.getId() + "\n"
                    + "NOMBRE: " + estudiante.getNombre() + "\n"
                    + "APELLIDO PATERNO: " + estudiante.getApellidopat() + "\n"
                    + "APELLIDO MATERNO: " + estudiante.getApellidomat() + "\n"
                    + "GENERO: " + estudiante.getSexo() + "\n"
                    + "EDAD: " + estudiante.getEdad() + "\n"
                    + "MATRICULA: " + estudiante.getMatricula() + "\n"
                    + "CARRERA: " + estudiante.getNomCarrera() + "\n";
        } catch (Exception e) {
            msg = "ERROR AL REGISTRAR"
                    + "\n CAMPOS VACIOS";
            Logger logger = Logger.getLogger(EstudianteGUI.class.getName());
            LogRecord r = new LogRecord(Level.INFO, msg + e.getMessage());
            logger.log(r);
        }
        mostrar.setText(msg);
        limpiarTabla();
    }//GEN-LAST:event_btoGuardarActionPerformed

    private void btoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoEliminarActionPerformed
        try {
            idao.delete(Long.parseLong(txtClave.getText()));
            limpiar();
            msg = "REGISTRO ELIMINADO";
        } catch (Exception e) {
            msg = "ERROR AL ALIMINAR REGISTRO";
            Logger logger = Logger.getLogger(EstudianteGUI.class.getName());
            LogRecord r = new LogRecord(Level.INFO, msg + e.getMessage());
            logger.log(r);
        }
        mostrar.setText(msg);
        limpiarTabla();
        listar();
    }//GEN-LAST:event_btoEliminarActionPerformed

    private void btoMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoMostrarActionPerformed
        listar();
    }//GEN-LAST:event_btoMostrarActionPerformed

    private void btoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoBuscarActionPerformed
        try {
            List<Estudiante> estudiantes = new ArrayList<>();
            Estudiante e = (Estudiante) idao.getById(Long.parseLong(txtClave.getText()));
            estudiantes.add(e);
            modelo = (DefaultTableModel) tablaEmpl.getModel();
            Object[] ob = new Object[8];
            for (int i = 0; i < estudiantes.size(); i++) {
                ob[0] = estudiantes.get(i).getId();
                ob[1] = estudiantes.get(i).getNombre();
                ob[2] = estudiantes.get(i).getApellidopat();
                ob[3] = estudiantes.get(i).getApellidomat();
                ob[4] = estudiantes.get(i).getSexo();
                ob[5] = estudiantes.get(i).getEdad();
                ob[6] = estudiantes.get(i).getMatricula();
                ob[7] = estudiantes.get(i).getNomCarrera();
                modelo.addRow(ob);
            }
            tablaEmpl.setModel(modelo);
        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_btoBuscarActionPerformed

    private void btoLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoLimpiarActionPerformed
        limpiarTabla();
    }//GEN-LAST:event_btoLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btoActualizar;
    private javax.swing.JButton btoBuscar;
    private javax.swing.JButton btoEliminar;
    private javax.swing.JButton btoGuardar;
    private javax.swing.JButton btoLimpiar;
    private javax.swing.JButton btoMostrar;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JPanel desktopEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar menuBarEmp;
    private javax.swing.JTextArea mostrar;
    private javax.swing.JTable tablaEmpl;
    private javax.swing.JTextField txtApellidoMat;
    private javax.swing.JTextField txtApellidoPat;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreC;
    // End of variables declaration//GEN-END:variables
}
