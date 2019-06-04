/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.repository;

import br.com.locadora.dao.Conexao;
import br.com.locadora.mapeamento.pessoa.ClienteMapeamento;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Frank
 */
public class ClienteRepository extends Conexao{
    
    public void salvar(ClienteMapeamento cliente){
        Conectar();
        getSession().save(cliente);
        Fechar();
    }
}
