package principal;

public class NumerosAmigos {
    public static void NumerosAmigo(int a, int b){

        int acuma=0;
        int acumab=0;


            for(int i=1; i <a ; i++){

                if(a%i==0){

                acuma= acuma+i;
            }
        }

        for(int i=1; i <b ; i++){

            if(b%i==0){

                acumab= acumab+i;
            }
        }

        if(acuma==b && acumab==a){

            System.out.println("Ambos números son amigos");
        }else{

            System.out.println("No son amigos");
        }




    }


}
