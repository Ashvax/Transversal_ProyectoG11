package transversal_proyectog11.AccesoADatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import transversal_proyectog11.entidades.Alumno;
import transversal_proyectog11.entidades.Inscripcion;
import transversal_proyectog11.entidades.Materia;
public class InscripcionData {
     private Connection con;
      private MateriaData md=new MateriaData();
      private AlumnoData ad=new AlumnoData();
      
      
    public InscripcionData() {
        con = Conexion.getconexion();
    }

    public void guardarInscripcion(Inscripcion inscripcion) {
        String sql = "INSERT INTO inscripcion(nota, idAlumno, idMateria) VALUES(?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, inscripcion.getNota());
            ps.setInt(2, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(3, inscripcion.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                inscripcion.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion Registrada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion");
        }
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        String sql="UPDATE inscripcion SET nota = ? WHERE idAlumno = ? and idMateria = ? ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            
            int filas=ps.executeUpdate();
            if(filas>0){
                JOptionPane.showMessageDialog(null, "Nota Actualizada");
            }
            ps.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripción");
        }
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno ,int idMateria){
        String sql="DELETE FROM inscripcion WHERE idAlumno = ? and idMateria = ?";
        
        try {
             PreparedStatement ps=con.prepareStatement(sql);
             ps.setInt(1, idAlumno);
             ps.setInt(2, idMateria);
             
             int filas=ps.executeUpdate();
             if(filas>0){
                 JOptionPane.showMessageDialog(null, "Inscripcion Borrada");
             }
             
             ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "");
        }
        
    }
    
    public List<Inscripcion> obtenerInscripciones() {
        ArrayList<Inscripcion> cursadas = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion insc=new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumno alu=ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat=md.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("nota"));
                cursadas.add(insc);
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion");
        }
        return cursadas;
    }

     public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) {
        ArrayList<Inscripcion> alcursadas = new ArrayList<>();
        String sql = "SELECT * WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            Inscripcion insc=new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumno alu=ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat=md.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("nota"));
                alcursadas.add(insc);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion");
        }
        return alcursadas;
     }
     
     public List<Materia> obtenerMateriasCursadas(int idAlumno){
         ArrayList<Materia> materias=new ArrayList<>();
         String sql="SELECT inscripcion.idMateria, nombre, anioMateria FROM inscripcion,"
                 + "materia WHERE inscripcion.idMateria = materia.idMateria"+
                 "AND inscripcion.idAlumno = ?; ";
          try {
              PreparedStatement ps=con.prepareStatement(sql);
              ps.setInt(1, idAlumno);
              ResultSet rs=ps.executeQuery();
              while (rs.next()){
                  
                  Materia materia=new Materia();
                  materia.setIdMateria(rs.getInt("idMateria"));
                  materia.setNombre(rs.getString("nombre"));
                  materia.setAnioMateria(rs.getInt("anioMateria"));
                  materias.add(materia);
              }
              
              ps.close();
          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion");
          }
          return materias;
     }
     
     public List<Materia> obtenerMateriasNoCursadas(int idAlumno){
         ArrayList<Materia> materias=new ArrayList<>();
         
         String sql="SELECT * FROM materia WHERE estado = 1 AND idMateria not in "
                 + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ? )";
                 try {
              PreparedStatement ps=con.prepareStatement(sql);
              ps.setInt(1, idAlumno);
              ResultSet rs=ps.executeQuery();
              while (rs.next()){
                  
                  Materia materia=new Materia();
                  materia.setIdMateria(rs.getInt("idMateria"));
                  materia.setNombre(rs.getString("nombre"));
                  materia.setAnioMateria(rs.getInt("anioMateria"));
                  materias.add(materia);
              }
              
              ps.close();
          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion");
          }
          return materias;
     }
     
     public List<Alumno> obtenerAlumnosXMateria(int idMateria){
         ArrayList<Alumno> alumnosMateria=new ArrayList<>();
         String sql="SELECT a.idAlumno, dni, nombre, apellido, fechaNac"
                 + "FROM inscripcion i,alumno a WHERE i.idAlumno = a idAlumno AND idMateria = ? ";
                
              
         try {
             PreparedStatement ps=con.prepareCall(sql);
             ps.setInt(1, idMateria);
             
             ResultSet rs=ps.executeQuery();
             while(rs.next()){
                 
                 
                 Alumno alumno=new Alumno();
                 alumno.setIdAlumno(rs.getInt("idAlumno"));
                 alumno.setApellido(rs.getString("apellido"));
                 alumno.setNombre(rs.getString("nombre"));
                 alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                 alumno.setActivo(rs.getBoolean("estado"));
                 
                 alumnosMateria.add(alumno);
                 
             }
             ps.close();
             
         } catch (SQLException ex){
             JOptionPane.showMessageDialog(null, "Error al accede a la tabla Inscripcion");
         }
         return alumnosMateria;
     
     }
}