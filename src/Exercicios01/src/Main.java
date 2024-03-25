import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Exercicio 1
        /*
        Pessoa pessoa1 = new Pessoa();
        System.out.println(pessoa1.printOlaMundo());
        */

        //Exercicio 2

        //Instanciando o objeto e atribuindo um valor a ele
        /*
        Calculadora calcular = new Calculadora();
        Scanner leitura = new Scanner(System.in);

        System.out.println("Escreva um numero que deseja dobrar: ");
        calcular.numero = leitura.nextInt();
        System.out.println("Resultado: " + calcular.multiplicacao(calcular.numero));
        */

        //Exercicio 3
        /*
        Musica musica = new Musica();

        musica.titulo = "If I Were a Boy";
        musica.artista = "Beyoncé";
        musica.anoLancamento = 2013;

        musica.fichaTecnica();
        musica.avaliarMusica(8);
        musica.avaliarMusica(5);
        musica.avaliarMusica(2);
        musica.mediaAvaliacoes();
        */
        //Exercicio 4
        /*
        Carro carro = new Carro();

        carro.ano = 1970;
        carro.cor = "Amarelo";
        carro.modelo = "Camaro";

        carro.fichaTecnicaCarro();
        carro.idadeCarro();
        */
        //Exercicio 5
        Aluno aluno = new Aluno();

        aluno.nome = "Vitor Teixeira Silva";
        aluno.idade = 21;

        aluno.exibirInfo();

    }
}
