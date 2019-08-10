/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4_heranca;

/**
 *
 * @author g
 */
public class Aluno extends Pessoa {
    private String matricula;

    Aluno(String nome, Integer idade, String cpf, String matricula) {
        super(nome, idade, cpf);
        this.matricula = matricula;
    }

    public String apresentaAluno() {
        String result = super.apresentaPessoa();
        result = result + "\nE minha matrícula é " + this.matricula + "!";
        return result;
    }
}
