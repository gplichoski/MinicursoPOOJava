package app._1_classes;

/**
 * PessoaMain
 */
public class PessoaMain {
  public static void main(String[] args) {
    Pessoa referenciaGuilherme = new Pessoa();

    referenciaGuilherme.criaPessoa("Guilherme");

    referenciaGuilherme.nomeDaPessoa = "Jonas";

    System.out.println(referenciaGuilherme.apresentaPessoa());
  }
}
