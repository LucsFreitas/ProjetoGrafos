package Model;

import java.util.ArrayList;
import java.util.List;

public class Vertice {
    private String nome;
    private List<Aresta> adj;
    
    public Vertice(String nome, List<Aresta> adj){
        this.nome = nome;
        this.adj = adj;
    }

    public String getNome() {
        return nome;
    }

    public List<Aresta> getAdj() {
        return adj;
    }
}
