public class Pessoua {
    /* 1. Crie uma classe Pessoa com atributos
     como nome, idade, e um método toString
      que represente esses atributos. */
    private int idade;
    private String nome;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() +  " || " + " Idade: " + this.getIdade();
    }
}