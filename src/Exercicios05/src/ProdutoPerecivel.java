public class ProdutoPerecivel extends Produto{

    private String dataValidade;

    //CONSTRUTOR
    public ProdutoPerecivel(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    //GETTERS E SETTERS
    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return super.toString() + " || " +
                "Data de validade: " +
                this.dataValidade;
    }
}
