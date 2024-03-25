public class Carro {
    String modelo;
    int ano;
    String cor;


    void fichaTecnicaCarro(){
        System.out.println("===================\n");
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano de fabricação: " + ano);
        System.out.println("Cor: " + cor + "\n");
        System.out.println("===================\n");
    }
    double idadeCarro(){
        ano = 2024 - ano;
        System.out.println("O carro possui " + ano + " anos.");
    return ano;
    }
}
