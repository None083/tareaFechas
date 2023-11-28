/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw;

import static daw.UtilidadesFecha.pedirNumero;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author noelia
 */
public class Prueba {

    public static void main(String[] args) {

        System.out.println("Introduce una fecha:");
        System.out.println("Introduce el día");
        int day = pedirNumero();

        System.out.println("Introduce el mes");
        int month = pedirNumero();

        System.out.println("Introduce el año");
        int year = pedirNumero();

        LocalDate fecha = LocalDate.of(year, month, day);
        
        int opcion = 0;
        
        do{
            System.out.println("""
                           
                                            ¿Qué quieres hacer?
                           -------------------------------------------------------
                                    1 - ¿Es bisiesto?
                                    2 - Fecha válida
                                    3 - Crear copia
                                    4 - Número de días del mes
                                    5 - Número del día de la semana
                                    6 - Fecha larga
                                    7 - Sumar días
                                    8 - Días transcurridos entre dos fechas
                                    9 - Día siguiente
                                   10 - Día anterior
                                   11 - Minutos entre dos fechas
                                   12 - Sumar segundos
                                   13 - Salir
                           -------------------------------------------------------
                           """);
        opcion = UtilidadesFecha.pedirNumero();

        switch (opcion) {
            case 1 -> {
                if (UtilidadesFecha.bisiesto(fecha)) {
                    System.out.println("El año " + year + " es bisiesto");
                } else {
                    System.out.println("El año " + year + " no es bisiesto");
                }
            }
            case 2 -> {
                if (UtilidadesFecha.fechaValida(day, month, year)) {
                    System.out.println("La fecha " + fecha + " es válida");
                } else {
                    System.out.println("La fecha " + fecha + " no es válida");
                }
            }
            case 3 -> {
                LocalDate copiaFecha = UtilidadesFecha.copia(fecha);

                if (fecha.equals(copiaFecha)) {
                    System.out.println("La copia se ha realizado con éxito");
                } else {
                    System.out.println("Algo ha fallado");
                }
            }
            case 4 -> {
                System.out.println("El número de días del mes son: "
                        + UtilidadesFecha.diasMes(fecha));
            }
            case 5 -> {
                System.out.println("El número del día dentro de la semana es: "
                        + UtilidadesFecha.diaSemana(fecha));
            }
            case 6 -> {
                System.out.println("La versión larga de la fecha es: "
                        + UtilidadesFecha.mostrarFechaLarga(fecha));
            }
            case 7 -> {
                System.out.println("Introduce un número de días a sumar");
                int numDias = UtilidadesFecha.pedirNumero();
                System.out.println("Fecha: " + fecha + " Resultado: " + UtilidadesFecha.sumarDias(numDias, fecha));
            }
            case 8 -> {
                System.out.println("Nueva fecha");
                System.out.println("Introduce el día");
                int day2 = pedirNumero();

                System.out.println("Introduce el mes");
                int month2 = pedirNumero();

                System.out.println("Introduce el año");
                int year2 = pedirNumero();

                LocalDate fecha2 = LocalDate.of(year2, month2, day2);
                
                System.out.println("Los días transcurridos entre " + fecha + " y " + fecha2
                        + " son: " + UtilidadesFecha.diasTranscurridos(fecha, fecha2));
            }
            case 9 ->{
                System.out.println("Día siguiente de la fecha " + fecha
                + ": " + UtilidadesFecha.siguienteDia(fecha));
            }
            case 10 ->{
                System.out.println("Día anterior de la fecha " + fecha
                + ": " + UtilidadesFecha.anteriorDia(fecha));
            }
            case 11 ->{
                System.out.println("Nueva fecha");
                System.out.println("Introduce el día");
                int day2 = pedirNumero();

                System.out.println("Introduce el mes");
                int month2 = pedirNumero();

                System.out.println("Introduce el año");
                int year2 = pedirNumero();

                LocalDate fecha2 = LocalDate.of(year2, month2, day2);
                
                System.out.println("Los minutos entre la fecha " + fecha + " y "
                + fecha2 + " son: " + UtilidadesFecha.minutosEntre(
                        LocalDateTime.of(fecha, LocalTime.MIN), 
                        LocalDateTime.of(fecha2, LocalTime.MIN)));
            }
            case 12 ->{
                System.out.println("Introduce un número de segundos a sumar");
                int numSeg = UtilidadesFecha.pedirNumero();
                
                System.out.println("Fecha: " + fecha + " Resultado: " + UtilidadesFecha.sumarSegundos(numSeg, 
                        LocalDateTime.of(fecha, LocalTime.MIN)));
            }
            default ->{
                System.out.println("Chao pescao");
            }
        }
        }while(opcion != 13);
        

    }

}

