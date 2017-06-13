package Model;

import java.util.ArrayList;

public class Caminho {
    public int custoTotal;
    public ArrayList<VerticeCaminho> caminho;

    public Caminho() {
        custoTotal = -1;
        caminho =  new ArrayList<VerticeCaminho>();
    }      
}
