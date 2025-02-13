import java.util.Scanner;

public class index {

    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = scanner.nextInt();

        if(age >= 18 && age < 60) {
            System.out.println("You are a adult!");
        } else if(age >= 60){
            System.out.println("You are a BOOMER");
        } else {
            System.out.println("You are under age");
        }
    }
}