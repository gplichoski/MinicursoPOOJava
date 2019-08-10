package app._3_composicao;

/**
 * Aluno
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