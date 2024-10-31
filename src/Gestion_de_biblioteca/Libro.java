package Gestion_de_biblioteca;

public class Libro {
    String titulo;
    boolean prestado = false;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("El libro " + titulo + " ha sido prestado.");
        } else {
            System.out.println("El libro " + titulo + " ya está prestado.");
        }
    }

    public void devolver() {
        prestado = false;
        System.out.println("El libro " + titulo + " ha sido devuelto.");
    }
}
