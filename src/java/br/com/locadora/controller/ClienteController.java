/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.controller;

import br.com.locadora.mapeamento.pessoa.ClienteMapeamento;
import br.com.locadora.repository.ClienteRepository;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Frank
 */
@ManagedBean
public class ClienteController {
    private ClienteMapeamento clienteMapeamento;
    private ClienteRepository clienteRepository;
    private List<ClienteMapeamento> listaDeClientes;
    
    public ClienteController(){
        this.clienteMapeamento = new ClienteMapeamento();
        this.clienteRepository = new ClienteRepository();
        this.listaDeClientes = new ArrayList<>();
    }
    
    public void salvar(){
        this.clienteRepository.salvar(clienteMapeamento);
    }
    
    public void buscarTodos(){
        this.listaDeClientes = this.clienteRepository.buscarTodos();
    }

}
