package transversal_proyectog11;
import java.sql.Connection;
import java.time.LocalDate;
import transversal_proyectog11.AccesoADatos.AlumnoData;
import transversal_proyectog11.AccesoADatos.Conexion;
import transversal_proyectog11.entidades.Alumno;
public class Transversal_ProyectoG11 {
    public static void main(String[] args) {
       
        /*
        //Alumno juan=new Alumno(8,12312312,"Luna","Juan Pedro",LocalDate.of(1980, 4, 25),true);
    AlumnoData alu=new AlumnoData();
    //alu.guardarAlumno(juan);
    //alu.modificarAlumno(juan);
    //alu.borrarAlumno(8);
    Alumno alumnoEncontrado=alu.buscarAlumnoPorDni(1234);
        if(alumnoEncontrado!=null){
        System.out.println("dni"+alumnoEncontrado.getDni());
        System.out.println("apellido"+alumnoEncontrado.getApellido());   */ 
        
        AlumnoData alu=new AlumnoData();
        for(Alumno alumno:alu.listarAlumnos()){
            System.out.println(alumno.getDni());
            System.out.println(alumno.getApellido());
            System.out.println(alumno.getNombre());
            System.out.println(alumno.getFechaNac());
        }
        }
    }
