package Gestion_de_biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Libro> libros = new ArrayList<>();
    ArrayList<UsuarioBiblioteca> usuarios = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void registrarUsuario(UsuarioBiblioteca usuario) {
        usuarios.add(usuario);
    }
}
