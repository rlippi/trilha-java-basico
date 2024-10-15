
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //int numero;
        String numero;
        String agencia, nomeCliente;
        double saldo = 0.0;  

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        agencia = sc.next();
        
        System.out.println("Digite o número da Conta: ");
        numero = sc.next();
        //numero = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("Digite o Nome do Cliente: ");
        nomeCliente = sc.nextLine();

        System.out.println("Digite o Saldo Inicial: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        sc.close();

    }
}