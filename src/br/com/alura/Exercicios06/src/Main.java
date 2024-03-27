import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1. Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.
        ArrayList<String> cores = new ArrayList<>();

        cores.add("azul");
        cores.add("vermelho");
        cores.add("amarelo");
        cores.add("verde");

        cores.forEach(cor -> System.out.println(cor));

        //2. Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.
        Cachorro dog = new Cachorro("SIM", "SIM", "SIM");

        //3. Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do tipo correto antes de fazer o casting.
        if (dog instanceof Cachorro) {
            Animal gato = (Animal) dog;
        }


        //4. Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        Produto produto1 = new Produto("Rexona", 2.50);
        Produto produto2 = new Produto("Skala", 6.50);
        Produto produto3 = new Produto("Head&Shoulders", 9.50);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        double qtdProduto = 0.00;
        double media;
        double valoresProduto = 0.00;

        for (Produto produto : produtos) {
            valoresProduto += produto.getPreco();
            qtdProduto++;
        }
        media = (valoresProduto / qtdProduto);

        System.out.println("MEDIA DE PREÇO DOS PRODUTOS: " + media);


        //5. Crie uma interface Forma com um método calcularArea(). Implemente a interface em duas classes, por exemplo, Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface Forma) e utilize um loop para calcular e imprimir a área de cada forma.
        ArrayList<Forma> formas = new ArrayList<Forma>();

        Circulu circulo = new Circulu(5, 10);
        Quadrado quadrado = new Quadrado(10, 10);
        Circulu circulu = new Circulu(3, 5);
        Quadrado quadrado1 = new Quadrado(2, 4);


        formas.add(quadrado1);
        formas.add(quadrado);
        formas.add(circulo);
        formas.add(circulu);

        for (Forma forma : formas) {
            double resultado = forma.calcularArea();

                System.out.println("Área: " + resultado);
            }


        }//main
    }//class