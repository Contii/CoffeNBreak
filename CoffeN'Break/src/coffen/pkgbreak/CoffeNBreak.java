/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffen.pkgbreak;
import Beverage.BaseLeite;
import Beverage.Bebida;
import Beverage.Beverage;
import Beverage.Cafeinada;
import Beverage.Decorador;

/**
 *
 * @author Jhon
 */
public class CoffeNBreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Fazendo um café: ");
        Beverage cafe = new Cafeinada("Café", "Café preto", 2.50);
        cafe.template();
        
        System.out.println("Fazendo um capuccino: ");
        Beverage capuccino = new Cafeinada("Café", "café", 5.00);
        capuccino.template();
        System.out.println("Bebida: " + capuccino.getDescricao());
        System.out.println("Custo: R$" + capuccino.getCusto());
        capuccino = new Decorador(capuccino, 1.50, "Creme");
        System.out.println("Bebida: " + capuccino.getDescricao());
        System.out.println("Custo: R$" + capuccino.getCusto());
        
        Beverage morango = new BaseLeite("Morango","Morango",3.00);
        
    }
    
}
