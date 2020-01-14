package zadatak2;

public class Zadatak2Verzija2 {
    public static void main(String[] args) {
        int n = 5;
        long suma = 1;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                suma *= i;
            }
        }
        System.out.println("Suma mnozenja neparnih brojeva je " + suma + ".");
    }

}
