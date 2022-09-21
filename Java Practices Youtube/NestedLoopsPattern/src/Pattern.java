import java.util.Scanner;

public class Pattern {
    
    public static void main(String[] args) {
        
        System.out.println("Hey!, how many stars would you like? ");
        Scanner input = new Scanner(System.in); // input for user
        int numOfStrars = input.nextInt(); // creamos una variable para almacenar la del user
        input.close(); // cerramos input

        for(int i = 1; i <= numOfStrars; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = numOfStrars - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
