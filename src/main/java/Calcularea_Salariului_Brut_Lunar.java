import java.util.Scanner;

public class Calcularea_Salariului_Brut_Lunar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti numele angajatului: ");
        String NumeAngajat = scanner.nextLine();

        System.out.println("introduceti numarul de ore lucrate pe luna: ");
        int OreLucratePeLuna = scanner.nextInt();

        System.out.println("Introduceti rata orara: ");
        double RataOrara = scanner.nextDouble();

        double SalariulBrut = OreLucratePeLuna * RataOrara;

        System.out.println("Salariul lunar brut al angajatului " + NumeAngajat + " " +  "este: " + SalariulBrut );

    }
}
