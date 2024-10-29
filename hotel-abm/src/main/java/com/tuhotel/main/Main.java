package com.tuhotel.main;

import com.tuhotel.dao.HuespedDAO;
import com.tuhotel.modelo.Huesped;
import java.sql.Date;
import java.util.List;

public class Main {
    private static HuespedDAO huespedDAO = new HuespedDAO();

    public static void main(String[] args) {
        
        agregarHuesped("Juan Perez", "juan.perez@ejemplo.com", Date.valueOf("2024-10-01"), Date.valueOf("2024-10-05"), 101);

        actualizarHuesped(1L, "Juan Perez", "juan.perez.actualizado@ejemplo.com", Date.valueOf("2024-10-01"), Date.valueOf("2024-10-06"), 102);

        eliminarHuesped(1L);

        obtenerYMostrarTodosLosHuespedes();
    }

    public static void agregarHuesped(String nombre, String email, Date fechaLlegada, Date fechaSalida, int numeroHabitacion) {
        Huesped huesped = new Huesped(nombre, email, fechaLlegada, fechaSalida, numeroHabitacion);
        huespedDAO.agregarHuesped(huesped);
        System.out.println("Huésped agregado: " + huesped.getNombre());
    }

    public static void actualizarHuesped(Long id, String nombre, String email, Date fechaLlegada, Date fechaSalida, int numeroHabitacion) {
        Huesped huesped = huespedDAO.obtenerHuespedPorId(id);
        if (huesped != null) {
            huesped.setNombre(nombre);
            huesped.setEmail(email);
            huesped.setFechaLlegada(fechaLlegada);
            huesped.setFechaSalida(fechaSalida);
            huesped.setNumeroHabitacion(numeroHabitacion);
            huespedDAO.actualizarHuesped(huesped);
            System.out.println("Huésped actualizado: " + huesped.getNombre());
        } else {
            System.out.println("Huésped no encontrado con ID: " + id);
        }
    }

    public static void eliminarHuesped(Long id) {
        huespedDAO.eliminarHuesped(id);
        System.out.println("Huésped eliminado con ID: " + id);
    }

    public static void obtenerYMostrarTodosLosHuespedes() {
        List<Huesped> huespedes = huespedDAO.obtenerTodosLosHuespedes();
        System.out.println("\n--- Lista de Huéspedes ---");
        for (Huesped h : huespedes) {
            System.out.println("ID: " + h.getId() +
                               ", Nombre: " + h.getNombre() +
                               ", Email: " + h.getEmail() +
                               ", Fecha de llegada: " + h.getFechaLlegada() +
                               ", Fecha de salida: " + h.getFechaSalida() +
                               ", Número de habitación: " + h.getNumeroHabitacion());
        }
    }
}
