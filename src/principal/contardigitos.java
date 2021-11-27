package principal;

public class contardigitos {

    public static void ContarDigitosNumero(int a){

        int acumulador=0;

       while(a!=0){

           a=a/10;
           acumulador++;
       }

        System.out.println("Tiene " + acumulador + " digitos");


    }
}
