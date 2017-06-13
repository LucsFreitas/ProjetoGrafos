package Model;

import java.util.ArrayList;

public class Caminho {
    private ArrayList<String> vertices;
    private int custo;

    public Caminho(ArrayList<String> vertices, int custo) {
        this.vertices = vertices;
        this.custo = custo;
    }

    public ArrayList<String> getVertices() {
        return vertices;
    }

    public int getCusto() {
        return custo;
    }

}
