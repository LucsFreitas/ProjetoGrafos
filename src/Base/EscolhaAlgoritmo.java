package Base;

import Algoritmos.A_Star;
import Algoritmos.Dijkstra;
import Algoritmos.Gulosa;
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
        Gulosa gulosa = new Gulosa();
        A_Star a_Star = new A_Star();
        
        int opcao;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\tAlgoritmos:");
        System.out.println("1 - Dijkstra");
        System.out.println("2 - Guloso");
        System.out.println("3 - A_Star");
        
        do{
            System.out.print("\nDigite a opção desejada: ");
            opcao = scan.nextInt();
            if (opcao < 1 && opcao > 3)
                System.out.println("Opção invalida");
        } while(opcao < 1 && opcao > 3);
        
        Caminho caminhoOrientado;
        Caminho caminhoNaoOrientado;
        if (opcao == 1){
            caminhoNaoOrientado = dijkstra.buscar(gNaoOrientado, origem, destino);
            caminhoOrientado = dijkstra.buscar(gOrientado, origem, destino);
            
            exibirCaminho(caminhoOrientado, caminhoNaoOrientado, "do Algoritmo de Dijkstra");
        }
        else if (opcao == 2){
            caminhoNaoOrientado = gulosa.buscar(gNaoOrientado, origem, destino);
            caminhoOrientado = gulosa.buscar(gOrientado, origem, destino);
            
            exibirCaminho(caminhoOrientado, caminhoNaoOrientado, "da Busca Gulosa");
        }
        else if (opcao == 3){
            caminhoNaoOrientado = a_Star.buscar(gNaoOrientado, origem, destino);
            caminhoOrientado = a_Star.buscar(gOrientado, origem, destino);
            
            exibirCaminho(caminhoOrientado, caminhoNaoOrientado, "da Busca A_Star");
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
