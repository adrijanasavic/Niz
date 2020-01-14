package zadatak2;

public class Zadatak2Verzija3 {
    public static void main(String[] args) {
        int n = 7;

        int[] niz = new int[n * 2 + 1];

        for (int i = -n, j = 0; i <= n; i++, j++)
            niz[j] = i;
        for (int el : niz)
            System.out.print(el + " ");
    }

}



