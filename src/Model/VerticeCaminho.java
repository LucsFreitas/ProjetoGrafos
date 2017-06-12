package Model;

public class VerticeCaminho {
    private String nome;
    private String anterior;
    private int custoAcumulado;
    private boolean verificado;

    public String getNome() {
        return nome;
    }

    public String getAnterior() {
        return anterior;
    }

    public int getCustoAcumulado() {
        return custoAcumulado;
    }

    public boolean isVerificado() {
        return verificado;
    }

    public void setAnterior(String anterior) {
        this.anterior = anterior;
    }

    public void setCustoAcumulado(int custoAcumulado) {
        this.custoAcumulado = custoAcumulado;
    }

    public void setVerificado(boolean verificado) {
        this.verificado = verificado;
    }
}
