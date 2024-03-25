public class Produto {
    /* 1. Crie uma classe Produto
    com atributos como nome, preco, e quantidade.
    Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList. Adicione alguns produtos, imprima o tamanho da lista e
    recupere um produto pelo índice. */
    private String nome;
    private double preco;
    private int quantidade;


    /*3. Modifique a classe Produto para incluir um construtor que aceite parâmetros para
    inicializar os atributos.
    Em seguida, crie objetos
    Produto utilizando esse novo construtor.*/

    //CONSTRUTOR
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

   /*2. Implemente o método toString()
   na classe Produto para retornar uma representação em texto do objeto.
   Em seguida, imprima a lista de produtos utilizando o método System.out.println().*/
    @Override
    public String toString() {
        return "Marca: " + this.getNome() +  " || " + " Preco: " + this.getPreco() + " || " + " Qtd: " + this.quantidade ;
    }
}

