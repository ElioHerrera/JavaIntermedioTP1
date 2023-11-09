package correlativacheck;

import java.util.ArrayList;

class Alumno {

    //Atributos
    private String nombreMateria;
    private ArrayList<Inscripcion> inscripciones;
    private ArrayList<Materias> materiasAprobadas;

    //Constructor
    public Alumno(String nombre) {
        this.nombreMateria = nombre;
        this.inscripciones = new ArrayList<>();
        this.materiasAprobadas = new ArrayList<>();
    }

    //Getters
    public String getNombreMateria() {
        return this.nombreMateria;
    }

    public ArrayList<Inscripcion> getInscripciones() {
        return this.inscripciones;
    }

    public ArrayList<Materias> getMateriasAprobadas() {
        return this.materiasAprobadas;
    }

    //Método para verificar si puede inscribirse el alumno
    private boolean puedeInscribirse(Materias materia) {
        // Si la materia es del nivel 1 y no está inscrito en el nivel actual
        if (materia.getNivel() == 1 && !this.yaInscritoNivel(1)) {
            return true;
        } else if (materia.getNivel() == 2 && !this.yaInscritoNivel(2) && this.yaAprobadoNivel(1)) {
            return true;
        } else if (materia.getNivel() == 3 && !this.yaInscritoNivel(3) && this.yaAprobadoNivel(2)) {
            return true;
        }
        return false;
    }
    
    //Método para verificar el alumno esta incripto en la materia
    private boolean yaInscritoNivel(int nivel) {
        for (Inscripcion inscripcion : this.inscripciones) {
            if (inscripcion.getMateria().getNivel() == nivel) {
                return true;
            }
        }
        return false;
    }

    //Método para verificar el alumno ah aprobado la materia
    private boolean yaAprobadoNivel(int nivel) {
        for (Materias materiaAprobada : this.materiasAprobadas) {
            if (materiaAprobada.getNivel() == nivel) {
                return true;
            }
        }
        return false;
    }

    //Método para realizar las incripciones
    public void inscribir(Materias materia) {

        //Variable
        boolean puedeInscribirse = this.puedeInscribirse(materia);

        if (puedeInscribirse) { //Si "puedeIncribirse()" es "true" agrega la inscripción a la lista
            Inscripcion nuevaInscripcion = new Inscripcion(this, materia);
            this.inscripciones.add(nuevaInscripcion);
            System.out.println("El alumno " + this.nombreMateria + " se ha inscrito en " + materia.getNombre()
                    + "\n--------------------------------------");
        } else { //Si "puedeIncribirse()" es "false" no inscribe

            System.out.println("El alumno " + this.nombreMateria + " No se puede inscribir a la materia " + materia.getNombre()
                    + "\n--------------------------------------");
        }
    }

    //Método para aprobar la Materia
    public void aprobarMateria(Materias materia) {

        for (Inscripcion inscripcion : this.inscripciones) {
            //Si la materia existe en la lista de inscripciones agrega la materia a la lista de aprobadas
            if (inscripcion.getMateria().equals(materia)) {
                inscripcion.getAlumno().getMateriasAprobadas().add(materia);

                if (materia.getNivel() == 3) {
                    System.out.println("El alumno " + this.nombreMateria + " ha aprobado la materia " + materia.getNombre()
                            + "\n"
                            + "\n*********************   ha FINALIZADO EL CURSO  *********************"
                            + "\n");
                } else {
                    System.out.println("El alumno " + this.nombreMateria + " ha aprobado la materia " + materia.getNombre()
                            + "\n--------------------------------------");
                    return;
                }

            }

        }
    }
}
