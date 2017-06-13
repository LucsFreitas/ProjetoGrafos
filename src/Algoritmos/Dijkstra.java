package Algoritmos;

import Base.Cast;
import Base.InterfaceBusca;
import Model.Aresta;
import Model.Caminho;
import Model.CaminhoDijkstra;
import Model.Grafo;
import Model.Vertice;
import Model.VerticeCaminhoDijkstra;
import java.util.ArrayList;

public class Dijkstra implements InterfaceBusca{
    private CaminhoDijkstra c = new CaminhoDijkstra();

    @Override
    public Caminho buscar(Grafo grafo, String origem, String destino) {
        c = criarCaminho();
        Vertice inicial = grafo.getVertice(origem);
        
        VerticeCaminhoDijkstra vAtual;
        
        int indexAtual = Cast.convertToInt(inicial.getNome());
        
        // insere dados para o vértice inicial
        vAtual = c.caminho.get(indexAtual);
        vAtual.setAnterior(null);
        vAtual.setCustoAcumulado(0);
        c.caminho.set(indexAtual, vAtual);
        
        if(!origem.equals(destino)){
             while (!completou()){
             vAtual.setVisitado(true);
             c.caminho.set(indexAtual, vAtual);
                        
             Vertice auxiliar = grafo.getVertice(Cast.convertToString(indexAtual));
                ArrayList<Aresta> vizinhosAtual = auxiliar.getAdj();
            
                for (Aresta a : vizinhosAtual){
                    String dest = a.getDestino();
                    int custo = vAtual.getCustoAcumulado() + a.getCusto();
                
                    VerticeCaminhoDijkstra vLoop = c.caminho.get(Cast.convertToInt(dest));
                
                    if (vLoop.isVisitado() == false){
                        if (vLoop.getCustoAcumulado() > custo){
                            vLoop.setCustoAcumulado(custo);
                            vLoop.setAnterior(vAtual.getNome());
                            c.caminho.set(Cast.convertToInt(dest), vLoop);
                        }
                    }
                }
                indexAtual = getMenorCusto();
                if (indexAtual == -1)
                    break;
                vAtual = c.caminho.get(indexAtual);
            }
        }
        else{
            ArrayList<String> nomes = new ArrayList();
            nomes.add(vAtual.getNome());
            
            Caminho caminho = new Caminho (nomes, 0);
            return caminho;
        }
        
        vAtual = c.caminho.get(Cast.convertToInt(destino));
        int custoTotal = vAtual.getCustoAcumulado();
        ArrayList<String> nomes = new ArrayList();
        
        while (vAtual != null){            
            nomes.add(0, vAtual.getNome());
            
            if(vAtual.getAnterior() != null)
                vAtual = c.caminho.get(Cast.convertToInt(vAtual.getAnterior()));
            else
                break;
        }
        
        Caminho caminho = new Caminho(nomes, custoTotal);
        return caminho;
    }
    
    private CaminhoDijkstra criarCaminho(){
        c = new CaminhoDijkstra();
        
        c.caminho.add(new VerticeCaminhoDijkstra("ilha do retiro", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoDijkstra("hospital ilha do leite", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoDijkstra("faculdade nova roma", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoDijkstra("estacao afogados", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoDijkstra("estacao largo da paz", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoDijkstra("7 DSUP", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoDijkstra("cabanga", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoDijkstra("estacao joana bezerra", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoDijkstra("forte das cinco pontas", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoDijkstra("estacao recife", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoDijkstra("mercado sao jose", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoDijkstra("praca da independencia", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoDijkstra("IMIP", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoDijkstra("hospital hapvida", "", Integer.MAX_VALUE, false));
        
        return c;
    }
    
    private boolean completou(){
        for (VerticeCaminhoDijkstra v : c.caminho){
            if (v.isVisitado() == false)
                return  false;
        }
        
        return true;
    }
    
    private int getMenorCusto(){
        int i = -1;
        int cont = 0;
        int custoMin = Integer.MAX_VALUE;
        
        for (VerticeCaminhoDijkstra vert : c.caminho){
            if (vert.isVisitado() == false){
                if (custoMin > vert.getCustoAcumulado()){
                    custoMin = vert.getCustoAcumulado();
                    i = cont;
                }                    
            }
            cont++;
        }
        
        return i;
    }
    
}
