package principal;

public class NumeroPerfecto {

    public static  void NumeroPerfecto (int num){



        double prim=Math.pow(2,num-1);

        double combi=Math.pow(2,num) -1;

        double resultado= prim*combi;


        if(resultado==num){

            System.out.println("Es perfecto");
        }else{

            System.out.println("No es perfecto");
        }









    }



}
