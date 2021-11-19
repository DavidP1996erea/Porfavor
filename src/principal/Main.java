package principal;

import java.util.Scanner;

import static principal.multiplo5.multi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);


        System.out.println("¿Quieres añadir un año?");
        char opcion=sc.next().charAt(0);


        while(opcion=='S' || opcion=='s') {
            System.out.println("Introduzca el año");
            int ano = sc.nextInt();
            multi(ano);

            System.out.println("¿Quieres volver a introducir un año?");
             opcion=sc.next().charAt(0);

        }


    }
}
