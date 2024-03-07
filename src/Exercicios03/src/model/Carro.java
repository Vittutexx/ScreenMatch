package model;
public class Carro {

    private String nome;
    protected double precoAno1;
    protected double precoAno2;
    protected double precoAno3;

    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoAno1() {
        return precoAno1;
    }

    public void setPrecoAno1(double precoAno1) {
        this.precoAno1 = precoAno1;
    }

    public double getPrecoAno2() {
        return precoAno2;
    }

    public void setPrecoAno2(double precoAno2) {
        this.precoAno2 = precoAno2;
    }

    public double getPrecoAno3() {
        return precoAno3;
    }

    public void setPrecoAno3(double precoAno3) {
        this.precoAno3 = precoAno3;
    }

    //METODOS
    public void nomeDoModelo(String nome){
        this.nome = nome;
        System.out.println("Nome do modelo:" + nome);
    }

    public void definirPreco(double ano1, double ano2, double ano3) {
        this.precoAno1 = ano1;
        this.precoAno2 = ano2;
        this.precoAno3 = ano3;
    }

    public double menorPreco(){
        double menorPreco = 0;
        if (this.precoAno1 < this.precoAno2 && this.precoAno1 < this.precoAno3){
            menorPreco = this.precoAno1;
        } else if (this.precoAno2 < this.precoAno1 && this.precoAno2 < this.precoAno3) {
            menorPreco = precoAno2;
        } else if(this.precoAno3 < this.precoAno1 && this.precoAno3 < this.precoAno2) {
            menorPreco = this.precoAno3;
        }
        return menorPreco;
    }

    public double maiorPreco() {
        double maiorPreco = 0;

        if (this.precoAno1 > this.precoAno2 && this.precoAno1 > this.precoAno3) {
            maiorPreco = this.precoAno1;
        } else if (this.precoAno2 > this.precoAno1 && this.precoAno2 > this.precoAno3) {
            maiorPreco = precoAno2;
        } else if (this.precoAno3 > this.precoAno1 && this.precoAno3 > this.precoAno2){
            maiorPreco = this.precoAno3;
    }
    return maiorPreco;
    }
    public String exibirInfo(){
        String dados = "O modelo do carro é " + this.nome  + "\n" +
                "O maior preço foi de " + this.maiorPreco() + "\n" +
                "O menor preço foi de " + this.menorPreco() + "\n";
    return dados;
    }
}