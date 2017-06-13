package Base;

public abstract class Cast {
    public static String convertToString(int i){
        if (i == 0)
            return "ilha do retiro";
        else if (i == 1)
            return "hospital ilha do leite";
        else if (i == 2)
            return "faculdade nova roma";
        else if (i == 3)
            return "estacao afogados";
        else if (i == 4)
            return "estacao largo da paz";
        else if (i == 5)
            return "7 DSUP";
        else if (i == 6)
            return "cabanga";
        else if (i == 7)
            return "estacao joana bezerra";
        else if (i == 8)
            return "forte das cinco pontas";
        else if (i == 9)
            return "estacao recife";
        else if (i == 10)
            return "mercado sao jose";
        else if (i == 11)
            return "praca da independencia";
        else if (i == 12)
            return "IMIP";
        else
            return "hospital hapvida";                
    }
    
    public static int convertToInt(String str){
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
}
