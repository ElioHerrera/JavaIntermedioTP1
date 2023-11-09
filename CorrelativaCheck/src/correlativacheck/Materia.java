package correlativacheck;

class Materias {

    //Atributos
    private String nombre;
    private int nivel;
    private boolean estadoMateria;

    //Constructor 
    public Materias(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.estadoMateria = false;
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    public int getNivel() {
        return this.nivel;
    }

    public boolean estadoMateria() {
        return this.estadoMateria;
    }

    //Setter estado de la materia
    public void setEstadoMateria(boolean aprobado) {
        this.estadoMateria = aprobado;
    }
}
