import java.util.Scanner;

public class DescobrirSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome");
        String nome = scanner.next();
        System.out.println("Senha");
        String senha = scanner.next();

        System.out.println(senhaForte(senha));
    }
    public static boolean senhaForte(String senha) {
        if (senha.length() < 6) {
            int sum = 6 - senha.length();
            System.out.println(sum);
        }


        boolean Numero = false;
        boolean Maiuscula = false;
        boolean Minuscula = false;
        boolean Simbolo = false;
        for (char c : senha.toCharArray()) {
            if (c >= '0' && c <= '9') {
                Numero = true;
            } else if (c >= 'A' && c <= 'Z') {
                Maiuscula = true;
            } else if (c >= 'a' && c <= 'z') {
                Minuscula = true;
            } else {
                Simbolo = true;
            }
        }
        return Numero && Maiuscula && Minuscula && Simbolo ;
    }
}
