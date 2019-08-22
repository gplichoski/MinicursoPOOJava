/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _5_desafio;

/**
 *
 * @author g
 */
public class Turma {
    public String materia;
    public Professor professor;
    private Integer index = 0;
    public Aluno[] alunos = new Aluno[50];
    
    Turma(String materia, Professor professor) {
        this.materia = materia;
        this.professor = professor;
    }
    
    public void incluirAluno(Aluno aluno) {
        alunos[index] = aluno;
        index++;
    } 
}
