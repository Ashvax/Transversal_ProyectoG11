package AlumnoInscripcion.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import AlumnoInscripcion.AccesoADatos.Conexion;
import AlumnoInscripcion.entidades.Inscripcion;
import AlumnoInscripcion.entidades.Materia;

public class MateriaData {
    private Connection con;

    public MateriaData() {
        con = Conexion.getconexion();
    }

    public void guardarMateria(Materia materia) {
        String sql = "INSERT INTO materia(asignatura, Anio, Estado  ) " 
                + "VALUES(?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getAsignatura());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia Guardada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    }

    public Materia buscarMateria(int id) {
        String sql = "SELECT Asignatura, Anio FROM materia WHERE idMateria = ?";
        Materia materia = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setAsignatura(rs.getString("Asignatura"));
                materia.setAnio(rs.getInt("anio"));
                materia.setActivo(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe esa materia");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }

        return materia;
    }

    public void modificarMateria(Materia materia) {
        String sql = "UPDATE materia SET Asignatura=?, Anio=? WHERE idMateria =?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getAsignatura());
            ps.setInt(2, materia.getAnio());
            ps.setInt(3, materia.getIdMateria());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia Modificada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    }

    public void eliminarMateria(int id) {
        String sql = "UPDATE materia SET Estado = 0 WHERE idMateria = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia Eliminada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    }

    public ArrayList<Materia> listarMaterias() {
        String sql = "SELECT * FROM materia WHERE estado = true";
        ArrayList<Materia> materias = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setAsignatura(rs.getString("asignatura"));
                materia.setAnio(rs.getInt("anio"));
                materia.setActivo(true);
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
        return materias;
    }
    
    public List<Materia> obtenerMateriasPorAlumno(int idAlumno) {
    String sql = "SELECT m.idMateria, m.asignatura, m.anio, i.nota, i.estado " +
                 "FROM materia m " +
                 "INNER JOIN inscripcion i ON m.idMateria = i.idMateria " +
                 "WHERE i.idAlumno = ?";

    List<Materia> materias = new ArrayList<>();

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idAlumno);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Materia materia = new Materia();
            materia.setIdMateria(rs.getInt("idMateria"));
            materia.setAsignatura(rs.getString("asignatura"));
            materia.setAnio(rs.getInt("anio"));

            Inscripcion inscripcion = new Inscripcion();
            inscripcion.setNota(rs.getDouble("nota"));
        

            
            materias.add(materia);
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al obtener las materias por alumno");
    }

    return materias;
}
}