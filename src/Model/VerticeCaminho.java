package Model;

public class VerticeCaminho {
    private String nome;
    private String anterior;
    private int custoAcumulado;
    private boolean visitado;

    public VerticeCaminho(String nome, String anterior, int custoAcumulado, boolean visitado) {
        this.nome = nome;
        this.anterior = anterior;
        this.custoAcumulado = custoAcumulado;
        this.visitado = this.visitado;
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

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public void setCustoAcumulado(int custoAcumulado) {
        this.custoAcumulado = custoAcumulado;
    }
}
