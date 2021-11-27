package principal;


public class multiplo5 {

        public static void multi(int num){

            if(num % 4 == 0 && num % 100 !=0 && num % 400 !=0){
                System.out.println("Es bisiesto");

            }else{

                System.out.println("no es bisiesto");
            }



    }
}
