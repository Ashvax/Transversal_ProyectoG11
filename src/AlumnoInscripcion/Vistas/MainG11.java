
package AlumnoInscripcion.Vistas;


public class MainG11 extends javax.swing.JFrame {

    
    public MainG11() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        JMBOpc = new javax.swing.JMenuBar();
        JMAlumno = new javax.swing.JMenu();
        JMIFormAlumno = new javax.swing.JMenuItem();
        JMMateria = new javax.swing.JMenu();
        JMIFormMateria = new javax.swing.JMenuItem();
        JMAdmin = new javax.swing.JMenu();
        JMIInscripciones = new javax.swing.JMenuItem();
        JMINotas = new javax.swing.JMenuItem();
        JMConsultas = new javax.swing.JMenu();
        JMIListarXAlumno = new javax.swing.JMenuItem();
        JMSalir = new javax.swing.JMenu();
        jMISalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de Alumnos");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );

        JMBOpc.setBackground(new java.awt.Color(0, 0, 153));

        JMAlumno.setText("Alumno");

        JMIFormAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadejemplo/Vistas/imagenes/alumno 50x50.png"))); // NOI18N
        JMIFormAlumno.setText("Formulario de Alumno");
        JMIFormAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIFormAlumnoActionPerformed(evt);
            }
        });
        JMAlumno.add(JMIFormAlumno);

        JMBOpc.add(JMAlumno);

        JMMateria.setText("Materia");

        JMIFormMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadejemplo/Vistas/imagenes/materia.png"))); // NOI18N
        JMIFormMateria.setText("Formulario de Materias");
        JMIFormMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIFormMateriaActionPerformed(evt);
            }
        });
        JMMateria.add(JMIFormMateria);

        JMBOpc.add(JMMateria);

        JMAdmin.setText("Administracion");

        JMIInscripciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadejemplo/Vistas/imagenes/inscripcion.png"))); // NOI18N
        JMIInscripciones.setText("Manejo Inscripciones");
        JMIInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIInscripcionesActionPerformed(evt);
            }
        });
        JMAdmin.add(JMIInscripciones);

        JMINotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadejemplo/Vistas/imagenes/calificacion.png"))); // NOI18N
        JMINotas.setText("Manipulacion de Notas");
        JMINotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMINotasActionPerformed(evt);
            }
        });
        JMAdmin.add(JMINotas);

        JMBOpc.add(JMAdmin);

        JMConsultas.setText("Consultas");

        JMIListarXAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadejemplo/Vistas/imagenes/alumno por materia.png"))); // NOI18N
        JMIListarXAlumno.setText("Listar por alumno...");
        JMIListarXAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIListarXAlumnoActionPerformed(evt);
            }
        });
        JMConsultas.add(JMIListarXAlumno);

        JMBOpc.add(JMConsultas);

        JMSalir.setText("Salir");
        JMSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMSalirActionPerformed(evt);
            }
        });

        jMISalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadejemplo/Vistas/imagenes/cerrar-sesion.png"))); // NOI18N
        jMISalir.setText("Salir");
        jMISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISalirActionPerformed(evt);
            }
        });
        JMSalir.add(jMISalir);

        JMBOpc.add(JMSalir);

        setJMenuBar(JMBOpc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMIListarXAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIListarXAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ListarPorAlumno lpa=new ListarPorAlumno();
        lpa.setVisible(true);
        escritorio.add(lpa);
        escritorio.moveToFront(lpa);
    }//GEN-LAST:event_JMIListarXAlumnoActionPerformed

    private void JMIFormAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIFormAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioAlumno ba=new FormularioAlumno();
        ba.setVisible(true);
        escritorio.add(ba);
        escritorio.moveToFront(ba);
    }//GEN-LAST:event_JMIFormAlumnoActionPerformed

    private void JMIFormMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIFormMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioMaterias eem=new FormularioMaterias();
        eem.setVisible(true);
        escritorio.add(eem);
        escritorio.moveToFront(eem);
    }//GEN-LAST:event_JMIFormMateriaActionPerformed

    private void JMIInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIInscripcionesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ManejoInscripciones mi=new ManejoInscripciones();
        mi.setVisible(true);
        escritorio.add(mi);
        escritorio.moveToFront(mi);
    }//GEN-LAST:event_JMIInscripcionesActionPerformed

    private void JMINotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMINotasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ManipulacionNotas mn=new ManipulacionNotas();
        mn.setVisible(true);
        escritorio.add(mn);
        escritorio.moveToFront(mn);
    }//GEN-LAST:event_JMINotasActionPerformed

    private void JMSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMSalirActionPerformed
        dispose();
    }//GEN-LAST:event_JMSalirActionPerformed

    private void jMISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISalirActionPerformed
        dispose();
    }//GEN-LAST:event_jMISalirActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MainG11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainG11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainG11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainG11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainG11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMAdmin;
    private javax.swing.JMenu JMAlumno;
    private javax.swing.JMenuBar JMBOpc;
    private javax.swing.JMenu JMConsultas;
    private javax.swing.JMenuItem JMIFormAlumno;
    private javax.swing.JMenuItem JMIFormMateria;
    private javax.swing.JMenuItem JMIInscripciones;
    private javax.swing.JMenuItem JMIListarXAlumno;
    private javax.swing.JMenuItem JMINotas;
    private javax.swing.JMenu JMMateria;
    private javax.swing.JMenu JMSalir;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMISalir;
    // End of variables declaration//GEN-END:variables

    
    
}
