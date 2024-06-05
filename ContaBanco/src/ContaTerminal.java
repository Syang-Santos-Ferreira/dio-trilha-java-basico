import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("---------------Conta Bancária---------------");
        System.out.println();
        System.out.println("Por favor, digite o número da conta: (ex: 1111)");
        numero = sc.nextInt();

        System.out.println("Agora, digite o número da agência: (ex: 067-8)");
        agencia = sc.next();

        System.out.println("Me informe o seu nome completo: (ex: Maria Ferreira)");
        nomeCliente = sc.next();
        sc.nextLine();

        System.out.println("Por fim, insira o seu saldo atual: (ex: 525,75)");
        saldo = sc.nextDouble();

        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta em "
                + "nosso banco, sua agência é %s, "
                + "conta %d e seu saldo %.2f já está disponível"
                + " para saque.", nomeCliente, agencia, numero, saldo);

        sc.close();
    }

}