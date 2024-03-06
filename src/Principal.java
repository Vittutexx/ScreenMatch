public class Principal {
    public static void main(String[] args) {
        //Criando uma variável com referencia do tipo Filme
        Filme meuFilme = new Filme();


        //Instanciando o objeto e passando valores para os seus atributos
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibirFichaTecnica();
        meuFilme.avaliar(8);
        meuFilme.avaliar(5);
        meuFilme.avaliar(10);

        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.retornaMedia());


    }
}

