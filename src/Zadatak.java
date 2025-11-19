import java.util.Scanner;

public class Zadatak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int broj = 0;
        boolean tocno = false;

        while (!tocno) {
            System.out.println("Molimo unesite broj za koji želite izračunati faktorijel: ");
            String unos = scanner.nextLine();


        try {
            broj = Integer.parseInt(unos);
            System.out.println("Vaš broj je: " + broj);

            if (broj < 0) {
                System.out.println("Ne može biti negativan broj! Pokušajte ponovno.\n");
            } else {
                tocno = true;
            }


        } catch (NumberFormatException e) {
            System.out.println("Unijeli ste pogrešan unos!" + e.getMessage());
            System.out.println("Molimo pokušajte ponovno!");
            tocno = true;

        }
        catch (Exception e) {
            System.out.println("Došlo je do neočekivane greške: " + e.getMessage());
            System.out.println("Molimo pokušajte ponovno!\n");
            tocno = true;
        }
        }

        int fakt = 1;
        for (int i = 1; i <= broj; i++) {
            fakt *= i;
        }
        System.out.println("Faktorijel broja " + broj + " je: " + fakt);

    }
}



