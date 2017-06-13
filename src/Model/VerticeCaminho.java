package Model;

public class VerticeCaminho {
    private String nome;
    private String anterior;
    private int custoAcumulado;

    public VerticeCaminho(String nome, String anterior, int custoAcumulado) {
        this.nome = nome;
        this.anterior = anterior;
        this.custoAcumulado = custoAcumulado;
    }

    public String getNome() {
        return nome;
    }

    public String getAnterior() {
        return anterior;
    }

    public int getCustoAcumulado() {
        return custoAcumulado;
    }

    public void setAnterior(String anterior) {
        this.anterior = anterior;
    }

    public void setCustoAcumulado(int custoAcumulado) {
        this.custoAcumulado = custoAcumulado;
    }
}
