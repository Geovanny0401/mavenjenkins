/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.mavenjenkins;

/**
 *
 * @author gmendoza
 */
public class Calculadora {
    
    public Calculadora()
    {
    }
    
    public int Suma(int n1, int n2)
    {
        int res;
        res=n1+n2;
        return res;
    }
    
    public int Resta(int n1, int n2)
    {
        int res;
        res=n1-n2;
        return res;
    }
    
    public int Multiplicacion(int n1, int n2)
    {
        int res;
        res=n1*n2;
        return res;
    }
    
    public int Dividir(int n1, int n2)
    {
        int res;
        res=n1/n2;
        return res;
    }
}
