import java.util.Scanner;

public class EscadaN {
    public static void main(String args[]){
        System.out.println("Escolha um tamanho para sua escada 1 a 6");
        Scanner scan = new Scanner(System.in);
        int tamanhoEscada = scan.nextInt();

        switch (tamanhoEscada)
        {
            case 1:
                System.out.println("*");
                break;
            case 2:
                System.out.println(" *" + "\n" +
                        "**");
                break;
            case 3:
                System.out.println("  *" + "\n" +
                        " **" + "\n" +
                        "***");
                break;
            case 4:
                System.out.println("   *" + "\n" +
                        "  **" + "\n" +
                        " ***" + "\n" +
                        "****");
                break;
            case 5:
                System.out.println("    *" + "\n" +
                        "   **" + "\n" +
                        "  ***" + "\n" +
                        " ****" + "\n" +
                        "*****");
                break;
            case 6:
                System.out.println("     *" + "\n" +
                        "    **" + "\n" +
                        "   ***" + "\n" +
                        "  ****" + "\n" +
                        " *****" + "\n" +
                        "******");
                break;
            default:
                System.out.println("Tamanho não encontrado");
                break;

        }
    }
}
