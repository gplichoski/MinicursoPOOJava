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
public class Turma {
    private String materia;
    private Professor professor;
    private Integer index = 0;
    private Aluno[] alunos = new Aluno[50];
    
    Turma(String materia, Professor professor) {
        this.materia = materia;
        this.professor = professor;
    }
    
    public String getMateria() {
        return materia;
    }
    
    public Professor getProfessor() {
        return professor;
    }
    
    public Aluno[] getAlunos() {
        return alunos;
    }
    
    public void incluirAluno(Aluno aluno) {
        alunos[index] = aluno;
        index++;
    } 
}
