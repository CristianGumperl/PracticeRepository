import java.util.Scanner;

public class Calcularea_bonusului {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti scorul de performanta: ");
        double ScorPerformanta = scanner.nextDouble();

        int ScorRotunjit = (int) Math.round(ScorPerformanta);
        if(ScorPerformanta > 4){
            System.out.println("Felicitari ai primit un bonus");
        } else {
            System.out.println("Imi pare rau! Nu esti eligibil pentru bonus");
        }
    }
}
