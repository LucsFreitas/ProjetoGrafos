package Model;

import java.util.ArrayList;

public class Grafo {
    private ArrayList<Vertice> grafo;
    
    public Grafo (String tipo){
        ArrayList<Aresta> arestas = new ArrayList<Aresta>();
               
        if (tipo.equals("nao orientado")){
            arestas.add(new Aresta("ilha do retiro", "faculdade nova roma", 630));
            arestas.add(new Aresta("ilha do retiro", "hospital ilha do leite", 982));
            grafo.add(new Vertice ("ilha do retiro", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("hospital ilha do leite", "IMIP", 694));
            arestas.add(new Aresta("hospital ilha do leite", "estacao joana bezerra", 826));
            arestas.add(new Aresta("hospital ilha do leite", "ilha do retiro", 982));
            arestas.add(new Aresta("hospital ilha do leite", "hospital hapvida", 357));
            grafo.add(new Vertice ("hospital ilha do leite", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("faculdade nova roma", "ilha do retiro", 630));
            arestas.add(new Aresta("faculdade nova roma", "estacao afogados", 1260));
            grafo.add(new Vertice ("faculdade nova roma", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("estacao afogados", "faculdade nova roma", 1260));
            arestas.add(new Aresta("estacao afogados", "estacao largo da paz", 477));
            arestas.add(new Aresta("estacao afogados", "estacao joana bezerra", 1260));
            arestas.add(new Aresta("estacao afogados", "7 DSUP", 900));
            grafo.add(new Vertice ("estacao afogados", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("estacao largo da paz", "estacao afogados", 477));
            arestas.add(new Aresta("estacao largo da paz", "7 DSUP", 513));
            grafo.add(new Vertice ("estacao largo da paz", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("7 DSUP", "estacao afogados", 900));
            arestas.add(new Aresta("7 DSUP", "estacao largo da paz", 513));
            arestas.add(new Aresta("7 DSUP", "cabanga", 405));
            arestas.add(new Aresta("7 DSUP", "estacao joana bezerra", 855));
            grafo.add(new Vertice ("7 DSUP", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("cabanga", "7 DSUP", 405));
            arestas.add(new Aresta("cabanga", "estacao joana bezerra", 630));
            arestas.add(new Aresta("cabanga", "forte das cinco pontas", 1753));
            grafo.add(new Vertice ("cabanga", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("estacao joana bezerra", "7 DSUP", 855));
            arestas.add(new Aresta("estacao joana bezerra", "cabanga", 630));
            arestas.add(new Aresta("estacao joana bezerra", "estacao afogados", 1260));
            arestas.add(new Aresta("estacao joana bezerra", "hospital ilha do leite", 826));
            arestas.add(new Aresta("estacao joana bezerra", "estacao recife", 1193));
            arestas.add(new Aresta("estacao joana bezerra", "forte das cinco pontas", 1305));
            grafo.add(new Vertice ("estacao joana bezerra", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("forte das cinco pontas", "cabanga", 1753));
            arestas.add(new Aresta("forte das cinco pontas", "estacao joana bezerra", 1305));
            arestas.add(new Aresta("forte das cinco pontas", "estacao recife", 630));
            arestas.add(new Aresta("forte das cinco pontas", "mercado sao jose", 580));
            grafo.add(new Vertice ("forte das cinco pontas", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("estacao recife", "estacao joana bezerra", 1193));
            arestas.add(new Aresta("estacao recife", "forte das cinco pontas", 630));
            arestas.add(new Aresta("estacao recife", "praca da independencia", 999));
            grafo.add(new Vertice ("estacao recife", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("mercado sao jose", "forte das cinco pontas", 580));
            arestas.add(new Aresta("mercado sao jose", "praca da independencia", 400));
            grafo.add(new Vertice ("mercado sao jose", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("praca da independencia", "IMIP", 1200));
            arestas.add(new Aresta("praca da independencia", "estacao recife", 999));
            arestas.add(new Aresta("praca da independencia", "mercado sao jose", 400));
            grafo.add(new Vertice ("praca da independencia", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("IMIP", "praca da independencia", 1200));
            arestas.add(new Aresta("IMIP", "hospital hapvida", 321));
            arestas.add(new Aresta("IMIP", "hospital ilha do leite", 694));
            grafo.add(new Vertice ("IMIP", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("hospital hapvida", "hospital ilha do leite", 357));
            arestas.add(new Aresta("hospital hapvida", "IMIP", 321));
            grafo.add(new Vertice ("hospital hapvida", arestas));
        }
        
        else if (tipo.equals("orientado")){
            arestas.add(new Aresta("ilha do retiro", "estacao afogados", 1160));
            grafo.add(new Vertice ("ilha do retiro", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("hospital ilha do leite", "IMIP", 694));
            arestas.add(new Aresta("hospital ilha do leite", "ilha do retiro", 982));
            grafo.add(new Vertice ("hospital ilha do leite", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("faculdade nova roma", "estacao afogados", 1260));
            grafo.add(new Vertice ("faculdade nova roma", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("estacao afogados", "faculdade nova roma", 1260));
            arestas.add(new Aresta("estacao afogados", "estacao joana bezerra", 1260));
            arestas.add(new Aresta("estacao afogados", "7 DSUP", 900));
            grafo.add(new Vertice ("estacao afogados", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("estacao largo da paz", "estacao afogados", 477));
            grafo.add(new Vertice ("estacao largo da paz", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("7 DSUP", "estacao largo da paz", 513));
            arestas.add(new Aresta("7 DSUP", "cabanga", 405));
            grafo.add(new Vertice ("7 DSUP", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("cabanga", "estacao joana bezerra", 630));
            grafo.add(new Vertice ("cabanga", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("estacao joana bezerra", "estacao afogados", 1260));
            arestas.add(new Aresta("estacao joana bezerra", "hospital ilha do leite", 826));
            arestas.add(new Aresta("estacao joana bezerra", "estacao recife", 1193));
            grafo.add(new Vertice ("estacao joana bezerra", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("forte das cinco pontas", "mercado sao jose", 580));
            grafo.add(new Vertice ("forte das cinco pontas", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("estacao recife", "estacao joana bezerra", 1193));
            arestas.add(new Aresta("estacao recife", "forte das cinco pontas", 630));
            arestas.add(new Aresta("estacao recife", "praca da independencia", 999));
            grafo.add(new Vertice ("estacao recife", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("mercado sao jose", "estacao recife", 705));
            grafo.add(new Vertice ("mercado sao jose", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("praca da independencia", "IMIP", 1200));
            arestas.add(new Aresta("praca da independencia", "mercado sao jose", 400));
            grafo.add(new Vertice ("praca da independencia", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("IMIP", "praca da independencia", 1200));
            arestas.add(new Aresta("IMIP", "hospital hapvida", 321));
            grafo.add(new Vertice ("IMIP", arestas));
            
            arestas = new ArrayList<Aresta>();
            arestas.add(new Aresta("hospital hapvida", "hospital ilha do leite", 357));
            grafo.add(new Vertice ("hospital hapvida", arestas));
        }
    }    
}
