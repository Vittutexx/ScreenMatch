public class Aluno {
    private String nome;
    private double somaDasNotas;
    private double totalDeNotas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSomaDasNotas() {
        return somaDasNotas;
    }

    public void setSomaDasNotas(double notas) {
        this.somaDasNotas = notas;
    }

    public double getTotalDeNotas() {
        return totalDeNotas;
    }

    public void setTotalDeNotas(double totalDeNotas) {
        this.totalDeNotas = totalDeNotas;
    }

    public void avaliar(int nota) {
        somaDasNotas += nota;
        totalDeNotas++;
    }

    public double calcularMedia(){
        double media = this.somaDasNotas / this.totalDeNotas;
    return media;
    }
}
