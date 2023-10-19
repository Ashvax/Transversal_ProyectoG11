package transversal_proyectog11;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;
import transversal_proyectog11.AccesoADatos.AlumnoData;
import transversal_proyectog11.AccesoADatos.Conexion;
import transversal_proyectog11.AccesoADatos.MateriaData;
import transversal_proyectog11.entidades.Alumno;
import transversal_proyectog11.entidades.Materia;
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
     /*Materia mate = new Materia("Matemática", 2023, true);
        MateriaData mat=new MateriaData();
        mat.guardarMateria(mate);*/
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
       MateriaData materiaData = new MateriaData();
        materiaData.eliminarMateria(4);

        // Listar todas las materias
        /*List<Materia> materia = materiaData.listarMaterias();
        for (Materia materia : materia) {
            System.out.println("ID: " + materia.getIdMateria());
            System.out.println("Nombre: " + materia.getNombre());
            System.out.println("Año: " + materia.getAnioMateria());
            System.out.println("Activa: " + materia.isActivo());
            System.out.println();
        }*/
    }
}