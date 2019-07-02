/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.controller;


import br.com.locadora.repository.*;
import br.com.locadora.mapeamento.pessoa.ProfessorMapeamento;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Frank
 */
@ManagedBean
public class ProfessorController {
    private ProfessorMapeamento professorMapeamento;
    private ProfessorRepository professorRepository;
    private List<ProfessorMapeamento> listaDeProfessor;
    
    public ProfessorController(){
        this.professorMapeamento = new ProfessorMapeamento();
        this.professorRepository = new ProfessorRepository();
        this.listaDeProfessor = new ArrayList<>();
    }
    
    public void salvar(){
        this.professorRepository.salvar(professorMapeamento);
    }
    
    public void buscarTodos(){
        this.listaDeProfessor = this.professorRepository.buscarTodos();
    }

    public ProfessorMapeamento getProfessorMapeamento() {
        return professorMapeamento;
    }

    public void setProfessorMapeamento(ProfessorMapeamento professorMapeamento) {
        this.professorMapeamento = professorMapeamento;
    }

    public ProfessorRepository getProfessorRepository() {
        return professorRepository;
    }

    public void setProfessorRepository(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public List<ProfessorMapeamento> getListaDeProfessor() {
        return listaDeProfessor;
    }

    public void setListaDeProfessor(List<ProfessorMapeamento> listaDeProfessor) {
        this.listaDeProfessor = listaDeProfessor;
    }

}
