package alura.java.desafios;
import java.util.Scanner;

public class Leitura {
    public void main(){
        Scanner Leitura = new Scanner(System.in);
        System.out.println("Quais seus livros favoritos?");
        String filme = Leitura.nextLine();
        System.out.println(filme);
        System.out.println("Quais são os número naturais?");
        int Naturais = Leitura.nextInt();
        System.out.println(Naturais);
    }
}