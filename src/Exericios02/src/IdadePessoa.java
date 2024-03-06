public class IdadePessoa {
    private String nome;
    private int idade;

    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade(){
        if (this.idade >= 18){
            System.out.println("Já atingiu a maioridade");
        } else {
            System.out.println("Aindá é menor de idade.");
        }
    }
}
