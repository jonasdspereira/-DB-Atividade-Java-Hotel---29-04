
import org.example.Hotel;
import org.example.Reserva;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HotelTesteTest {

    private Hotel hotel;

    @BeforeEach
    public void setup() {
        hotel = new Hotel();
    }

    @Test
    public void Reserva() {
        LocalDateTime inicioReserva = LocalDateTime.of(2024, 04, 20, 15, 30, 0);
        LocalDateTime fimReserva = LocalDateTime.of(2024, 04, 25, 12, 0, 0);
        Reserva reserva = new Reserva(1L, 1, inicioReserva, fimReserva);

        assertTrue(hotel.adicionaReserva(reserva));
        assertTrue(hotel.getReservas().contains(reserva));

    }

    @Test
    public void ReservaTriste() {
        LocalDateTime inicioReserva1 = LocalDateTime.of(2024, 04, 20, 15, 30, 0);
        LocalDateTime fimReserva1 = LocalDateTime.of(2024, 04, 25, 12, 0, 0);
        Reserva reserva1 = new Reserva(1L, 1, inicioReserva1, fimReserva1);

        assertTrue(hotel.adicionaReserva(reserva1));

        LocalDateTime inicioReserva2 = LocalDateTime.of(2024, 04, 20, 15, 30, 0);
        LocalDateTime fimReserva2 = LocalDateTime.of(2024, 04, 25, 12, 0, 0);
        Reserva reserva2 = new Reserva(1L, 1, inicioReserva2, fimReserva2);

//        assertFalse(hotel.adicionaReserva(reserva2));
        assertFalse(hotel.getReservas().contains(reserva2));
    }

    @Test
    public void CancelarReserva() {
        LocalDateTime inicioReserva = LocalDateTime.of(2024, 04, 20, 15, 30, 0);
        LocalDateTime fimReserva = LocalDateTime.of(2024, 04, 25, 12, 0, 0);
        Reserva reserva = new Reserva(1L, 1, inicioReserva, fimReserva);

        hotel.adicionaReserva(reserva);

//        hotel.cancelarReserva(1L);
        assertTrue(hotel.cancelarReserva(1L));
    }


}
