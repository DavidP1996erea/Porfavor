package principal;

public class numperfecto {

    public static void numeroperfecto(int num){

        int acum=0;

        for(int i=1; i < num ; i++){

            if( num%i==0 ){
                acum = acum +i;
            }
        }
        if(num==acum){

            System.out.println("Es perfecto");
        }else{
            System.out.println("No es perfecto");
        }



    }
}
