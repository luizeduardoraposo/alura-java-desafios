package alura.java.desafios;
import java.util.Scanner;

public class Loop {
    public static void main(){
    Scanner leitura = new Scanner(System.in);
    double mediaAvaliacao = 0;
    double nota;

    for (int i = 0; i < 3; i++) {
        System.out.println("Avaliação do filme?");
        nota = leitura.nextDouble();
        mediaAvaliacao += nota;
    }
    System.out.println("Media de avaliacoes para o filme é : " +mediaAvaliacao/3);
    }
}
