import java.util.Scanner;

public class SumarLetras {
/*Tarea: Realizar una function que ingrese dos string como parametros, cuente las letras de cada string, 
las sume y devuelva un numero entero */
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        System.out.println("---- Sumar el total de letras de 2 palabras ingresadas ----");
        System.out.print("Ingrese la primera palabra: ");
        String palabra1 = read.nextLine();
        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = read.nextLine();
        read.close();

        System.out.println(Sumar(palabra1,palabra2));
    }


    public static int Sumar(String a, String b){
        int num1 = (int)a.length();
        int num2 = (int)b.length();

        int result = num1 + num2;

        return result;
    }
}
