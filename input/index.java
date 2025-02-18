import java.util.Scanner;

public class index {

    public static void main(String[] args) {
    //Obj Scanner + nome 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("Quantos anos voce tem?");
        int idade = scanner.nextInt();

        scanner.nextLine(); //Usar isso após um scanner com números para evitar um erro

        System.out.println("Qual sua comida favorita? ");
        String comida = scanner.nextLine();

        // System.out.println("Ola " + nome);
        // System.out.println("Voce tem " + idade + " anos");
        // System.out.println("E sua comida favorita e: " + comida);

        System.out.printf("Seu nome é %s e tem %d de idade e sua comida favorita e %s", nome, idade, comida);

        scanner.close();
    }
}