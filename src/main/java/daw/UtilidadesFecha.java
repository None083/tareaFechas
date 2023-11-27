/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class UtilidadesFecha {

    public static boolean bisiesto(LocalDate fecha) {
        boolean esBisiesto = false;

        if (fecha.isLeapYear()) {
            esBisiesto = true;
        }
        return esBisiesto;
    }

    public static boolean fechaValida(int day, int month, int year) {
        try {
            LocalDate fecha = LocalDate.of(year, month, day);
            return true;
        } catch (DateTimeException dte) {
            return false;
        }
    }

    public static LocalDate copia(LocalDate fecha) {
        LocalDate copiaFecha = LocalDate.of(fecha.getYear(),
                fecha.getMonthValue(), fecha.getDayOfMonth());
        return copiaFecha;
    }

    public static int diasMes(LocalDate fecha) {
        return fecha.lengthOfMonth();
    }

    public static int diaSemana(LocalDate fecha) {
        if (fecha.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
            return 0;
        } else {
            return fecha.getDayOfWeek().getValue();
        }
    }

    public static String mostrarFechaLarga(LocalDate fecha) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern(
                "EEEE d 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
        return fecha.format(formato);
    }

    public static LocalDate sumarDias(long numeroDias, LocalDate fecha) {
        LocalDate nuevaFecha = fecha.plusDays(numeroDias);
        return nuevaFecha;
    }

    public static long diasTranscurridos(LocalDate fechaInicial, LocalDate fechaFinal) {

        return ChronoUnit.DAYS.between(fechaInicial, fechaFinal);
    }

    public static LocalDate siguienteDia(LocalDate fecha) {
        final int DIA_SUMAR = 1;
        LocalDate nuevaFecha = fecha.plusDays(DIA_SUMAR);
        return nuevaFecha;
    }

    public static LocalDate anteriorDia(LocalDate fecha) {
        final int DIA_RESTAR = 1;
        LocalDate nuevaFecha = fecha.minusDays(DIA_RESTAR);
        return nuevaFecha;
    }

    public static long minutosEntre(LocalDateTime fecha1, LocalDateTime fecha2) {
        return ChronoUnit.MINUTES.between(fecha1, fecha2);
    }

    public static LocalDateTime sumarSegundos(long numeroSegundos, LocalDateTime fecha) {
        //int fechaSegundos = fecha.toLocalTime().toSecondOfDay(); Pasar fecha a segundos
        LocalDateTime nuevaFecha = fecha.plusSeconds(numeroSegundos);
        return nuevaFecha;
    }
    
    public static int pedirNumero() {
        Scanner teclado = new Scanner(System.in);
        int numeroAnimales = 0;
        boolean errorMismatch = true;
        do {
            try {
                numeroAnimales = teclado.nextInt();
                errorMismatch = false;
            } catch (InputMismatchException ime) {
                System.out.println("Eso no es un número");
            }
            teclado.nextLine();
        } while (errorMismatch);

        return numeroAnimales;
    }
    
}
