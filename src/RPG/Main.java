package RPG;

public class Main {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("Thor");
        Mago mago = new Mago("Gandalf");
        Hechizo hechizo = new Hechizo("Bola de fuego");

        guerrero.atacar();
        mago.usarHechizo(hechizo);
    }
}
