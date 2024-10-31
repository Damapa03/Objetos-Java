package Gestion_de_estudiantes;

public class Profesor {
    String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public void asignarCurso(Estudiante estudiante, Curso curso) {
        System.out.println("Asignando curso " + curso.nombre + " a " + estudiante.nombre);
    }
}
