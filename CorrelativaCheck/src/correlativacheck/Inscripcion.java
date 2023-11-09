package correlativacheck;

class Inscripcion {

    //Atributos
    private Alumno alumno;
    private Materias materia;

    //Constructor
    public Inscripcion(Alumno alumno, Materias materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    //Getters
    public Alumno getAlumno() {
        return this.alumno;
    }

    public Materias getMateria() {
        return this.materia;
    }
}
