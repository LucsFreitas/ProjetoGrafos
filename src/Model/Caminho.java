package Model;

import java.util.ArrayList;

public class Caminho {
    public int custoTotal;
    public ArrayList<VerticeCaminho> caminho;

    public Caminho() {
        custoTotal = Integer.MAX_VALUE;
        caminho =  new ArrayList<VerticeCaminho>();
    }      
}
