package association;

import java.util.ArrayList;
import java.util.List;

public class Profesor {

    private List<Alumno> alumnos;

    // Constructor vacio.
    public Profesor() {
        this.alumnos = new ArrayList<Alumno>();
    }  
    // Constructor con parametros
    public Profesor(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    // Getter
    public List<Alumno> getAlumnos() {
        return alumnos;
    }
    // Setter
    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    // Metodo toString() para retornar texto.
    @Override
    public String toString() {
        return "Profesor [alumnos=" + alumnos + "]";
    }    
}
