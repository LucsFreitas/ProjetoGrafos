package Model;

import java.util.ArrayList;

public class CaminhoComplexo {
    public int custoTotal;
    public ArrayList<VerticeCaminhoComplexo> caminho;

    public CaminhoComplexo() {
        custoTotal = Integer.MAX_VALUE;
        caminho =  new ArrayList<VerticeCaminhoComplexo>();
    }
    
    
}
