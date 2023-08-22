import java.util.Scanner;

public class Main {
    enum InimigoPolitico {
        CUBA,
        IRAO
    }

    static String nacao = "usa";
    static boolean criminiso = false;
    static boolean americano = false;
    static boolean possuiArma = false;
    static String nome = " ";

    enum Arma {
        BOMBA,
        MISSIL
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE SEU NOME: ");
        nome = scanner.nextLine();
        if (nome.equals("West")) {
            americano = true;
        } else {
            System.out.println("VOCÊ NÃO É AMERICANO");
        }

        if (americano) {
            System.out.println("QUAIS ARMAS ELE POSSUIA");
            String armaPossui = scanner.nextLine();

            if (armaPossui.equals(Arma.BOMBA.toString()) || armaPossui.equals(Arma.MISSIL.toString())) {
                possuiArma = true;

                System.out.println("Qual país você manteve comunicação nesse Período (...)");
                String pais = scanner.nextLine();

                if (pais.equals(InimigoPolitico.CUBA.toString()) || pais.equals(InimigoPolitico.IRAO.toString())) {
                    criminiso = true;
                    System.out.println("EXISTE UM MISSIL VENDIDO POR UM AMERICANO");
                    System.out.println(nome + " Vendeu " + armaPossui + " para o país de nome " + pais);
                } else {
                    System.out.println( nome + " Apenas possui as armas");
                }
            }
        } else {
            System.out.println(nome + " não é Criminoso!");
            System.out.println("Não tem relação com um dos países inimigos!");
        }
    }

}