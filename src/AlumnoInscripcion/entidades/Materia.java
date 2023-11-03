
package AlumnoInscripcion.entidades;
public class Materia {
     protected int idMateria;
    protected String Asignatura;
    protected int Anio;
    protected boolean activo;

    public Materia() {
    }

    public Materia(int idMateria, String Asignatura, int Anio, boolean activo) {
        this.idMateria = idMateria;
        this.Asignatura = Asignatura;
        this.Anio = Anio;
        this.activo = activo;
    }

    public Materia(String Asignatura, int Anio, boolean activo) {
        this.Asignatura = Asignatura;
        this.Anio = Anio;
        this.activo = activo;
    }



    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int Anio) {
        this.Anio = Anio;
    }


    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Materia{" + "idMateria=" + idMateria + ", Asignatura=" + Asignatura + ", Anio=" + Anio + ", activo=" + activo + '}';
    }

}
