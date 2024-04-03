import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //1. Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.
        List<Integer> numero = new ArrayList<Integer>();
        numero.add(1);
        numero.add(5);
        numero.add(2);
        numero.add(4);
        numero.add(3);

        System.out.println(numero);
        Collections.sort(numero);
        System.out.println("Lista com os valores ordenados:  \n" + numero);


        //2. Crie uma classe Titulo com um atributo nome do tipo String. Implemente a interface Comparable na classe para que seja possível ordenar uma lista de objetos Titulo.
        List<Titulo> titulos = new ArrayList<Titulo>();


        //.3 No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista. Utilize o método Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.
        Titulo titulo1 = new Titulo("Gatsby");
        Titulo titulo2 = new Titulo("Wallstreet Wolf");
        Titulo titulo3 = new Titulo("Nada de novo no Front");

        titulos.add(titulo1);
        titulos.add(titulo2);
        titulos.add(titulo3);

        System.out.println("Titulos sem ordenação: \n" + titulos);
        Collections.sort(titulos);
        System.out.println("Titulos com ordenação: \n" + titulos);

        //4. Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList. Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.
        //5. Modifique o Exercício 4 para declarar a variável de lista como a interface List, demonstrando o uso de polimorfismo.

        //Instanciando a interface List
        List<String> listaa;
        //List<String> listaa = new ArrayList<>();

        //Fazendo casting para ArrayList
        listaa = new ArrayList<>();
        listaa.add("1");
        listaa.add("2");
        listaa.add("3");

        System.out.println("Como arraylist: \n" + listaa);

        //Fazendo casting para LinkedList
        listaa = new LinkedList<>();
        listaa.add("UM");
        listaa.add("DOIS");

        System.out.println("Como linkedlist: \n" + listaa);


    }
}