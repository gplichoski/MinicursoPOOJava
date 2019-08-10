/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_composicao;

/**
 *
 * @author g
 */
public class Aluno {
    private Pessoa pessoa;
    private String matricula;

    Aluno(String nome, Integer idade, String cpf, String matricula) {
        pessoa = new Pessoa(nome, idade, cpf);
        this.matricula = matricula;
    }

    public String apresentaAluno() {
        String result = pessoa.apresentaPessoa();
        result = result + "\nE minha matrícula é " + this.matricula + "!";
        return result;
    }
}
