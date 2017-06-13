package Algoritmos;

import Base.Cast;
import Base.InterfaceBusca;
import Model.Aresta;
import Model.Caminho;
import Model.CaminhoComplexo;
import Model.Grafo;
import Model.Vertice;
import Model.VerticeCaminhoComplexo;
import java.util.ArrayList;

public class Dijkstra implements InterfaceBusca{
    private CaminhoComplexo c = new CaminhoComplexo();

    @Override
    public Caminho buscar(Grafo grafo, String origem, String destino) {
        c = criarCaminho();
        Vertice inicial = grafo.getVertice(origem);
        
        VerticeCaminhoComplexo vAtual;
        
        int indexAtual = convertToInt(inicial.getNome());
        
        // insere dados para o vértice inicial
        vAtual = c.caminho.get(indexAtual);
        vAtual.setAnterior(null);
        vAtual.setCustoAcumulado(0);
        c.caminho.set(indexAtual, vAtual);
        
        if(!origem.equals(destino)){
             while (!completou()){
             vAtual.setVisitado(true);
             c.caminho.set(indexAtual, vAtual);
                        
             Vertice auxiliar = grafo.getVertice(convertToString(indexAtual));
                ArrayList<Aresta> vizinhosAtual = auxiliar.getAdj();
            
                for (Aresta a : vizinhosAtual){
                    String dest = a.getDestino();
                    int custo = vAtual.getCustoAcumulado() + a.getCusto();
                
                    int x = convertToInt(dest);
                    VerticeCaminhoComplexo vLoop = c.caminho.get(x);
                
                    if (vLoop.isVisitado() == false){
                        if (vLoop.getCustoAcumulado() > custo){
                            vLoop.setCustoAcumulado(custo);
                            vLoop.setAnterior(vAtual.getNome());
                            c.caminho.set(convertToInt(dest), vLoop);
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
        
        vAtual = c.caminho.get(convertToInt(destino));
        int custoTotal = vAtual.getCustoAcumulado();
        ArrayList<String> nomes = new ArrayList();
        
        while (vAtual != null){            
            nomes.add(0, vAtual.getNome());
            
            if(vAtual.getAnterior() != null)
                vAtual = c.caminho.get(convertToInt(vAtual.getAnterior()));
            else
                break;
        }
        
        Caminho caminho = new Caminho(nomes, custoTotal);
        return caminho;
    }
    
    private CaminhoComplexo criarCaminho(){
        c = new CaminhoComplexo();
        
        c.caminho.add(new VerticeCaminhoComplexo("ilha do retiro", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoComplexo("hospital ilha do leite", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoComplexo("faculdade nova roma", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoComplexo("estacao afogados", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoComplexo("estacao largo da paz", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoComplexo("7 DSUP", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoComplexo("cabanga", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoComplexo("estacao joana bezerra", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoComplexo("forte das cinco pontas", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoComplexo("estacao recife", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoComplexo("mercado sao jose", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoComplexo("praca da independencia", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoComplexo("IMIP", "", Integer.MAX_VALUE, false));
        c.caminho.add(new VerticeCaminhoComplexo("hospital hapvida", "", Integer.MAX_VALUE, false));
        
        return c;
    }
    
    private boolean completou(){
        for (VerticeCaminhoComplexo v : c.caminho){
            if (v.isVisitado() == false)
                return  false;
        }
        
        return true;
    }
    
    private int getMenorCusto(){
        int i = -1;
        int cont = 0;
        int custoMin = Integer.MAX_VALUE;
        
        for (VerticeCaminhoComplexo vert : c.caminho){
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
    
    public static int convertToInt(String str){
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
    
    public static String convertToString(int i){
        if (i == 0)
            return "ilha do retiro";
        else if (i == 1)
            return "hospital ilha do leite";
        else if (i == 2)
            return "faculdade nova roma";
        else if (i == 3)
            return "estacao afogados";
        else if (i == 4)
            return "estacao largo da paz";
        else if (i == 5)
            return "7 DSUP";
        else if (i == 6)
            return "cabanga";
        else if (i == 7)
            return "estacao joana bezerra";
        else if (i == 8)
            return "forte das cinco pontas";
        else if (i == 9)
            return "estacao recife";
        else if (i == 10)
            return "mercado sao jose";
        else if (i == 11)
            return "praca da independencia";
        else if (i == 12)
            return "IMIP";
        else
            return "hospital hapvida";                
    }
}
