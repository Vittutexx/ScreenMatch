import br.com.alura.screematch.modelo.Filme;

public class Principal {
    public static void main(String[] args) {
        //Criando uma variável com referencia do tipo br.com.alura.screematch.modelo.Filme
        Filme meuFilme = new Filme();


        //Instanciando o objeto e passando valores para os seus atributos
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibirFichaTecnica();
        meuFilme.avaliar(8);
        meuFilme.avaliar(5);
        meuFilme.avaliar(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.retornaMedia());


    }
}

