import java.util.Scanner;

public class NumeroPerfecto {
/*Se requiere desarrollar un programa que determine si un numero es nu
 numero perfecto. Un numero perfecto es aquel que es igual a la suma de
 sus divisores positivos.

 Por ejemplo, el #28 es un numero perfecto ya que sus divisores son:
 1,2,3,4,7 y 14, y la suma de estos es 28.

 Utilizar el bucle Do..while
 */
    public static void main(String[] args) throws Exception {
        System.out.println("---- Valide si su numero es perfecto.----");
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int num = input.nextInt();
        input.close();
        System.out.println(dividir(num)); 
    }

   
    public static String dividir(int n){
        int mod = 0;
        int i = 1;
        int suma = 0;
        do{
            mod = n % i;
            if (mod == 0){
                suma += i;
            }
            i++;
        }while(suma < n);

        if (suma == n){
            return "El numero " + n + " es perfecto.";

        }else{
            return "El numero " + n + " no es perfecto.";
        }
    }
}
