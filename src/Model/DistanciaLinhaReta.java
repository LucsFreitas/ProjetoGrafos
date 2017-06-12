package Model;

public class DistanciaLinhaReta {
    private int distanciaEmLinhaReta[][];

    public DistanciaLinhaReta() {
        int mat[][] = 
        {
            {0, 982, 630, 1160, 1170, 1170, 1350, 900, 1750, 1350, 1890, 1890, 1035, 900},
            {982, 0, 1080, 1260, 1485, 1170, 1125, 826, 1125, 765, 1260, 1170, 694, 357},
            {630, 1080, 0, 1260, 1080, 1260, 1440, 1170, 2070, 1710, 2250, 2250, 1395, 1305},
            {1160, 1260, 1260, 0, 477, 900, 810, 1260, 1800, 1575, 2030, 2070, 1305, 1305},
            {1170, 1485, 1080, 477, 0, 513, 1755, 900, 1755, 1575, 2070, 2160, 1440, 1485},
            {1170, 1170, 1260, 900, 513, 0, 405, 855, 1350, 1170, 1638, 1755, 1125, 1170},
            {1350, 1125, 1440, 810, 1755, 405, 0, 630, 1753, 990, 1350, 1530, 970, 1080},
            {900, 826, 1170, 1260, 900, 855, 630, 0, 1305, 1193, 1260, 1350, 585, 630},
            {1750, 1125, 2070, 1800, 1755, 1350, 1753, 1305, 0, 630, 580, 540, 720, 900},
            {1350, 765, 1710, 1575, 1575, 1170, 990, 1193, 630, 0, 540, 999, 360, 540},
            {1890, 1260, 2250, 2030, 2070, 1638, 1350, 1260, 580, 540, 0, 400, 855, 990},
            {1890, 1170, 2250, 2070, 2160, 1755, 1530, 1350, 540, 999, 400, 0, 990, 945},
            {1035, 694, 1395, 1305, 1440, 1125, 970, 585, 720, 360, 855, 990, 0, 321},
            {900, 357, 1305, 1305, 1485, 1170, 1080, 630, 900, 540, 990, 945, 321, 0}
        };
        
        distanciaEmLinhaReta = mat;
    }
    
    private int convertToInt(String str){
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
    
    private int getDistanciaTotal (String origem, String destino){
        int verticeOrigem = convertToInt(origem);
        int verticeDestino = convertToInt(destino);
        
        return distanciaEmLinhaReta[verticeOrigem][verticeDestino];
    }
}
