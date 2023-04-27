package com.mycompany.equiposfutbol;

import java.sql.*;
import java.util.Scanner;

public class Equipo {
    /*instanciar variables*/
    private String nombre;
    private double titulares;
    private double suplentes;
    private String directorTecnico;
    private double puntos;
    private double partidosJugados;
   
    /* Constructor para objetos de class Equipo, mantengo el constructor vacio y armo el propio*/
    public Equipo(){}
    
    public Equipo(String nombre, double titulares, double suplentes, String directorTecnico, double puntos, double partidosJugados){
        this.nombre=nombre;
        this.titulares=titulares;
        this.suplentes=suplentes;
        this.directorTecnico=directorTecnico;
        this.puntos=puntos;
        this.partidosJugados=partidosJugados;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/FutbolDB","root","");
            Statement stmt=con.createStatement();
            //Relleno la tabla con los datos del equipo
            int result=stmt.executeUpdate(
                "insert into Equipos (Nombre, Titulares, Suplentes, DirectorTecnico, Puntos, PartidosJugados) values ( "+"\""+nombre+"\""+", "+titulares+", "+suplentes+", "+"\""+directorTecnico+"\""+", "+puntos+", "+partidosJugados+")");
            System.out.println("Equipo registrado!");
            con.close();
        } catch (Exception ex) { 
            System.out.println(ex);
        }
    }
    
    /* Métodos para imprimir desde DB*/
    public static void imprimirEquipos (){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/FutbolDB","root","");
            Statement stmt=con.createStatement();
            //Query para que imprima la tabla con los datos de todos los equipos
            ResultSet rs=stmt.executeQuery("select Nombre, Titulares, Suplentes, DirectorTecnico, Puntos, PartidosJugados from Equipos");
            while(rs.next())
            System.out.println("Nombre:"+rs.getString(1)+" Titulares:"+rs.getInt(2)+" Suplentes:"+rs.getInt(3)+" Director Tecnico:"+rs.getString(4)+" Puntos:"+rs.getInt(5)+" Partidos Jugados:"+rs.getInt(6));
            con.close();
        } catch (Exception ex) { 
            System.out.println(ex);
        }
    }
    
    public static String imprimirEquipo(String equipo){
        String datos = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/FutbolDB","root","");
            Statement stmt=con.createStatement();
            //Consulto el equipo requerido
            ResultSet rs=stmt.executeQuery("select Nombre, Titulares, Suplentes, DirectorTecnico, Puntos, PartidosJugados from Equipos where Nombre = "+"\""+equipo+"\"");
            while(rs.next())
            datos = "Equipo: "+rs.getString(1)+" Titulares: "+rs.getString(2)+" Suplentes: "+rs.getString(3)+" Director Tecnico: "+rs.getString(4)+" Puntos: "+rs.getInt(5)+" Partidos Jugados: "+rs.getInt(6);
            System.out.println(datos);
            con.close();
        } catch (Exception ex) { 
            System.out.println(ex);
            }
        return datos;
    }
}