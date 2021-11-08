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
public class BaseLeite extends Suco {
    
    public BaseLeite(String sabor, String descricao, Double custo){
        super.sabor = sabor;
        super.descricao = descricao;
        super.custo = custo;
    }
    
    @Override
    public void prepararBase() {
        System.out.println("Espremendo e coando a fruta");
    }
    
    @Override
    public void realizarInfusao() {
        System.out.println("Adicionando leite");
    }
    
}
