public class Cachorro extends Animal {
    private String latir;

    public Cachorro(String andar, String comer, String latir) {
        super(andar, comer);
        this.latir = latir;
    }

    public String getLatir() {
        return latir;
    }

    public void setLatir(String latir) {
        this.latir = latir;
    }
}