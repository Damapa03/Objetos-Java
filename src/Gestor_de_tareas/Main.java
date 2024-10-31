package Gestor_de_tareas;

public class Main {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Proyecto Java");
        Tarea tarea = new Tarea("Diseñar clases");
        proyecto.agregarTarea(tarea);

        tarea.marcarCompletada();
    }
}
