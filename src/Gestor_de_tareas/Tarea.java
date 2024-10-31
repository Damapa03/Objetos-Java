package Gestor_de_tareas;

public class Tarea {
    String descripcion;
    boolean completada = false;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
    }

    public void marcarCompletada() {
        completada = true;
        System.out.println("Tarea completada: " + descripcion);
    }
}
