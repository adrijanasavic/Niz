package zadatak3;

public class Zadatake3Verzija1 {
    public static void main(String[] args) {
        int a[][] = {{4, 6, 9, 4, 6}, {1, 3, 5, 8, 2}, {4, 2, 7, 8, 3}, {3, 6, 4, 2, 9}, {4, 2, 5, 6, 7}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%d ", a[i][j]);
                //  System.out.printf(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}





