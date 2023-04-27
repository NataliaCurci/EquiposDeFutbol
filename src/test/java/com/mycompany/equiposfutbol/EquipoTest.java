package com.mycompany.equiposfutbol;

import org.junit.Test;
import static org.junit.Assert.*;

public class EquipoTest {
    
    public EquipoTest() {
    }

    /**
     * Test of imprimirEquipos method, of class Equipo.
     *
    @Test
    public void testImprimirEquipos() {
        System.out.println("imprimirEquipos");
        Equipo.imprimirEquipos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimirEquipo method, of class Equipo.
     */
    @Test
    public void testImprimirEquipo() {
        System.out.println("imprimirEquipo");
        String equipo = "Estudiantes";
        String expResult ="Equipo: Estudiantes Titulares: 11 Suplentes: 2 Director Tecnico: Raul Puntos: 42 Partidos Jugados: 32";
        String result = Equipo.imprimirEquipo(equipo);
        assertEquals(expResult, result);
        if (!result.equals(expResult))
        fail("The test case is a prototype.");
    }
    
}