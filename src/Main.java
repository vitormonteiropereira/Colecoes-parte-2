import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();
        int sexo;
        int x = 1;
        String nome;

        while (x == 1) {
            System.out.println("Digite o nome para adicionar a lista: ");
            nome = scanner.nextLine();

            System.out.println("Qual o sexo?");
            System.out.println("1 - Masculino");
            System.out.println("2 - Feminino");
            sexo = scanner.nextInt();

            while (sexo < 1 || sexo > 2) {
                System.out.println("Selecione uma opcao valida");
                System.out.println("1 - Masculino");
                System.out.println("2 - Feminino");
                sexo = scanner.nextInt();
            }
            
            scanner.nextLine();

            if (sexo == 1) {
                masculino.add(nome);
            } else {
                feminino.add(nome);
            }

            System.out.println("Deseja fazer mais adicao na lista?");
            System.out.println("1 - Sim");
            System.out.println("2 - Nao");
            x = scanner.nextInt();


            scanner.nextLine();
        }

        System.out.println("Os homens sao: ");
        for (String a : masculino) {
            System.out.println(a);
        }
        System.out.println("As mulheres sao: ");
        for (String b : feminino) {
            System.out.println(b);
        }

        scanner.close();
    }
}