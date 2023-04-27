package com.mycompany.equiposfutbol;

import java.util.Scanner;

public class ConsultaEquipos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero 1 si quiere imprimir un solo equipo o el 2 si quiere un listado de todos los equipos");
        double pedido=sc.nextDouble();
   
        if (pedido == 1) {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Introduzca el nombre del equipo a imprimir");
            String equipo=sc2.nextLine();
           
            //lanzo una exepción en caso de que el equipo que se consulte no esté en la lista
            try {equipoException.equipoNoListadoException(equipo);}
            catch (equipoException exception){System.out.println(exception);}
            Equipo.imprimirEquipo(equipo);
            
        }
        else if (pedido == 2){
            Equipo.imprimirEquipos();
        }
        else{
            System.out.println("Vuelva a ejecutar el programa y elija una opción válida");
        }
    }
}