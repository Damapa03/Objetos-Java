package Gestion_de_estudiantes;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Carlos");
        estudiante.agregarCalificacion(85);
        estudiante.agregarCalificacion(90);

        System.out.println("Promedio de " + estudiante.nombre + ": " + estudiante.calcularPromedio());
    }
}
