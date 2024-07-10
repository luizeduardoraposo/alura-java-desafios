package alura.java.outrosdesafios;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(275);
        System.out.println(conta.getSaldo());
    }
}