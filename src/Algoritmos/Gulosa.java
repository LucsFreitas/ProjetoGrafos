package Algoritmos;

import Base.Cast;
import Base.InterfaceBusca;
import Model.Aresta;
import Model.Caminho;
import Model.DistanciaLinhaReta;
import Model.Grafo;
import Model.Vertice;
import java.util.ArrayList;


public class Gulosa implements InterfaceBusca{
    private DistanciaLinhaReta dist = new DistanciaLinhaReta();

    @Override
    public Caminho buscar(Grafo grafo, String origem, String destino) {
        ArrayList<String> vertices = new ArrayList();
        
        Vertice vAtual = grafo.getVertice(origem);
                
        int custoTotal = 0;
        
        vertices.add(vAtual.getNome());
        
        while (!vAtual.getNome().equals(destino)){
            int custo = Integer.MAX_VALUE;
            int custoAresta = 0;
            ArrayList<Aresta> vizinhos;
        
            vizinhos = vAtual.getAdj();
        
            for (Aresta a : vizinhos){
                Vertice vLoop = grafo.getVertice(a.getDestino());
                int custoLoop = dist.getDistanciaTotal(Cast.convertToInt(vLoop.getNome()), 
                        Cast.convertToInt(destino));
                
                if (custoLoop < custo){
                    if (!vertices.contains(vLoop.getNome())){
                        custo = custoLoop;
                        vAtual = grafo.getVertice(a.getDestino());
                        custoAresta = a.getCusto();
                    }
                }
                
            }
            custoTotal += custoAresta;
            vertices.add(vAtual.getNome());
        }
        
        return new Caminho(vertices, custoTotal);
    }    
}
