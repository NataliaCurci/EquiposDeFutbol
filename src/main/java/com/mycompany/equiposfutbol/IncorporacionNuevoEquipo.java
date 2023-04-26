package com.mycompany.equiposfutbol;

import java.util.Scanner;

public class IncorporacionNuevoEquipo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del nuevo equipo");
        String nombre=sc.nextLine();
        System.out.println("Introduzca el nombre del director técnico del nuevo equipo");
        String directorTecnico=sc.nextLine();
        System.out.println("Introduzca el número de titulares del nuevo equipo");
        Double titulares=sc.nextDouble();
        System.out.println("Introduzca el número de suplentes del nuevo equipo");
        Double suplentes=sc.nextDouble();
        System.out.println("Introduzca los puntos acumulados del nuevo equipo");
        Double puntos=sc.nextDouble();
        System.out.println("Introduzca el número de partidos jugados del nuevo equipo");
        Double partidosJugados=sc.nextDouble();
        Equipo nuevoEquipo = new Equipo(nombre, titulares, suplentes, directorTecnico, puntos, partidosJugados);
    }
}
