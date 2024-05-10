import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        int accountNumber;
        String bankBranch;
        String name;
        double balance;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta!");
        accountNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o número da Agência!");
        bankBranch = scanner.nextLine();
        System.out.println("Por favor, digite o seu nome!");
        name = scanner.nextLine();
        System.out.println("Por favor, digite o seu saldo!");
        balance = scanner.nextDouble();

        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + bankBranch + ", conta " + accountNumber + " e seu saldo " + balance + " já está disponível para saque");
    }
}