public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes(){
        System.out.println("===================\n");
        System.out.println("Título do Livro: " + this.titulo);
        System.out.println("Autor: " + this.autor + "\n");
        System.out.println("===================\n");
    }
}
