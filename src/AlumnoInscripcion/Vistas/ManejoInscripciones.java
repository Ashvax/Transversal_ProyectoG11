
package AlumnoInscripcion.Vistas;

import AlumnoInscripcion.AccesoADatos.AlumnoData;
import AlumnoInscripcion.AccesoADatos.InscripcionData;
import AlumnoInscripcion.AccesoADatos.MateriaData;
import AlumnoInscripcion.entidades.Alumno;
import AlumnoInscripcion.entidades.Inscripcion;
import AlumnoInscripcion.entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;



public class ManejoInscripciones extends javax.swing.JInternalFrame {
    
    private List<Materia> listaM; 
    private List<Alumno> listaA; 
    
    private InscripcionData inscData; 
    private MateriaData mData; 
    private AlumnoData aData; 

    private DefaultTableModel modelo; 
  
    public ManejoInscripciones() {
        initComponents();
        
        aData = new AlumnoData();
        listaA = (List <Alumno>)aData.listarAlumnos(); 
        modelo = new DefaultTableModel(); 
        cargaAlumnos(); 
        armarCabeceraTabla(); 
        inscData = new InscripcionData(); 
        mData = new MateriaData(); 
        
        
          
             
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JLSeleccion = new javax.swing.JLabel();
        cboxAlumno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTMaterias = new javax.swing.JTable();
        JBInscribir = new javax.swing.JButton();
        JBAnular = new javax.swing.JButton();
        JBSalir = new javax.swing.JButton();
        JRBInscriptas = new javax.swing.JRadioButton();
        JRBNoInscriptas = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(0, 0, 204));
        setTitle("Formulario de Inscripcion");

        JLSeleccion.setText("Seleccione un alumno:");

        cboxAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxAlumnoActionPerformed(evt);
            }
        });

        jLabel2.setText("Listado de Materias");

        JTMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JTMaterias);

        JBInscribir.setText("Inscribir");
        JBInscribir.setEnabled(false);
        JBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBInscribirActionPerformed(evt);
            }
        });

        JBAnular.setText("Anular Inscripcion");
        JBAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAnularActionPerformed(evt);
            }
        });

        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        JRBInscriptas.setText("Materias Inscriptas");
        JRBInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBInscriptasActionPerformed(evt);
            }
        });

        JRBNoInscriptas.setText("Materias no inscriptas");
        JRBNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBNoInscriptasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JLSeleccion)
                        .addGap(18, 18, 18)
                        .addComponent(cboxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(JBInscribir)
                .addGap(64, 64, 64)
                .addComponent(JBAnular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(JBSalir)
                .addGap(70, 70, 70))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(JRBInscriptas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JRBNoInscriptas)
                .addGap(104, 104, 104))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLSeleccion)
                    .addComponent(cboxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRBInscriptas)
                    .addComponent(JRBNoInscriptas))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBInscribir)
                    .addComponent(JBAnular)
                    .addComponent(JBSalir))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxAlumnoActionPerformed
        
      // TODO add your handling code here:
    }//GEN-LAST:event_cboxAlumnoActionPerformed

    private void JRBInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBInscriptasActionPerformed

        borrarFilaTabla();
        JRBNoInscriptas.setSelected(false);
        cargaDatosInscriptas();
        JBAnular.setEnabled(true);
        JBInscribir.setEnabled(false);

       
    }//GEN-LAST:event_JRBInscriptasActionPerformed

    private void JRBNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBNoInscriptasActionPerformed
        borrarFilaTabla();
        JRBInscriptas.setSelected(false);
        cargaDatosNoInscriptos();
        JBAnular.setEnabled(false);
        JBInscribir.setEnabled(true);
    }//GEN-LAST:event_JRBNoInscriptasActionPerformed

    private void JBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBInscribirActionPerformed
        int filaSeleccionada=JTMaterias.getSelectedRow();
        if(filaSeleccionada!=-1){
            
            Alumno a=(Alumno)cboxAlumno.getSelectedItem();
            
            int idMateria=(Integer)modelo.getValueAt(filaSeleccionada, 0);
            String nombreMateria=(String)modelo.getValueAt(filaSeleccionada, 2);
            int anio=(Integer)modelo.getValueAt(filaSeleccionada,1);
            Materia m=new Materia(idMateria,nombreMateria,anio,true);
            
            Inscripcion i=new Inscripcion(a, m, 0);
            inscData.guardarInscripcion(i);
            borrarFilaTabla();
            
            
        }
    }//GEN-LAST:event_JBInscribirActionPerformed

    private void JBAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAnularActionPerformed
        int filaSeleccionada=JTMaterias.getSelectedRow();
        if(filaSeleccionada!=-1){
         
            Alumno a=(Alumno)cboxAlumno.getSelectedItem();
            int idMateria=(Integer)modelo.getValueAt(filaSeleccionada,0);
            
            inscData.borrarInscripcion(idMateria, idMateria);
            borrarFilaTabla();
        }
    }//GEN-LAST:event_JBAnularActionPerformed

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_JBSalirActionPerformed
    
    private void cargaAlumnos(){
        for(Alumno item: listaA){
            cboxAlumno.addItem(item);
        }
    }
    
    private void armarCabeceraTabla(){
        ArrayList<Object> filaCabecera = new ArrayList<>(); 
        filaCabecera.add("ID"); 
        filaCabecera.add("Nombre"); 
        filaCabecera.add("Año"); 
        for(Object it: filaCabecera){
            modelo.addColumn(it); 
        }
        JTMaterias.setModel(modelo);
    }
    
    private void borrarFilaTabla(){
        int indice = modelo.getRowCount() -1; 
        for(int i = indice; i>=0; i--){
            modelo.removeRow(i);
        }
    }
    
    private void cargaDatosNoInscriptos(){
        
      Alumno selec =(Alumno)cboxAlumno.getSelectedItem(); 
        listaM = inscData.obtenerMateriasNoCursadas(selec.getIdAlumno()); 
        for(Materia m: listaM){
            modelo.addRow(new Object[]{m.getIdMateria(), m.getAnio(), m.getAsignatura()});
        }
    }
    
    private void cargaDatosInscriptas(){
    Alumno selec = (Alumno)cboxAlumno.getSelectedItem(); 
        List<Materia> lista= inscData.obtenerMateriasCursadas(selec.getIdAlumno()); 
        for(Materia m: lista){
            modelo.addRow(new Object[]{m.getIdMateria(), m.getAsignatura(), m.getAnio()});
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAnular;
    private javax.swing.JButton JBInscribir;
    private javax.swing.JButton JBSalir;
    private javax.swing.JLabel JLSeleccion;
    private javax.swing.JRadioButton JRBInscriptas;
    private javax.swing.JRadioButton JRBNoInscriptas;
    private javax.swing.JTable JTMaterias;
    private javax.swing.JComboBox<Alumno> cboxAlumno;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
