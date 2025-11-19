public class DjeljenjesNulom {

    public static void  main (String[] args) {
        int x = 9;
        int y = 0;

        try {
            int rezultat = x / y;
            System.out.println(rezultat);
        } catch (Throwable e) {
            System.err.println("Iznimka: " + e.getMessage());
        } finally {
            System.out.println("Kalkulacija gotova.");
        }
    }
}
