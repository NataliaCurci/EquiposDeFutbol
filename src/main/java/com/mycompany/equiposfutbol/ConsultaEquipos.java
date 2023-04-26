package com.mycompany.equiposfutbol;

import java.util.Scanner;

public class ConsultaEquipos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero 1 si quiere imprimir un solo equipo o el 2 si quiere un listado de todos los equipos");
        double pedido=sc.nextDouble();
        if (pedido == 1) {
            Equipo.imprimirEquipo();
        }
        else if (pedido == 2){
            Equipo.imprimirEquipos();
        }
        else{
            System.out.println("Introduzca el numero 1 si quiere imprimir un solo equipo o el 2 si quiere un listado de todos los equipos");
        }
    }
}