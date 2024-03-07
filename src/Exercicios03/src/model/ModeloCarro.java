package model;

public class ModeloCarro extends Carro{

    @Override
    public void nomeDoModelo(String nome) {
        super.nomeDoModelo(nome);
    }


    public String exibirInfo(String periodo1, String periodo2, String periodo3) {
        String info = "\n referente aos anos " + periodo1 + ", " + periodo2 + " e " + periodo3;
        return super.exibirInfo() + info ;
    }
}
