package Model;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
    private List<Vertice> grafo;
    
    public Grafo (String tipo){
        ArrayList<Aresta> arestas = new ArrayList<Aresta>();
               
        if (tipo.equals("nao orientado")){
            arestas.add(new Aresta("ilha do retiro", "faculdade nova roma", 0));
            arestas.add(new Aresta("ilha do retiro", "hospital portugues", 0));
            grafo.add(new Vertice ("ilha do retiro", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("hospital portugues", "IMIP", 0));
            arestas.add(new Aresta("hospital portugues", "estacao joana bezerra", 0));
            arestas.add(new Aresta("hospital portugues", "ilha do retiro", 0));
            arestas.add(new Aresta("hospital portugues", "hospital hapvida", 0));
            grafo.add(new Vertice ("hospital portugues", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("faculdade nova roma", "ilha do retiro", 0));
            arestas.add(new Aresta("faculdade nova roma", "estacao afogados", 0));
            grafo.add(new Vertice ("faculdade nova roma", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("estacao afogados", "faculdade nova roma", 0));
            arestas.add(new Aresta("estacao afogados", "estacao largo da paz", 0));
            arestas.add(new Aresta("estacao afogados", "estacao joana bezerra", 0));
            arestas.add(new Aresta("estacao afogados", "7 DSUP", 0));
            grafo.add(new Vertice ("estacao afogados", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("estacao largo da paz", "estacao afogados", 0));
            arestas.add(new Aresta("estacao largo da paz", "7 DSUP", 0));
            grafo.add(new Vertice ("estacao largo da paz", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("7 DSUP", "estacao afogados", 0));
            arestas.add(new Aresta("7 DSUP", "estacao largo da paz", 0));
            arestas.add(new Aresta("7 DSUP", "cabanga", 0));
            arestas.add(new Aresta("7 DSUP", "estacao joana bezerra", 0));
            grafo.add(new Vertice ("7 DSUP", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("cabanga", "7 DSUP", 0));
            arestas.add(new Aresta("cabanga", "estacao joana bezerra", 0));
            arestas.add(new Aresta("cabanga", "forte das cinco pontas", 0));
            grafo.add(new Vertice ("cabanga", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("estacao joana bezerra", "7 DSUP", 0));
            arestas.add(new Aresta("estacao joana bezerra", "cabanga", 0));
            arestas.add(new Aresta("estacao joana bezerra", "estacao afogados", 0));
            arestas.add(new Aresta("estacao joana bezerra", "hospital portugues", 0));
            arestas.add(new Aresta("estacao joana bezerra", "estacao recife", 0));
            arestas.add(new Aresta("estacao joana bezerra", "forte das cinco pontas", 0));
            grafo.add(new Vertice ("estacao joana bezerra", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("forte das cinco pontas", "cabanga", 0));
            arestas.add(new Aresta("forte das cinco pontas", "estacao joana bezerra", 0));
            arestas.add(new Aresta("forte das cinco pontas", "estacao recife", 0));
            arestas.add(new Aresta("forte das cinco pontas", "mercado de sao jose", 0));
            grafo.add(new Vertice ("forte das cinco pontas", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("estacao recife", "estacao joana bezerra", 0));
            arestas.add(new Aresta("estacao recife", "forte das cinco pontas", 0));
            arestas.add(new Aresta("estacao recife", "praca da independencia", 0));
            grafo.add(new Vertice ("estacao recife", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("mercado de sao jose", "forte das cinco pontas", 0));
            arestas.add(new Aresta("mercado de sao jose", "praca da independencia", 0));
            grafo.add(new Vertice ("mercado de sao jose", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("praca da independencia", "IMIP", 0));
            arestas.add(new Aresta("praca da independencia", "estacao recife", 0));
            arestas.add(new Aresta("praca da independencia", "mercado de sao jose", 0));
            grafo.add(new Vertice ("praca da independencia", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("IMIP", "praca da independencia", 0));
            arestas.add(new Aresta("IMIP", "hospital hapvida", 0));
            arestas.add(new Aresta("IMIP", "hospital portugues", 0));
            grafo.add(new Vertice ("IMIP", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("hospital hapvida", "hospital portugues", 0));
            arestas.add(new Aresta("hospital hapvida", "IMIP", 0));
            grafo.add(new Vertice ("hospital hapvida", arestas));
        }
        
        else if (tipo.equals("orientado")){
            arestas.add(new Aresta("ilha do retiro", "estacao afogados", 0));
            grafo.add(new Vertice ("ilha do retiro", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("hospital portugues", "IMIP", 0));
            arestas.add(new Aresta("hospital portugues", "ilha do retiro", 0));
            grafo.add(new Vertice ("hospital portugues", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("faculdade nova roma", "estacao afogados", 0));
            grafo.add(new Vertice ("faculdade nova roma", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("estacao afogados", "faculdade nova roma", 0));
            arestas.add(new Aresta("estacao afogados", "estacao joana bezerra", 0));
            arestas.add(new Aresta("estacao afogados", "7 DSUP", 0));
            grafo.add(new Vertice ("estacao afogados", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("estacao largo da paz", "estacao afogados", 0));
            grafo.add(new Vertice ("estacao largo da paz", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("7 DSUP", "estacao largo da paz", 0));
            arestas.add(new Aresta("7 DSUP", "cabanga", 0));
            grafo.add(new Vertice ("7 DSUP", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("cabanga", "estacao joana bezerra", 0));
            grafo.add(new Vertice ("cabanga", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("estacao joana bezerra", "estacao afogados", 0));
            arestas.add(new Aresta("estacao joana bezerra", "hospital portugues", 0));
            arestas.add(new Aresta("estacao joana bezerra", "estacao recife", 0));
            grafo.add(new Vertice ("estacao joana bezerra", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("forte das cinco pontas", "mercado de sao jose", 0));
            grafo.add(new Vertice ("forte das cinco pontas", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("estacao recife", "estacao joana bezerra", 0));
            arestas.add(new Aresta("estacao recife", "forte das cinco pontas", 0));
            arestas.add(new Aresta("estacao recife", "praca da independencia", 0));
            grafo.add(new Vertice ("estacao recife", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("mercado de sao jose", "estacao recife", 0));
            grafo.add(new Vertice ("mercado de sao jose", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("praca da independencia", "IMIP", 0));
            arestas.add(new Aresta("praca da independencia", "mercado de sao jose", 0));
            grafo.add(new Vertice ("praca da independencia", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("IMIP", "praca da independencia", 0));
            arestas.add(new Aresta("IMIP", "hospital hapvida", 0));
            grafo.add(new Vertice ("IMIP", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("hospital hapvida", "hospital portugues", 0));
            grafo.add(new Vertice ("hospital hapvida", arestas));
        }
    }
    
}
