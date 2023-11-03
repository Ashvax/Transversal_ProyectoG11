package AlumnoInscripcion.Vistas;




import AlumnoInscripcion.AccesoADatos.Conexion;
import AlumnoInscripcion.AccesoADatos.InscripcionData;
import AlumnoInscripcion.entidades.Inscripcion;
import java.sql.*;
import java.time.LocalDate;
import java.util.List;



public class Universidad {

    
    public static void main(String[] args) {
        
        Connection con= Conexion.getconexion();
    
               
     
     //PRUEBAS EN EL MAIN
     //Alumno juan=new Alumno (9,12345678,"Cortez","Juan",LocalDate.of(1987,11,30),true);
     
     //OBJETOS PARA ENVIAR DATOS A LA BD
     /*AlumnoData ad=new AlumnoData();
     MateriaData md=new MateriaData();
     InscripcionData id=new InscripcionData();
     
    Alumno jose=ad.buscarAlumno(1);
     Materia mate=md.buscarMateria(4);
     Inscripcion insc=new Inscripcion(jose,mate,5);
     id.guardarInscripcion(insc);*/
     
             
        /*AlumnoData alu=new AlumnoData();
     for(Alumno alumno:alu.listarAlumnos()){
         
        System.out.println(alumno.getDni());
        System.out.println(alumno.getApellido());
        System.out.println(alumno.getNombre());
        System.out.println(alumno.getFechaNacimiento());
     }*/
     //alu.guardarAlumno(juan);
     //alu.modificarAlumno(juan);
     //alu.eliminarAlumno(9);
     /*Alumno alumnoEncontrado=alu.buscarAlumnoPorDni(31515247);
     if (alumnoEncontrado!=null){
        System.out.println("dni "+alumnoEncontrado.getDni());
        System.out.println("apellido "+alumnoEncontrado.getApellido());
        System.out.println("nombre "+alumnoEncontrado.getNombre());
     }*/
        
     //id.actualizarNota(1,2,5);
     
     //id.borrarInscripcion(1, 2);
     
     
     InscripcionData i= new InscripcionData(); 
     
     List<Inscripcion> obtenerInscIdAl= i.obtenerInscripcionesPorAlumno(3); 
     if(obtenerInscIdAl != null){
         for(int x = 0; x<obtenerInscIdAl.size(); x++ ){
             
             Inscripcion inscripcion1 = obtenerInscIdAl.get(x); 
             System.out.println(inscripcion1.getMateria());
             System.out.println(inscripcion1.getAlumno());
             System.out.println(inscripcion1.getNota());

           }
         }else {
           System.out.println("Lista nula");      
       }
         
     } 
     
     
     
     
       
    }
    
