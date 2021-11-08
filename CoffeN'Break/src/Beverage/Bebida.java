/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beverage;

/**
 *
 * @author Jhon
 */
public abstract class Bebida extends Beverage {
    
    public abstract void prepararBase();
    
    public abstract void realizarInfusao();
    
    public void adicionarAcucar(){
        System.out.println("Adicionando um pouquinho de açucar");
    }
    
    public void servir(){
        System.out.println("Servindo a bebida");
    }
    
    public final void template(){
        prepararBase();
        realizarInfusao();
        adicionarAcucar();
        servir();
    }
}
