public class index {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        temp = b; // 
        b = a; //10
        a = temp; //20

        System.out.println("Depois da troca:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}