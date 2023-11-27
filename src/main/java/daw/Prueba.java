/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw;

import java.time.LocalDate;

/**
 *
 * @author noelia
 */
public class Prueba {

    public static void main(String[] args) {
       
        LocalDate fecha = LocalDate.of(2023, 11, 26);
        
        System.out.println(UtilidadesFecha.diaSemana(fecha));
        
        System.out.println(UtilidadesFecha.mostrarFechaLarga(fecha));
        
    }
    
}
