package app._4_heranca;

/**
 * Aluno
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