/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormaPagamento;

/**
 *
 * @author Jhon
 */
public abstract class Cartao implements FormaPagamento{
    
        public abstract void verificaSaldo();
       
        public void passarCartao(){
            System.out.println("Conectando cartao...");
        }
        public void conectarBandeira(){
            System.out.println("Conectando bandeira...");
        }
        public void impressaoRecibo(){
            System.out.println("Imprimindo 2 vias de recibo...");
        }
        
        public final void pagar(){
        passarCartao();
        conectarBandeira();
        verificaSaldo();
        impressaoRecibo();
        }
}
