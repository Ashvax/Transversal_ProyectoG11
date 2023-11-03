
package AlumnoInscripcion.Vistas;

import AlumnoInscripcion.AccesoADatos.AlumnoData;
import AlumnoInscripcion.entidades.Alumno;
import java.time.LocalDate;
import javax.swing.JOptionPane;

import java.time.ZoneId;



public class FormularioAlumno extends javax.swing.JInternalFrame {
    private AlumnoData aluData=new AlumnoData();
    private Alumno alumnoActual=null;
   
    public FormularioAlumno() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        JLDni = new javax.swing.JLabel();
        JLApellido = new javax.swing.JLabel();
        JLNombre = new javax.swing.JLabel();
        JBBuscar = new javax.swing.JButton();
        JTDni = new javax.swing.JTextField();
        JTApellido = new javax.swing.JTextField();
        JTNombre = new javax.swing.JTextField();
        JLEstado = new javax.swing.JLabel();
        JLFechaNac = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JRBEstado = new javax.swing.JRadioButton();
        JBNuevo = new javax.swing.JButton();
        JBGuardar = new javax.swing.JButton();
        JBEliminar = new javax.swing.JButton();
        JDCFechaNac = new com.toedter.calendar.JDateChooser();
        JBSalir = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(0, 0, 153));
        setTitle("Formulario Alumno");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JLDni.setText("DNI Alumno:");

        JLApellido.setText("Apellido:");

        JLNombre.setText("Nombre:");

        JBBuscar.setText("Buscar");
        JBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarActionPerformed(evt);
            }
        });

        JLEstado.setText("Estado");

        JLFechaNac.setText("Fecha de Nacimiento:");

        jLabel3.setText("Datos de Alumno");

        JRBEstado.setText("Activo");

        JBNuevo.setText("Nuevo");
        JBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNuevoActionPerformed(evt);
            }
        });

        JBGuardar.setText("Guardar");
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        JBEliminar.setText("Eliminar");
        JBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEliminarActionPerformed(evt);
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JBNuevo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLNombre)
                                    .addComponent(JLApellido)
                                    .addComponent(JLDni)
                                    .addComponent(JLEstado))
                                .addGap(53, 53, 53))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(JLFechaNac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(JBGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBEliminar)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(52, 300, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(JRBEstado)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JTNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(JTDni, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(JTApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                                    .addComponent(JDCFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(35, 35, 35)
                        .addComponent(JBSalir)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLDni)
                    .addComponent(JTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLApellido)
                            .addComponent(JTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(JBSalir)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(JLEstado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLNombre)
                            .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JRBEstado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JDCFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBBuscar)
                            .addComponent(JBGuardar)
                            .addComponent(JBEliminar)
                            .addComponent(JBNuevo)))
                    .addComponent(JLFechaNac))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarActionPerformed
      try{
          Integer dni=Integer.parseInt(JTDni.getText());
          alumnoActual=aluData.buscarAlumnoPorDni(dni);
          if(alumnoActual!=null){
              
              JTApellido.setText(alumnoActual.getApellido());
              JTNombre.setText(alumnoActual.getNombre());
              JRBEstado.setSelected(alumnoActual.isActivo());
              LocalDate lc=alumnoActual.getFechaNac();
              java.util.Date date=java.util.Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
              JDCFechaNac.setDate(date);
          }
          
      }catch (NumberFormatException ex){
          JOptionPane.showMessageDialog(this,"Debe ingresar un numero de DNI valido");
      }  
    }//GEN-LAST:event_JBBuscarActionPerformed

    private void JBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNuevoActionPerformed
        limpiarCampos();
        alumnoActual=null;
    }//GEN-LAST:event_JBNuevoActionPerformed

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        try{
        Integer dni=Integer.parseInt(JTDni.getText());
        String nombre=JTNombre.getText();
        String apellido=JTApellido.getText();
        if(nombre.isEmpty()|| apellido.isEmpty()){
            JOptionPane.showMessageDialog(this,"No puede haber campos vacios");
            return;
        }
        
        java.util.Date sfecha=JDCFechaNac.getDate();
       LocalDate fechaNacimiento=sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Boolean estado=JRBEstado.isSelected();
        if (alumnoActual==null){
            
           alumnoActual=new Alumno(dni, apellido, nombre, fechaNacimiento, estado);
           aluData.guardarAlumno(alumnoActual);
            
        }else {
            alumnoActual.setDni(dni);
            alumnoActual.setApellido(apellido);
            alumnoActual.setNombre(nombre);
            alumnoActual.setFechaNac(fechaNacimiento);
            aluData.modificarAlumno(alumnoActual);
            
        }
        
        
        }catch(NumberFormatException nfe){
         JOptionPane.showMessageDialog(this,"Debe ingresar un numero de DNI valido");   
        }  
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void JBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEliminarActionPerformed
        
        if (alumnoActual!=null){
            aluData.borrarAlumno(alumnoActual.getIdAlumno());
            alumnoActual=null;
            limpiarCampos();
        }else{
            JOptionPane.showMessageDialog(this,"No hay un alumno seleccionado");
        }
    }//GEN-LAST:event_JBEliminarActionPerformed

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
dispose();       
    }//GEN-LAST:event_JBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBuscar;
    private javax.swing.JButton JBEliminar;
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBNuevo;
    private javax.swing.JButton JBSalir;
    private com.toedter.calendar.JDateChooser JDCFechaNac;
    private javax.swing.JLabel JLApellido;
    private javax.swing.JLabel JLDni;
    private javax.swing.JLabel JLEstado;
    private javax.swing.JLabel JLFechaNac;
    private javax.swing.JLabel JLNombre;
    private javax.swing.JRadioButton JRBEstado;
    private javax.swing.JTextField JTApellido;
    private javax.swing.JTextField JTDni;
    private javax.swing.JTextField JTNombre;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

private void limpiarCampos(){
    JTDni.setText("");
    JTApellido.setText("");
    JTNombre.setText("");
    JRBEstado.setSelected(true);
    //JDCFechaNac.setDate((new Date));
}

    private static class sfecha {

        public sfecha() {
        }
    }

}


