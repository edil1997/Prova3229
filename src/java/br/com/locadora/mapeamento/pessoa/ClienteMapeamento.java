/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.mapeamento.pessoa;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Frank
 */
@Entity
@Table(name = "cliente")
public class ClienteMapeamento extends PessoaMapeamento implements Serializable{
    private boolean pessoaFisica;
    private boolean bomPagador;

    public boolean isPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(boolean pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public boolean isBomPagador() {
        return bomPagador;
    }

    public void setBomPagador(boolean bomPagador) {
        this.bomPagador = bomPagador;
    }
    
    
}
