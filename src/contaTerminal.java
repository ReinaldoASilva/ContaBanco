import java.util.Scanner;
import java.math.BigDecimal;
public class contaTerminal {
    public static void main(String[] args) {
        int numeroAgencia;
        int numeroConta;
        String nomeCliente;
        BigDecimal saldoConta;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor digite o numero da agencia:");
        numeroAgencia = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Por favor digite o numero do conta:");
        numeroConta = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Por favor, digite seu nome completo:");
        nomeCliente = entrada.nextLine();

        System.out.println("Por favor, digite o saldo inicial da conta:");
        saldoConta = entrada.nextBigDecimal();
        entrada.nextLine();
        entrada.close();

        String mensagemFinal= "ola " + nomeCliente +  " Obrigado por criar uma conta em nosso banco! \n"
                + "Sua agencia e: " + numeroAgencia + ", conta " + numeroConta + " e seu saldo "
                + saldoConta + " ja esta disponivel para saque";
        System.out.println(mensagemFinal);

    }
}