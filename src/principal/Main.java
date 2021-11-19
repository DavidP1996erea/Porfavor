package principal;

import java.util.Scanner;

import static principal.digitio0y9.DIGITO;
import static principal.multiplo5.multi;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);

        /*

        System.out.println("¿Quieres añadir un año?");
        char opcion=sc.next().charAt(0);


        while(opcion=='S' || opcion=='s') {
            System.out.println("Introduzca el año");
            int ano = sc.nextInt();
            multi(ano);

            System.out.println("¿Quieres volver a introducir un año?");
             opcion=sc.next().charAt(0);

        }
        */

/*
---------------------------------------------------------------------------------------------------------------
 */



        int digito=0;
        char opc;
        System.out.println("¿Quieres introducir un numero?");
        opc=sc.next().charAt(0);

        while(opc=='S' || opc=='s') {
            System.out.println("Introduzca el numero");
            digito = sc.nextInt();

            DIGITO(digito);

            System.out.println("¿Quieres volver a  introducir un numero?");
            opc = sc.next().charAt(0);

        }


        /*
---------------------------------------------------------------------------------------------------------------
 */







    }
}
