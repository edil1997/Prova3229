/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.repository;

import br.com.locadora.mapeamento.pessoa.ProfessorMapeamento;
import java.util.List;

/**
 *
 * @author laboratorioa
 */
class ProfessorRepository {
  public void salvar(ProfessorMapeamento professor){
        Conectar();
        getSession().save(professor);
        Fechar();
    }
    
    public List<ProfessorMapeamento> buscarTodos(){
        List<ProfessorMapeamento> listaDeProfessor;
        Conectar();
        listaDeProfessor = getSession().createQuery("from ProfessorMapeamento").list();
        Fechar();
        return listaDeProfessor;
    }

    private void Conectar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object getSession() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Fechar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}   

