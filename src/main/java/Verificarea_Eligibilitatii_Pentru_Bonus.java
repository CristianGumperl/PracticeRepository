import java.util.Scanner;

public class Verificarea_Eligibilitatii_Pentru_Bonus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti numele angajatului: ");
        String NumeAngajat = scanner.nextLine();

        System.out.println("Introduceti numarul de proiecte finalizate intr-o luna: ");
        int NumarProiecteFinalizate = scanner.nextInt();

        if(NumarProiecteFinalizate > 5 ){
            System.out.println("Felicitari! Ai primit un bonus!");
        } else {
            System.out.println("Imi pare rau! Nu ai reusit sa atingi targetul pentru bonus");
        }
    }
}
