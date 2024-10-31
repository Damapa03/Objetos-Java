package Gestion_de_biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("Cien Años de Soledad");
        biblioteca.agregarLibro(libro);

        UsuarioBiblioteca usuario = new UsuarioBiblioteca("Juan");
        biblioteca.registrarUsuario(usuario);

        libro.prestar();
        libro.prestar();
    }
}
