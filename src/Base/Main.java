package Base;

import Algoritmos.Dijkstra;
import Model.Caminho;
import Model.Grafo;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    //private EscolhaAlgoritmo algoritmo = new EscolhaAlgoritmo();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EscolhaAlgoritmo algoritmo = new EscolhaAlgoritmo();
        int op1, op2;
        String origem, destino;
        
        do{
            System.out.println("1 - Fazer busca");
            System.out.println("2 - Encerrar programa");
            
            do{
                System.out.print("Digite a opção desejada: ");
                op1 = scanner.nextInt();
                if (op1 != 1 && op1 != 2)
                    System.out.println("Opção invalida");
            } while (op1 != 1 && op1 != 2);
            
            if (op1 == 1){
                
                op2 = listarLocais(1) -1 ;                
                origem = Cast.convertToString (op2);
                
                op2 = listarLocais(2) -1;                
                destino = Cast.convertToString (op2);
                
                algoritmo.escolherAlgoritmo(origem, destino);
            }
        } while (op1 == 1);
    }
    
    private static int listarLocais(int tipo){
        Scanner scanner = new Scanner(System.in);
        int op;
        
        if (tipo == 1)
            System.out.println("\tLocal de Partida");
        else
            System.out.println("\tLocal de Destino");
        
        System.out.println("1 - Ilha do Retiro");
        System.out.println("2 - Hospital Ilha do Leite");
        System.out.println("3 - Faculdade Nova Roma");
        System.out.println("4 - Estação Afogados");
        System.out.println("5 - Estação Largo da Paz");
        System.out.println("6 - 7º DSUP");
        System.out.println("7 - Cabanga");
        System.out.println("8 - Estação Joana Bezerra");
        System.out.println("9 - Forte das Cinco Pontas");
        System.out.println("10 - Estação Recife");
        System.out.println("11 - Mercado São José");
        System.out.println("12 - Praça da Independência");
        System.out.println("13 - IMIP");
        System.out.println("14 - Hospital HapVida");
                
        do{
            System.out.print("\nDigite a opção desejada: ");
            op = scanner.nextInt();
            if (op < 1 && op > 14)
                System.out.println("Opção invalida");
        } while (op < 1 && op > 14);
        
        return op;
    }
    
    
}
