package RPG;

public class Guerrero extends Personaje{
    public Guerrero(String nombre) {
        super(nombre, 100);
    }

    public void atacar() {
        System.out.println(nombre + " ataca con su espada.");
    }
}
