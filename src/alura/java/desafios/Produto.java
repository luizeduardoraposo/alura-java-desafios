package alura.java.desafios;

public class Produto {

    String nome;
    double price;
    double descontoParaPix;
    double totalPrice;

    double pegaPrecoFinal(boolean pagamentoViaPix) {
        if (pagamentoViaPix == true) {
             return totalPrice = price - descontoParaPix;
        } else {
            return totalPrice = price;
        }
    }

}


