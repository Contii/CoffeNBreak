/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Venda;

import FormaPagamento.FormaPagamento;

/**
 *
 * @author Jhon
 */
public class Venda {
    Integer cod_Venda;
    Integer cod_Cliente;
    Integer cod_Funcionario;
    String estado;
    
    FormaPagamento tipoPagamento;
    Double total;

    public void Venda(Integer cod_venda, Integer cod_cliente ,Integer cod_funcionario){
        cod_Venda = cod_venda;
        cod_Cliente = cod_cliente;
        cod_Funcionario = cod_funcionario;
        estado = "Aguardando Pagamento";
    }   
    public void atualizarTotal(Pedido pedido){
        total = total+pedido.bebida.custo;
    }
    public void pagar(FormaPagamento pagamento){
        tipoPagamento = pagamento;
        tipoPagamento.pagar();
        estado = "Pago";
    }
    
}
