/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.repository;

import br.com.locadora.dao.Conexao;
import br.com.locadora.mapeamento.pessoa.ClienteMapeamento;
import java.util.List;

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
    
    public List<ClienteMapeamento> buscarTodos(){
        List<ClienteMapeamento> listaDeClientes;
        Conectar();
        listaDeClientes = getSession().createQuery("from ClienteMapeamento").list();
        Fechar();
        return listaDeClientes;
    }
}
