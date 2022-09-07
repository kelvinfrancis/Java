import java.lang.Math;
import java.util.Scanner;

public class CalcularIMC {
    public static void main(String[] args) throws Exception {
    
        float weight;
        float height;
        // Ingresar variables por teclado
        try (Scanner read = new Scanner(System.in)) {
            System.out.print("---- Calcula tu indice de masas corporta ----");
            System.out.print("Ingresa tu estatura en metros: ");
            height = read.nextFloat();
            System.out.print("Ingresa tu peso en kilogramos: ");
            weight = read.nextFloat();
        }
        // Calculate IMC
        double imc = weight/(Math.pow(height,2));
        int imcRound = (int) imc;

        System.out.println("Su indice de masa corporal es: " + imcRound);

            if(imc <= 16){
                System.out.println("Delgadez severa");
        
            } else if(16 < imcRound && imcRound <= 17){
                System.out.println("Delgadez moderada");

            } else if(17 < imcRound && imcRound <= 18.5){
                System.out.println("Delgadez leve");

            } else if(18.5 < imcRound && imcRound <= 25){
                System.out.println("Peso normal");

            } else if(25 < imcRound && imcRound <= 30){
                System.out.println("Sobrepeso");

            } else if(30 < imcRound && imcRound <= 35){
                System.out.println("Obesidad leve");

            } else if(35 < imcRound && imcRound <= 40){
                System.out.println("Obesidad moderada");
            } else { // mayor o igual a 40
                System.out.println("Obesidad mórbida");
            }
        
        }
    }
