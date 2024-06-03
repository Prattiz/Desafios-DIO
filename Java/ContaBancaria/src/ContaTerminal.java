import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome:");
        String nome = scanner.nextLine();
        
        
        System.out.println("Por favor, digite o número da Agência:");
        String numeroAgencia = scanner.nextLine();


        System.out.println("Por favor, digite o seu saldo atual:");
        String saldo = scanner.nextLine();

        System.out.println(
            "Olá " + nome + ", obrigado por criar uma conta em nosso banco." +
            "Sua agência é " + numeroAgencia + ", conta " + 
            "Seu saldo " + saldo + " já está disponível para saque."
        );
        scanner.close();

    }
}
