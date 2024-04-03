public class Titulo implements Comparable<Titulo>{
    private String nome;


    //CONSTRUTOR
    public Titulo(String nome) {
        this.nome = nome;
    }


    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public int compareTo(Titulo outro) {
        return this.getNome().compareTo(outro.getNome());
    }

    @Override
    public String toString() {
        return "Nome do Título: " + this.getNome();
    }
}
