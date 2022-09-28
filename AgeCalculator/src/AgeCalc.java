import java.time.LocalDate;
import java.time.Period;

public class AgeCalc {
    public static void main(String[] args) throws Exception {

        // Current Date
        LocalDate today = LocalDate.now();  

        // atribute with our birthday
        LocalDate birthDate = LocalDate.of(1997, 8, 5);

        // get years between birthday and today
        int years = Period.between(birthDate, today).getYears();

        // print atributes
        System.out.println("Today's date: "+ today);
        System.out.println("Birthday: "+ birthDate);
        System.out.println("Years between: "+ years);

        
    }
}
