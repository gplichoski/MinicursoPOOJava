/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1_classes;

/**
 *
 * @author g
 */
public class Pessoa {
    String nomeDaPessoa;

    void criaPessoa(String nome) {
        nomeDaPessoa = nome;
    }

    String apresentaPessoa() {
        return "Ola, meu nome eh " + nomeDaPessoa + "!";
    }

    public static void main(String[] args) {
        Pessoa referenciaGuilherme = new Pessoa();
        referenciaGuilherme.criaPessoa("Guilherme");
        System.out.println(referenciaGuilherme.apresentaPessoa());

        // Crie aqui referencias à objetos
    }
}
