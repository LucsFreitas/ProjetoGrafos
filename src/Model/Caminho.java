package Model;

import java.util.ArrayList;

public class Caminho {
    public int custoTotal;
    public ArrayList<VerticeCaminho> caminho;

    public Caminho() {
        custoTotal = -1;
        caminho =  new ArrayList<VerticeCaminho>();
        
        caminho.add(new VerticeCaminho("ilha do retiro", "", -1, false));
        caminho.add(new VerticeCaminho("hospital ilha do leite", "", -1, false));
        caminho.add(new VerticeCaminho("faculdade nova roma", "", -1, false));
        caminho.add(new VerticeCaminho("estacao afogados", "", -1, false));
        caminho.add(new VerticeCaminho("estacao largo da paz", "", -1, false));
        caminho.add(new VerticeCaminho("7 DSUP", "", -1, false));
        caminho.add(new VerticeCaminho("cabanga", "", -1, false));
        caminho.add(new VerticeCaminho("estacao joana bezerra", "", -1, false));
        caminho.add(new VerticeCaminho("forte das cinco pontas", "", -1, false));
        caminho.add(new VerticeCaminho("estacao recife", "", -1, false));
        caminho.add(new VerticeCaminho("mercado sao jose", "", -1, false));
        caminho.add(new VerticeCaminho("praca da independencia", "", -1, false));
        caminho.add(new VerticeCaminho("IMIP", "", -1, false));
        caminho.add(new VerticeCaminho("hospital hapvida", "", -1, false));
    }
    
    
}
