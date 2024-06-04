package association;

public class Alumno {

    private Profesor profesor;

    // Constructor sin parametros
    public Alumno() {}
    // COnstructor con parametros
    public Alumno(Profesor profesor) {
        this.profesor = profesor;
    }

    // Getter
    public Profesor getProfesor() {
        return profesor;
    }
    // Setter
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    // Metodo toString() para retornar texto.
    @Override
    public String toString() {
        return "Alumno [profesor=" + profesor + "]";
    }
    
}
