package app._3_composicao;

/**
 * Pessoa
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
    String result = "Olá, meu nome é " + this.nome + "!\n";
    result = result + "Eu tenho " + this.idade + " anos.\n";
    result = result + "E meu CPF é " + this.cpf + ".";
    return result;
  }
}
