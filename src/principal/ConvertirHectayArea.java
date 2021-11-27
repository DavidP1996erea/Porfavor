package principal;

public class ConvertirHectayArea {

    public static void ConvertidorAMetros(int hecta, int area){

        int metroshecta=0;
        int areametro=0;

        metroshecta=hecta*10000;
        areametro=area*100;

        System.out.println("Los metros cuadarados de las hectareas son " + metroshecta + "\n" + "Las metros del area son " + areametro);


    }
}
