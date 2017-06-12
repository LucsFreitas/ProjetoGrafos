package Base;

import Model.Caminho;
import Model.Grafo;

public interface InterfaceBusca {
    public Caminho buscar(Grafo grafo, String origem, String destino);
}
