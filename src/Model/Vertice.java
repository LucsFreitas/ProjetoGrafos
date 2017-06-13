package Model;

import java.util.ArrayList;
import java.util.List;

public class Vertice {
    private String nome;
    private ArrayList<Aresta> adj;
    
    public Vertice(String nome, ArrayList<Aresta> adj){
        this.nome = nome;
        this.adj = adj;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Aresta> getAdj() {
        return adj;
    }
    
}
