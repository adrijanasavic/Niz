package zadatak3;

public class Zadatake3Verzija4 {
    public static void main(String[] args) {

        int a[][] = {{4, 6, 9, 4, 6}, {1, 3, 5, 8, 2}, {4, 2, 7, 8, 3}, {3, 6, 4, 2, 9}, {4, 2, 5, 6, 7}};
        int suma = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i < j) {
                    suma *= a[i][j];
                }
            }
        }
        System.out.println("Suma vrednosti iznad glavne dijagonale matrice je " + suma + ".");

        int a1[][] = {{4, 6, 9, 4, 6}, {1, 3, 5, 8, 2}, {4, 2, 7, 8, 3}, {3, 6, 4, 2, 9}, {4, 2, 5, 6, 7}};
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i < j) {
                    if (a[i][j] > max) {
                        max = a[i][j];
                    }
                }
            }
        }
        System.out.println("Maksimalan element iznad glavne dijagonale je " + max + ".");
    }

}