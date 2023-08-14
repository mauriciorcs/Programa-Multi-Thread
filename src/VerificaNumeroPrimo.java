import java.util.ArrayList;
import java.util.Scanner;

public class VerificaNumeroPrimo {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        System.out.println("O número é primo ? ou não ?");
        System.out.println();
        System.out.println("Digite a quantidade de números que você deseja saber: ");
        int quant = Integer.parseInt(leitor.nextLine());
        for (int i = 0; i < quant; i++) {
            System.out.println("Digite o número: ");
            Integer numeros = Integer.parseInt(leitor.nextLine());
            lista.add(numeros);
        }
        for (Integer numero : lista) {
            Thread thread = new Thread(new Threads(numero));
            thread.start();
        }
    }
}




