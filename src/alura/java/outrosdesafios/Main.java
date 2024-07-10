package alura.java.outrosdesafios;

public class Main {
    public static void main() {
        Conta conta = new Conta();

        conta.deposita(275);
        System.out.println(conta.getSaldo());

        conta.setAgencia(666);
        System.out.println(conta.getAgencia());

        conta.setNumero(777);
        System.out.println(conta.getNumero());

        conta.setSaldo(123);
        System.out.println(conta.getSaldo());

        conta.saca(23);
        System.out.println(conta.getSaldo());

    }
}