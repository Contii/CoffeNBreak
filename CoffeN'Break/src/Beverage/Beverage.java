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
public abstract class Beverage {
    
    protected String descricao = "Bebida";
    public Double custo;
    
    public abstract void template();   
    
    public String getDescricao() {
        return descricao;
    }
    
    public Double getCusto() {
        return custo;
    }
    
}
