package Reservas_de_hotel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maria");
        Reserva reserva = new Reserva();
        Habitacion habitacion1 = new Habitacion(101);

        reserva.hacerReserva(cliente1, habitacion1);
        reserva.mostrarReservasActivas();
    }
}
