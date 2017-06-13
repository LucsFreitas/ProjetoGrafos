package Model;

public class Aresta {
    private String origem;
    private String destino;
    private int custo;

    public Aresta(String origem, String destino, int custo) {
        this.origem = origem;
        this.destino = destino;
        this.custo = custo;
    }
    
    public int getCusto(){
        return custo;
    }

    public String getDestino() {
        return destino;
    }
}
