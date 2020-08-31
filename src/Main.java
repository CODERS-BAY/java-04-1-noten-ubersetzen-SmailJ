import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int grade;

        System.out.println("Gib eine Note zwischen 1 & 5 ein");
        grade = sc.nextInt();

        if (grade >= 1 && grade <= 5) {
            switch (grade) {
                case 1:
                    System.out.println("Sehr gut");
                    break;
                case 2:
                    System.out.println("Gut");
                    break;
                case 3:
                    System.out.println("Befriedigend");
                    break;
                case 4:
                    System.out.println("Genügend");
                    break;
                case 5:
                    System.out.println("Nicht Genügend");
                    break;
            }
        } else {
            System.out.println("Keine gültige Zahl");
        }

        // ODER SO
        switch (grade) {
            case 1:
                System.out.println("Sehr gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            case 3:
                System.out.println("Befriedigend");
                break;
            case 4:
                System.out.println("Genügend");
                break;
            case 5:
                System.out.println("Nicht Genügend");
                break;
            default:
                System.out.println("ERROR");
        }

        //Neue Java14 Schreibweise
        switch (grade) {
            case 1 -> System.out.println("Sehr gut");
            case 2 -> System.out.println("Gut");

            case 3 -> System.out.println("Befriedigend");

            case 4 -> System.out.println("Genügend");

            case 5 -> System.out.println("Nicht Genügend");

            default ->System.out.println("ERROR");
        }

    }

}
