/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoa;

import java.util.Date;

/**
 *
 * @author Jhon
 */
public class Cliente extends PessoaFisica{
    protected Integer cod_Cliente;
    protected Date dataCadastro;
    Double saldo;
    
    public void Cliente(String nome, String RG, String CPF, Integer cod_cliente, Date datacadastro, Double saldo){
        super.nome = nome;
        super.cpf = CPF;
        super.rg = RG;
        cod_Cliente = cod_cliente;
        dataCadastro = datacadastro;
        this.saldo = saldo;
    }
}
