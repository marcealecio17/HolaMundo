
package prueba;

import java.util.Scanner;

       
public class PRUEBA {

    public static void main(String[] args) {
        System.out.println("Empezamos el programa");

        System.out.println ("Introduzca su nombre: ");

        String entradaTeclado = " ";

        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner

        entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner

        System.out.println ("Mucho gusto: \"" + entradaTeclado +"\"");
    }
    
}
