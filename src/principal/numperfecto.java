package principal;

public class numperfecto {

    public static void numeroperfecto(int num){

        int acum=0;

        for(int i=1; i <= num ;i++){

            if( num%i==0 ){

                acum = acum +i;

            }

        }
        System.out.println(acum);



    }
}
