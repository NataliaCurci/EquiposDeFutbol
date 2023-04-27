package com.mycompany.equiposfutbol;

import java.sql.*;

//Creo una excepcion para la clase equipo
public class equipoException extends Exception{
    public equipoException(String mensaje){
        super(mensaje);
    }
    //lanzo una excepcion cuando se consulte un equipo que no este ene la tabla
    static void equipoNoListadoException (String e) throws equipoException{
        boolean flag = false; //flag sera falso hasta que el equipo consulatado concuerde con uno de la lista
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/FutbolDB","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select Nombre from Equipos ");
            while(rs.next()){
                if (e.equals(rs.getString(1)))
                flag = true;
                }
            if (flag == false) 
                {throw new equipoException("el equipo consultado no esta en la lista") /*Lanzo la excepcion si no encontre el equipo consultado*/;} 
            con.close();
                } catch (Exception ex) { 
            System.out.println(ex);
        }
    }
}
