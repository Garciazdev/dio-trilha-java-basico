import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
            int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !: ");
            String agencia = scanner.next();
            
        System.out.println("Digite seu nome: ");
            String nome = scanner.next();
        
        System.out.println("Digite seu Saldo");
            double saldo = scanner.nextDouble();
        
            String mensagem = String.format("Olá %s , obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d seu saldo %.2f já está disponível para saque",nome,agencia,numero,saldo);
            System.out.println(mensagem);
    }
}
