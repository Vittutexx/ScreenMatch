package model;

public class Teste {
    public static void main(String[] args) {
        ModeloCarro modelo = new ModeloCarro();
        modelo.definirPreco(5000, 4000, 3000);
        modelo.nomeDoModelo("Hilux");


        System.out.println(modelo.maiorPreco());
        System.out.println(modelo.menorPreco());
        System.out.println(modelo.exibirInfo("2021", "2022", "2023"));



    }


}
