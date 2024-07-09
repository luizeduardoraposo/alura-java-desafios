package alura.java.desafios;

import java.util.Scanner;

public class DesafioAlura003 {
    public static void main(){
        String nome = "Cliente Teste";
        String tipoConta = "Conta Corrente";
        double saldo = 7500;
        int opcao = 0;
        System.out.println("****************");
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("*****************");

        String menu = """
                Digite sua opção:
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);
        while(opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            } else if(opcao == 2) {
                System.out.println("Qual o valor deseja transferir? ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo " + saldo);
                }
            }else if(opcao ==3){
                    System.out.println("Valor recebido: ");
                    double valor = leitura.nextDouble();
                    saldo += valor;
                System.out.println("Novo saldo " + saldo);

            }
            else if(opcao != 4){
                System.out.println("Opcao Inválida ");
            }

        }

    }
}
