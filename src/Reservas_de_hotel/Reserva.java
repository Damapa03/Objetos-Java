package Reservas_de_hotel;

import java.util.ArrayList;

public class Reserva {
    Cliente cliente;
    Habitacion habitacion;
    ArrayList<Reserva> reservas = new ArrayList<>();

    public Reserva(Cliente cliente, Habitacion habitacion) {
        this.cliente = cliente;
        this.habitacion = habitacion;
    }
    public Reserva() {

    }
    public void hacerReserva(Cliente cliente, Habitacion habitacion) {
        reservas.add(new Reserva(cliente, habitacion));
    }

    public void cancelarReserva(Reserva reserva) {
        reservas.remove(reserva);
    }

    public void mostrarReservasActivas() {
        for (Reserva reserva : reservas) {
            System.out.println("Reserva: Cliente - " + reserva.cliente.nombre + ", Habitación - " + reserva.habitacion.numero);
        }
    }
}
