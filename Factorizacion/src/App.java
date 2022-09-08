import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("---- Factorizar un numero entero ----");
    
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int n = read.nextInt();
        read.close(); // cerramos el read para que no ocupe mas espacio

        Factorizar caso1 = new Factorizar();
        System.out.println("Su factor es: " + caso1.Factorizador(n));
        /*Pasamos el valor de la variable ingresada por teclado a la clase
        Factorizar, y lo insertamos en un System.out.println para que 
        imprima en pantalla el return de la funcion Factorizador de la 
        clase Factorizar.
         */
    }
}
