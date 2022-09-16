/*clase LanzamientoMonedas 
Se requiere hacer un programa que simule el lanzamiento de una moneda N veces y realice el conteo
de cuantas veces cayo la cara o la cruz de la moneda. El programa debe mostrar en pantalla la cantidad de veces qeu ocurrio cada resultado y la probabilidad de obtener cada resultado.*/

import java.util.Scanner;
import java.text.DecimalFormat; //importamos esta libreria para crear nuestro formato decimal
import java.util.Random;

class LanzamientoMonedas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---- Cara o Cruz ----");
        System.out.print("Ingrese la cantidad de lanzamientos de la moneda: ");
        int intento = input.nextInt();
        input.close();
        
        System.out.println(lanzamiento(intento));
    }
    
    public static String lanzamiento(int intento){
        float cara = 0;
        float cruz = 0;

        Random aletorio = new Random();
        for(int i = 0; i < intento; i++){
            int moneda = aletorio.nextInt(2);
            if(moneda == 0){
                cara += 1;
            }else{
                cruz += 1;
            }
         }
        // Creamos un formato de .00 dos decimales despues del punto.
        DecimalFormat df = new DecimalFormat("###.##"); 

        // Variables de las probabilidades de cara o cruz
        double caraProbab = (cara/intento) * 100;
        double cruzProbab = (cruz/intento) * 100;

        System.out.println("La probabilidad de que salga Cara es: "+ df.format(caraProbab) +"%, y la de Cruz es: " + df.format(cruzProbab) +"%.");

        return "Cara salio " + cara + " veces, y Cruz salio " + cruz + " veces.";
    }
}
