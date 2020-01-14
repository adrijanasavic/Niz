package zadatak1;

public class Zadatak1 {
    enum SEMAFOR {CRVENO, ZUTO_CRVENO, ZELENO, ZUTO_ZELENO}

    public static void main(String[] args) {
        {
            SEMAFOR s = SEMAFOR.ZELENO;
            switch (s) {
                case CRVENO:
                    s = SEMAFOR.ZUTO_CRVENO;
                    break;
                case ZUTO_CRVENO:
                    s = SEMAFOR.ZELENO;
                    break;
                case ZELENO:
                    s = SEMAFOR.ZUTO_ZELENO;
                    break;
                default:
                    s = SEMAFOR.CRVENO;
            }
            System.out.println("s = " + s);

        }

        {
            SEMAFOR s = SEMAFOR.CRVENO;
            if (s == SEMAFOR.CRVENO)
                s = SEMAFOR.ZUTO_CRVENO;
            else if (s == SEMAFOR.ZUTO_CRVENO)
                s = SEMAFOR.ZELENO;
            else if (s == SEMAFOR.ZELENO)
                s = SEMAFOR.ZUTO_ZELENO;
            else
                s = SEMAFOR.CRVENO;
            System.out.println("s = " + s);
        }
    }
}
