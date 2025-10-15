package REINO_LEJANO;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mago cecilion = new Mago ("Cecilion", "Mago", "Bats Feast", "Bat Impact", "Sanguine Claws", "Phantom Count");
        Combatiente phoveus = new Combatiente("Phoveus", "Combatiente", "Infernal Pursuit", "Demonic Impact", "Dark Wave", "Matrix Marauder");

        System.out.println("Seleccione el Personaje: " + "\n" + 
                           "1) Cecilion" + "\n" +
                           "2) Phoveus");
        int decisionPersonaje = scanner.nextInt();

        switch (decisionPersonaje) {
            case 1:
                boolean continuar = true;

                while (continuar) {
                    System.out.println("Desea ver: " + "\n" +
                                   "1) Información del Personaje" + "\n" +
                                   "2) Primer Habilidad " + "\n" +
                                   "3) Segunda Habilidad " + "\n" +
                                   "4) Ulti " + "\n" +
                                   "5) Salir");
                int decisionAccion = scanner.nextInt();

                switch (decisionAccion) {
                    case 1:
                        cecilion.mostrarInfo();
                        break;
                    case 2:
                        cecilion.usarPrimerHabilidad();
                        break;
                    case 3:
                        cecilion.usarSegundaHabilidad();
                        break;
                    case 4:
                        cecilion.usarUlti();
                        break;
                    case 5:
                        continuar = false;
                        break;
                    default:
                        break;
                }
                }
                break;

            case 2: 
                boolean continuar1 = true;

                while (continuar1) {
                    System.out.println("Desea ver: " + "\n" +
                                   "1) Información del Personaje" + "\n" +
                                   "2) Primer Habilidad " + "\n" +
                                   "3) Segunda Habilidad " + "\n" +
                                   "4) Ulti " + "\n" +
                                   "5) Salir");
                int decisionAccion2 = scanner.nextInt();

                switch (decisionAccion2) {
                    case 1:
                        phoveus.mostrarInfo();
                        break;
                    case 2:
                        phoveus.usarPrimerHabilidad();
                        break;
                    case 3:
                        phoveus.usarSegundaHabilidad();
                        break;
                    case 4:
                        phoveus.usarUlti();
                        break;
                    case 5:
                    continuar = false;
                        break;
                    default:
                        break;
                }
                }
            default:
                break;
        }

        scanner.close();
    }
}
