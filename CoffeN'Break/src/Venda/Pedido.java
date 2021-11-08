/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Venda;

import Beverage.Beverage;

/**
 *
 * @author Jhon
 */
public class Pedido {
    Integer cod_Venda;
    String descricao;
    Beverage bebida;
    String estado;
    
    public void Pedido(Integer cod_venda, String descricao){
        cod_Venda = cod_venda;
        this.descricao = descricao;
        estado = "Aguardando";
    }
    public void AtualizarPedido(Beverage beverage){
        bebida = beverage;
        estado = "Entregue";
    }
}
