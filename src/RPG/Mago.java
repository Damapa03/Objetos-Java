package RPG;

public class Mago extends Personaje{
    public Mago(String nombre) {
        super(nombre, 80);
    }

    public void usarHechizo(Hechizo hechizo) {
        System.out.println(nombre + " lanza el hechizo: " + hechizo);
    }
}
