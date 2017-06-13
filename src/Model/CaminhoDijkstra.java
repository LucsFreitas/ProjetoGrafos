package Model;

import java.util.ArrayList;

public class CaminhoDijkstra {
    public int custoTotal;
    public ArrayList<VerticeCaminhoDijkstra> caminho;

    public CaminhoDijkstra() {
        custoTotal = Integer.MAX_VALUE;
        caminho =  new ArrayList<VerticeCaminhoDijkstra>();
    }
    
    
}
