package Algoritmos;

import Base.InterfaceBusca;
import Model.Caminho;
import Model.Grafo;
import Model.Vertice;
import Model.VerticeCaminho;
import java.util.ArrayList;
import java.util.List;

public class Dijkstra implements InterfaceBusca{
    private Caminho c;
    
    @Override
    public Caminho buscar(Grafo grafo, String origem, String destino) {
        Vertice inicial = grafo.getVertice(origem);
        
        int verticeAtual = convertToInt(inicial.getNome());
        
        
    }
    
    private Caminho criarCaminho(){
        c = new Caminho();
        
        c.caminho.add(new VerticeCaminho("ilha do retiro", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminho("hospital ilha do leite", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminho("faculdade nova roma", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminho("estacao afogados", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminho("estacao largo da paz", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminho("7 DSUP", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminho("cabanga", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminho("estacao joana bezerra", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminho("forte das cinco pontas", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminho("estacao recife", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminho("mercado sao jose", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminho("praca da independencia", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminho("IMIP", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminho("hospital hapvida", "", Integer.MAX_VALUE, false));
        
        return c;
    }
    
    private int convertToInt(String str){
        if (str.equals("ilha do retiro"))
            return 0;
        else if (str.equals("hospital ilha do leite"))
            return 1;
        else if (str.equals("faculdade nova roma"))
            return 2;
        else if (str.equals("estacao afogados"))
            return 3;
        else if (str.equals("estacao largo da paz"))
            return 4;
        else if (str.equals("7 DSUP"))
            return 5;
        else if (str.equals("cabanga"))
            return 6;
        else if (str.equals("estacao joana bezerra"))
            return 7;
        else if (str.equals("forte das cinco pontas"))
            return 8;
        else if (str.equals("estacao recife"))
            return 9;
        else if (str.equals("mercado sao jose"))
            return 10;
        else if (str.equals("praca da independencia"))
            return 11;
        else if (str.equals("IMIP"))
            return 12;
        else
            return 13;
    }
}
