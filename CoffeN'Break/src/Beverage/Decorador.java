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
public class Decorador extends Beverage {
    
    Beverage bebida;
    Double decoradorCusto;
    protected String decoradorNome = "Decorador";
    
    public Decorador(Beverage bebida, Double decoratorCusto, String decoradorNome){
        this.bebida = bebida;
        this.decoradorCusto = decoradorCusto;
        this.decoradorNome = decoradorNome;
    }

    @Override
    public Double getCusto() {
        return bebida.getCusto() + decoradorCusto; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + "; com " + decoradorNome; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void template() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}