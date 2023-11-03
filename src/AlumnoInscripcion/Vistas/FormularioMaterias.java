
package AlumnoInscripcion.Vistas;

import AlumnoInscripcion.AccesoADatos.MateriaData;
import AlumnoInscripcion.entidades.Materia;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;



public class FormularioMaterias extends javax.swing.JInternalFrame {

    private MateriaData matData=new MateriaData();
    private Materia materiaActual=null;
    
    
    public FormularioMaterias() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JLCodigo = new javax.swing.JLabel();
        JTCodigo = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        JLAsignatura = new javax.swing.JLabel();
        JTAsignatura = new javax.swing.JTextField();
        JLAnio = new javax.swing.JLabel();
        JTAnio = new javax.swing.JTextField();
        JLEstado = new javax.swing.JLabel();
        JRBEstado = new javax.swing.JRadioButton();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 153));
        setTitle("Gestion de Materias");

        JLCodigo.setText("Codigo de materia:");

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        JLAsignatura.setText("Asignatura:");

        JLAnio.setText("Año:");

        JLEstado.setText("Estado");

        JRBEstado.setText("Activo");

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(jbSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLCodigo)
                            .addComponent(JLAnio)
                            .addComponent(JLEstado)
                            .addComponent(JLAsignatura))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(JTAsignatura)
                                    .addComponent(JTAnio))
                                .addGap(38, 38, 38)
                                .addComponent(jbBuscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(JRBEstado)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLCodigo)
                    .addComponent(JTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLAsignatura)
                    .addComponent(JTAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLAnio)
                    .addComponent(JTAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLEstado)
                    .addComponent(JRBEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbNuevo)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir))
                .addGap(34, 34, 34))
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

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
         if (materiaActual!=null){
            matData.eliminarMateria (materiaActual.getIdMateria());
            materiaActual=null;
            limpiarCampos();
        }else{
            JOptionPane.showMessageDialog(this,"No hay una materia seleccionada");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
       limpiarCampos();
        materiaActual=null;
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
       try{
        String asignatura=JTAsignatura.getText();
        Integer anio=Integer.parseInt(JTAnio.getText());
        
        if(asignatura.isEmpty()){
            JOptionPane.showMessageDialog(this,"No puede haber campos vacios");
            return;
        }
        
        Boolean estado=JRBEstado.isSelected();
        if (materiaActual==null){
            
           materiaActual=new Materia(asignatura,anio, estado);
           matData.guardarMateria(materiaActual);
            
        }else {
            materiaActual.setAsignatura(asignatura);
            materiaActual.setAnio(anio);
            
            matData.modificarMateria(materiaActual);
                       
        } 
    }//GEN-LAST:event_jbGuardarActionPerformed
        catch(NumberFormatException nfe){
         JOptionPane.showMessageDialog(this,"Debe ingresar un numero de id valido");   
        } 
    }
    
    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try{
            Integer idMateria=Integer.parseInt(JTCodigo.getText());
            materiaActual=matData.buscarMateria(idMateria);
            if(materiaActual!=null){

                JTAsignatura.setText(materiaActual.getAsignatura());
                JTAnio.setText(materiaActual.getAnio()+""); //comillas porque anio es int
                JRBEstado.setSelected(materiaActual.isActivo());

            }

        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Debe ingresar un numero de id valido");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed
        


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLAnio;
    private javax.swing.JLabel JLAsignatura;
    private javax.swing.JLabel JLCodigo;
    private javax.swing.JLabel JLEstado;
    private javax.swing.JRadioButton JRBEstado;
    private javax.swing.JTextField JTAnio;
    private javax.swing.JTextField JTAsignatura;
    private javax.swing.JTextField JTCodigo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    // End of variables declaration//GEN-END:variables

private void limpiarCampos(){
    JTCodigo.setText("");
    JTAsignatura.setText("");
    JTAnio.setText("");
    JRBEstado.setSelected(true);
}

}

