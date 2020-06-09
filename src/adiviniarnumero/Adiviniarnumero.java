package adiviniarnumero;

import java.util.Scanner;

public class Adiviniarnumero {

    public static void main(String[] args) {

        //CON NÚMERO RAMDON
        Scanner teclado = new Scanner(System.in);
        int numAle = (int) ((Math.random() * 50) + 1); //casting a int porque RAMDON es double
        int numUsu; //número introducido por usuario
        int i; //contador del bucle
        System.out.println("Vamos a adivinar un número entre 1 entre 50");
  
        for (i = 0; i <= numAle; i++) {
            System.out.println("Introduce un número del 1 al 50");
             numUsu = teclado.nextInt();
            if (numAle == numUsu) {
                System.out.println("¡Has acertado!");
                break; //¿cómo puedo hacerlo sin break?
            } else if (numAle != numUsu) {
                if (numAle > numUsu) {
                    System.out.println("El número a adivinar es MAYOR que " + numUsu);
                } else if (numAle < numUsu) {
                    System.out.println("El número a adivinar es MENOR que " + numUsu);
                }
            }
        }
 /*---------------------------------------------------------------------------------------*/
        
        //ESTABLECIENDO YO EL NÚMERO A ADIVINAR
        /*Scanner teclado = new Scanner(System.in);
        int numAleYo = 0;
        int numUsu;
        int i;
        numAleYo = teclado.nextInt();
        System.out.println("Vamos a adivinar un número entre 1 entre 50");

        for (i = 0; i <= numAleYo; i++) {
            System.out.println("Introduce un número del 1 al 50");
            numUsu = teclado.nextInt();
            if (numAleYo == numUsu) {
                System.out.println("¡Has acertado!");
                break; //¿cómo puedo hacerlo sin break?
            } else if (numAleYo != numUsu) {
                if (numAleYo > numUsu) {
                    System.out.println("El número a adivinar es MAYOR que " + numUsu);
                } else if (numAleYo < numUsu) {
                    System.out.println("El número a adivinar es MENOR que " + numUsu);
                }
            }
        }*/
    }
}
