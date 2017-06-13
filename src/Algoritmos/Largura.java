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


public class Largura implements InterfaceBusca{

    @Override
    public Caminho buscar(Grafo grafo, String origem, String destino) {
        ArrayList<String> marcados = new ArrayList();
        CaminhoDijkstra fila = new CaminhoDijkstra();
        
        Vertice vAtual = grafo.getVertice(origem);
        marcados.add(vAtual.getNome());
        
        VerticeCaminhoDijkstra vCam = new VerticeCaminhoDijkstra(vAtual.getNome(), null, 0, true);
        fila.caminho.add(vCam);
        
        CaminhoDijkstra caminhoInicial = criarCaminho();
        VerticeCaminhoDijkstra aux = caminhoInicial.caminho.get(Cast.convertToInt(vCam.getNome()));
        aux.setAnterior(null);
        aux.setCustoAcumulado(0);
        caminhoInicial.caminho.set(Cast.convertToInt(aux.getNome()), aux);
        
        while (fila.caminho.size() > 0){
            vCam = dequeue (fila);
            Vertice vOriginal = grafo.getVertice(vCam.getNome());
            
            ArrayList<Aresta> vizinhos = vOriginal.getAdj();
            
            boolean stop = false;
            
            for (Aresta a : vizinhos){
                if (!marcados.contains(a.getDestino())){
                    marcados.add(a.getDestino());
                    fila.caminho.add(new VerticeCaminhoDijkstra(a.getDestino(), 
                            vCam.getNome(), vCam.getCustoAcumulado() + a.getCusto(), true));
                    
                    aux = caminhoInicial.caminho.get(Cast.convertToInt(a.getDestino()));
                    aux.setAnterior(vCam.getNome());
                    aux.setCustoAcumulado(vCam.getCustoAcumulado() + a.getCusto());
                    caminhoInicial.caminho.set(Cast.convertToInt(aux.getNome()), aux);
                    
                    if (a.getDestino().equals(destino)){
                        stop = true;
                        break;
                    }
                }
            }
            if (stop)
                break;
        }
        
        vCam = caminhoInicial.caminho.get(Cast.convertToInt(destino));
        int custoTotal = vCam.getCustoAcumulado();
        ArrayList<String> nomes = new ArrayList();
        
        while (vCam != null){            
            nomes.add(0, vCam.getNome());
            
            if(vCam.getAnterior() != null)
                vCam = caminhoInicial.caminho.get(Cast.convertToInt(vCam.getAnterior()));
            else
                break;
        }
        
        Caminho caminho = new Caminho(nomes, custoTotal);
        return caminho;
        
        
        
    }
    
    private VerticeCaminhoDijkstra dequeue (CaminhoDijkstra fila){
        VerticeCaminhoDijkstra prim = null;
        
        if (fila.caminho.size() > 0){
            prim = fila.caminho.get(0);
            fila.caminho.remove(prim);
        }
        
        return prim;
    }
    
    private CaminhoDijkstra criarCaminho(){
        CaminhoDijkstra c = new CaminhoDijkstra();
        
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
}
