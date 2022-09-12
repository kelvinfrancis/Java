import java.util.Scanner;
/*Este programa indica si dos numeros ingresados por teclado son numeros amigos (es cuando los divisores de un numero, sin contarse el mismo, al sumarlos tan el otro numero y viseversa)*/
class NumerosAmigos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-- Verifica si dos numeros enteros positivos son amigos --");
        System.out.print("Ingresa el primer numero: ");
        int num1 = input.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int num2 = input.nextInt();
        int result2 = 0;
        int result1 = 0;
       for(int i = 1; i < num1; i++){
           if (num1 % i == 0){
               result1 = result1 + i;
           }
       }
       
        for(int k = 1; k < num2; k++){
           if (num2 % k == 0){
               result2 = result2 + k;
           }
        }
        
        if( result1 == num2 && result2 == num1){
            System.out.println("Los numeros " + num1 + " y " + num2 + " son numeros amigos.");
        }else{
            System.out.println("No son ni mierda.");
        }

    }
}
