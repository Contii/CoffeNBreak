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
public abstract class Funcionario extends PessoaFisica{
    protected Integer cod_Funcionario;
    protected Date dataAdmissao;
    protected Date dataRescisao;
    protected String cargo;    
}
