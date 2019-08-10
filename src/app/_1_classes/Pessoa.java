package app._1_classes;

/**
 * Pessoa
 */
public class Pessoa {

  String nomeDaPessoa;

  void criaPessoa(String nome) {
    nomeDaPessoa = nome;
  }

  String apresentaPessoa() {
    return "Olá, meu nome é " + nomeDaPessoa + "!";
  }

  public static void main(String[] args) {
    Pessoa referenciaGuilherme = new Pessoa();
    referenciaGuilherme.criaPessoa("Guilherme");
    System.out.println(referenciaGuilherme.apresentaPessoa());

    // Crie aqui referencias à objetos
  }
}
