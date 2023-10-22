package transversal_proyectog11;
import java.net.IDN;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;
import transversal_proyectog11.AccesoADatos.AlumnoData;
import transversal_proyectog11.AccesoADatos.Conexion;
import transversal_proyectog11.AccesoADatos.InscripcionData;
import transversal_proyectog11.AccesoADatos.MateriaData;
import transversal_proyectog11.entidades.Alumno;
import transversal_proyectog11.entidades.Inscripcion;
import transversal_proyectog11.entidades.Materia;
public class Transversal_ProyectoG11 {
    public static void main(String[] args) {
       
        
        /*Alumno juan=new Alumno(43520682,"Ferreyra","Antonio",LocalDate.of(1995, 8, 20),true); 
    AlumnoData alu=new AlumnoData(); 
    alu.guardarAlumno(juan);*/
    //alu.modificarAlumno(juan);
    //alu.borrarAlumno(8);
    /*Alumno alumnoEncontrado=alu.buscarAlumnoPorDni(1234);
        if(alumnoEncontrado!=null){
        System.out.println("dni"+alumnoEncontrado.getDni());
        System.out.println("apellido"+alumnoEncontrado.getApellido());*/ 
        
       /* AlumnoData alu=new AlumnoData();
        for(Alumno alumno:alu.listarAlumnos()){
            System.out.println(alumno.getDni());
            System.out.println(alumno.getApellido());
            System.out.println(alumno.getNombre());
            System.out.println(alumno.getFechaNac());
        }*/
       
        // Crear una instancia de MateriaData
        /*MateriaData materiaData = new MateriaData();*/

        // Crear una materia y guardarla
       /* Materia mate = new Materia("Ingles", 2024, true);
        MateriaData mat=new MateriaData();
        mat.guardarMateria(mate); */
        // Modificar una materia existente
        /* MateriaData materiaData = new MateriaData();
    Materia materia = new Materia(2, "Fisica", 2023, true);
    
    materiaData.modificarMateria(materia);*/
        /*MateriaData materiaData = new MateriaData();
    Materia materiaEncontrada = materiaData.buscarMateria(1);

    if (materiaEncontrada != null) {
        System.out.println("ID Materia: " + materiaEncontrada.getIdMateria());
        System.out.println("Nombre: " + materiaEncontrada.getNombre());
        System.out.println("Año: " + materiaEncontrada.getAnioMateria());
    } else {
        System.out.println("Materia no encontrada.");
    }
}*/

        // Borrar una materia existente
       /*MateriaData materiaData = new MateriaData();
        materiaData.eliminarMateria(4);*/

        // Listar todas las materias
       /* MateriaData materiaData = new MateriaData();
    List<Materia> materiasActivas = materiaData.listarMaterias();

    for (Materia materia : materiasActivas) {
    System.out.println("ID: " + materia.getIdMateria());
    System.out.println("Nombre: " + materia.getNombre());
    System.out.println("Año: " + materia.getAnioMateria());
    System.out.println("Estado: " + materia.isActivo());
    System.out.println();
   }*/
       AlumnoData ad = new AlumnoData();
        MateriaData md = new MateriaData();
    InscripcionData id = new InscripcionData();

    Alumno Alejandro = ad.buscarAlumno(9);
    Materia bio = md.buscarMateria(6);

    Inscripcion insc = new Inscripcion(Alejandro, bio, 9);
    //id.guardarInscripcion(insc);
      
      //Actualizar Nota
      //id.actualizarNota(1, 5, 7.5);
       //id.borrarInscripcionMateriaAlumno(1, 5);
      
       /*for(Inscripcion inscripcion:id.obtenerInscripciones()){
           System.out.println("id "+inscripcion.getIdInscripcion());
           System.out.println("Apellido "+inscripcion.getAlumno().getApellido());
           System.out.println("Materia "+inscripcion.getMateria());
       }*/
       
      /*for (Materia materia:id.obtenerMateriasNoCursadas(4)){
           System.out.println("nombre "+materia.getNombre());
       }*/
       
        }
    }