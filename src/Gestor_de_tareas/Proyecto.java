package Gestor_de_tareas;

import java.util.ArrayList;

public class Proyecto {
    String nombre;
    ArrayList<Tarea> tareas = new ArrayList<>();

    public Proyecto(String nombre) {
        this.nombre = nombre;
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }
}
