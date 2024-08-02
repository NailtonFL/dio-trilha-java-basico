/**
 * Numero	Inteiro	1021

 * Agencia	Texto	067-8

 * Nome Cliente	Texto	MARIO ANDRADE

 * Saldo	Decimal	237.48
*/


import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuario e obter os valores pelo scanner.

        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência com dígito: ");
        String agencia = scanner.next();

        // Consumir a nova linha deixada pelo nextInt/next
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();


        //Exibir a mensagem da conta criada

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");


        scanner.close();
    }

}
