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
public class Cafeinada extends Bebida {
    
    public Cafeinada(String sabor, String descricao, Double custo){
        super.descricao = descricao;
        super.custo = custo;
    }
            
    @Override
    public void prepararBase() {
        System.out.println("Moendo o café e preparando o pó");
    }
    
    @Override
    public void realizarInfusao() {
        System.out.println("Coando o café");
    }
    
}
