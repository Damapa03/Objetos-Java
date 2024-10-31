package Gestion_de_estudiantes;

import java.util.ArrayList;

public class Estudiante {
    String nombre;
    ArrayList<Integer> calificaciones = new ArrayList<>();

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCalificacion(int calificacion) {
        calificaciones.add(calificacion);
    }

    public double calcularPromedio() {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / (double) calificaciones.size();
    }
}
