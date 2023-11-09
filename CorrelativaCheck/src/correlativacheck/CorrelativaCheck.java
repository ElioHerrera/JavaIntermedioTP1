package correlativacheck;

/**
 * @author Elio Herrera
 */
public class CorrelativaCheck {

    public static void main(String[] args) {

        // Creamos materias
        Materias algoritmos = new Materias("Algoritmos y Estructuras de Datos", 1);
        Materias paradigmas = new Materias("Paradigmas de Programación", 2);
        Materias diseño = new Materias("Diseño de Sistemas", 3);

        // Creamos al alumno
        Alumno juan = new Alumno("Juan");
        
        // Intentamos inscribir a Juan NIVEL 3
        System.out.print("1)- ");//ENUMERAMOS LAS SENTENCIAS PARA LEER LA IMPRESION EN PANTALLA
        juan.inscribir(diseño);

        // Inscribimos a Juan a NIVEL 1
        System.out.print("2)- ");
        juan.inscribir(algoritmos);

        // Reintentamos inscribir a Juan a NIVEL 1
        System.out.print("3)- ");
        juan.inscribir(algoritmos);

        //Aprobamos a juan NIVEL 1
        System.out.print("4)- ");
        juan.aprobarMateria(algoritmos);

        System.out.print("5)- ");
        juan.inscribir(paradigmas);

        System.out.print("6)- ");
        juan.aprobarMateria(paradigmas);

        System.out.print("7)- ");
        juan.inscribir(diseño);

        System.out.print("8)- ");
        juan.inscribir(diseño);

        System.out.print("9)- ");
        juan.aprobarMateria(diseño);

    }

}
