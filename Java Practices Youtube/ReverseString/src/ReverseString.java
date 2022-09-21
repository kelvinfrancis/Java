public class ReverseString {
    public static void main(String[] args) {
    
        String r = reverse("kelviN");
        System.out.println(r);
    }

    public static String reverse(String s){
        char[] letters = new char[s.length()]; // arreglo que recibira las letras 
        
        int lettlerIndex = 0;
        for(int i = s.length() - 1; i >= 0; i--){
           letters[lettlerIndex] = s.charAt(i);
           lettlerIndex++;
        }
        String reverseString = ""; // variable que devolvera el strgin reverso.
        for(int i = 0; i < s.length(); i++){
            reverseString = reverseString + letters[i];
        }

        return reverseString;
    }
}
