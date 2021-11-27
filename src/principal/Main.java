package principal;

import java.util.Scanner;

import static principal.digitio0y9.DIGITO;
import static principal.multiplo5.multi;
import static principal.espanita.caracterespanol;


import static principal.numperfecto.numeroperfecto;


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


    /*
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

    */
        /*
---------------------------------------------------------------------------------------------------------------
 */
    /*
        char caracter;
        char opc;

        System.out.println("¿Quieres introducir un caracter?");
        opc=sc.next().charAt(0);


        while(opc=='S' || opc=='s') {
            System.out.println("Introduzca el caracter");
            caracter = sc.next().charAt(0);

            caracterespanol(caracter);


            System.out.println("¿Quieres volver a  introducir un caracter?");
            opc = sc.next().charAt(0);

        }
        */

       /*
------------------------------------------------------------------------------------------------------------------
 */
        /*

        int numero;
        char opc;
        System.out.println("¿Quieres introducir un numero?");
        opc=sc.next().charAt(0);

        while(opc=='S' || opc=='s') {
            System.out.println("Introduzca el numero");
            numero = sc.nextInt();

            numeroperfecto(numero);

            System.out.println("¿Quieres volver a  introducir un numero?");
            opc = sc.next().charAt(0);

        }

*/
           /*
------------------------------------------------------------------------------------------------------------------
 */

        /*
            -Funcion o procedimiento -> Solo que haga una cosa
                                        Breves y concisas (3-10 lineas)
                                        Nombre significativo y autodescriptivo
                                        Debe tener ningún parámetro de entrada o pocos

         */
   /*
------------------------------------------------------------------------------------------------------------------
 */
 // Triangulo
        /*
    int altura=0;
    char caracter;
        System.out.println("Introduce la altura del triangulo");
        altura=sc.nextInt();
        System.out.println("Introduce un caracter");
        caracter=sc.next().charAt(0);

        for(int i =0; i < altura; i++ ){

            for( int j=i ; j < altura -1 ; j++) {
                System.out.print(" ");
            }
                for(int k=0 ; k <= i ;k++ ){
                    System.out.print(" " +caracter);

                }
                System.out.println();


        }

*/
   /*
------------------------------------------------------------------------------------------------------------------
 */
// mayus a minu
        /*
        char caracter;
        System.out.println("Introduce un caracter");
        caracter=sc.next().charAt(0);

        char minuscula=Character.toLowerCase(caracter);

        System.out.println(minuscula);

         */

           /*
------------------------------------------------------------------------------------------------------------------
 */
    int a=0;
    int b=0;

        System.out.println("Introduzca el primer numero");
        a=sc.nextInt();

        System.out.println("Introduzca el segundo numero");
        b=sc.nextInt();


    }
}
