package Base;

import Algoritmos.Dijkstra;
import Model.Caminho;
import Model.Grafo;
import java.util.ArrayList;
import java.util.Scanner;

public class EscolhaAlgoritmo {
    public Grafo gOrientado;
    public Grafo gNaoOrientado;

    public EscolhaAlgoritmo() {
        gNaoOrientado = new Grafo ("nao orientado");
        gOrientado = new Grafo("orientado");
    }
    
    public void escolherAlgoritmo(String origem, String destino){
        Dijkstra dijkstra = new Dijkstra();
        
        int opcao;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\tAlgoritmos:");
        System.out.println("1 - Dijkstra");
        
        do{
            System.out.print("\nDigite a opção desejada: ");
            opcao = scan.nextInt();
            if (opcao < 1 && opcao > 1)
                System.out.println("Opção invalida");
        } while(opcao < 1 && opcao > 1);
        
        Caminho caminhoOrientado;
        Caminho caminhoNaoOrientado;
        if (opcao == 1){
            caminhoNaoOrientado = dijkstra.buscar(gNaoOrientado, origem, destino);
            caminhoOrientado = dijkstra.buscar(gOrientado, origem, destino);
            
            exibirCaminho(caminhoOrientado, caminhoNaoOrientado, "do Algoritmo de Dijkstra");
        }
    }
    
    private void exibirCaminho (Caminho caminhoOrientado, 
            Caminho caminhoNaoOrientado, String busca){
        
        System.out.println("\n\nResultado " + busca + ":");
        
        System.out.println("\tGrafo Não Orientado");
        
        ArrayList<String> vertices = caminhoNaoOrientado.getVertices();
        int cont = vertices.size() - 1;
        
        for(String str : vertices){
            System.out.print(str);
            
            if(cont > 0)
                System.out.print(" -> ");
            
            cont--;
        }
        System.out.println("\nDistancia total ~> " + caminhoNaoOrientado.getCusto());
        
        System.out.println("\n\n\tGrafo Orientado");
        
        vertices = caminhoOrientado.getVertices();
        cont = vertices.size() - 1;
        
        for(String str : vertices){
            System.out.print(str);
            
            if(cont > 0)
                System.out.print(" -> ");
            
            cont--;
        }
        System.out.println("\nDistancia total ~> " + caminhoOrientado.getCusto() + "\n\n");
    }
    
}
