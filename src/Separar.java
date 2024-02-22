import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * @author guiol
 */
public class Separar {
    public static void main(String[] args) {
        sexos();
    }

    public static void sexos() {

        List<String> masculino = new ArrayList<String>();
        List<String> feminino = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        String nome, sexo;

        while (true) {
            System.out.print("Digite o nome (ou 'sair' para encerrar): ");
            nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo (M/F): ");
            sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("Masculino")) {
                masculino.add(nome);
            } else if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("Feminino")) {
                feminino.add(nome);
            } else {
                System.out.println("Sexo não reconhecido. Digite M ou F.");
            }
        }

        scanner.close();

        System.out.println("Nomes do sexo masculino: " + masculino);
        System.out.println("Nomes do sexo feminino: " + feminino);

    }
}
