/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _5_registro;

/**
 *
 * @author g
 */
public class Aluno {
    private String nome;
    private String CPF;
    
    Aluno(String nome, String CPF) {
        this.CPF = CPF;
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCPF() {
        return CPF;
    }
    
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
