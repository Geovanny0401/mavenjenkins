package com.gm.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.gm.mavenjenkins.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gmendoza
 */
public class TestCalculadora {
    
    public TestCalculadora() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     *
     */
    @org.junit.Test
    public void testCalculadoraSuma()
    {
        System.out.println("Suma");
        int n1=2, n2=5;
        int esperado=7;
        Calculadora calc=new Calculadora();
        int devuelto=calc.Suma(n1, n2);
        assertEquals(esperado, devuelto);
        
    }
    
     @org.junit.Test
    public void testCalculadoraResta()
    {
        System.out.println("Resta");
        int n1=2, n2=5;
        int esperado=-3;
        Calculadora calc=new Calculadora();
        int devuelto=calc.Resta(n1, n2);
        assertEquals(esperado, devuelto);
        
    }
    
     @org.junit.Test
    public void testCalculadoraMultiplicar()
    {
        System.out.println("Multiplicacion");
        int n1=2, n2=5;
        int esperado=10;
        Calculadora calc=new Calculadora();
        int devuelto=calc.Multiplicacion(n1, n2);
        assertEquals(esperado, devuelto);
        
    }

}
