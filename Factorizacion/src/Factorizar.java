public class Factorizar{
    public int Factorizador(int n){
        int i = 1;
        int result = n;
        while(i < n){
            result = result * i;
            i++;
        }
        return result;
    }
}