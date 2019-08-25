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
public class Pessoa {
    private String nome;
    private Integer idade;
    private String cpf;

    Pessoa(String nome, Integer idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String apresentaPessoa() {
        String result = "Ola, meu nome eh " + this.nome + "!\n";
        result = result + "Eu tenho " + this.idade + " anos.\n";
        result = result + "E meu CPF eh " + this.cpf + ".";
        return result;
    }
}
