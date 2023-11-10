
package AlumnoInscripcion.Vistas;

import AlumnoInscripcion.AccesoADatos.*;
import AlumnoInscripcion.entidades.*;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ListarPorAlumno extends javax.swing.JInternalFrame {

   
    
    
    private ArrayList<Materia> listarMaterias;   
    
        
        private ArrayList<Materia> listmat; 
    private ArrayList<Alumno> listalum; 
    private ArrayList<Inscripcion>listainsc;

    private AlumnoData alumData;
    private MateriaData matData;
    private InscripcionData inscData;


    private DefaultTableModel modelo;
    
        
        

    public ListarPorAlumno() {
        initComponents();
        
        
              this.setTitle("Consulta Alumnos por Materia");
        alumData= new AlumnoData(); // inicializo 
        listalum= (ArrayList<Alumno>)alumData.listarAlumnos();
        modelo = new DefaultTableModel();
        matData = new MateriaData(); // inicializo
        listmat = (ArrayList<Materia>) matData.listarMaterias(); 
        inscData = new InscripcionData(); // Inicializa inscData
        listainsc = (ArrayList<Inscripcion>) inscData.obtenerAlumnosXMateria();
        armarCabecera();
        cargarMateria();
    }
    
       private void cargarMateria() {
        for (Materia materia : listmat) {
            JCBMaterias.addItem(materia);
        }
}

    private void armarCabecera() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("id");
        filaCabecera.add("dni");
        filaCabecera.add("apellido");
        filaCabecera.add("nombre");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
       jTable1.setModel(modelo);
}
     private void borrarFilaTabla() { // esta bien
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) { // hacemos una interaccion y removiendo 
            modelo.removeRow(i);
        }
    }

     private void cargarAlumnosPorMateria() {
    borrarFilaTabla();
    Materia selectedMateria = (Materia) JCBMaterias.getSelectedItem();
    
    if (selectedMateria != null) {
        int idMateria = selectedMateria.getIdMateria();
        ArrayList<Alumno> alumnos = new ArrayList<>();
        
        for (Alumno alumno : listalum) {
            int idAlumno = alumno.getIdAlumno();
            boolean alumnoInscrito = false;
            
           
            for (Inscripcion inscripcion : listainsc) {
                if (inscripcion.getAlumno().getIdAlumno()== idAlumno && inscripcion.getMateria().getIdMateria() == idMateria) {
                    alumnoInscrito = true;
                    break;
                }
            }
            
            if (alumnoInscrito) {
                alumnos.add(alumno);
            }
        }
        
        for (Alumno alumno : alumnos) {
            modelo.addRow(new Object[]{alumno.getIdAlumno(), alumno.getDni(), alumno.getApellido(), alumno.getNombre()});
        }
    }
}
     
    
  
  

  
  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JLSeleccione = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JCBMaterias = new javax.swing.JComboBox<>();
        JBSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 153));
        setTitle("Listado de Materias por Alumno");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JLSeleccione.setText("Seleccione Materia");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "DNI", "Apellido", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        JCBMaterias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCBMaterias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCBMateriasItemStateChanged(evt);
            }
        });
        JCBMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBMateriasActionPerformed(evt);
            }
        });

        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(JLSeleccione)
                                .addGap(64, 64, 64)
                                .addComponent(JCBMaterias, 0, 193, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 72, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLSeleccione)
                    .addComponent(JCBMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(JBSalir)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_JBSalirActionPerformed

    private void JCBMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBMateriasActionPerformed
  
    }//GEN-LAST:event_JCBMateriasActionPerformed

    private void JCBMateriasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCBMateriasItemStateChanged

    }//GEN-LAST:event_JCBMateriasItemStateChanged
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBSalir;
    private javax.swing.JComboBox<String> JCBMaterias;
    private javax.swing.JLabel JLSeleccione;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
