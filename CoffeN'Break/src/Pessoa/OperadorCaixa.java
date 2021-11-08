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
public class OperadorCaixa extends Funcionario{
    
    public void OperadorCaixa(String nome, String RG, String CPF, Integer cod_funcionario, Date dataadmissao, Date datarescisao, String cargo){
        super.nome = nome;
        super.cpf = CPF;
        super.rg = RG;
        super.cod_Funcionario = cod_funcionario;
        super.dataAdmissao = dataadmissao;
        super.dataRescisao = datarescisao;
        super.cargo = cargo;
    }    
}