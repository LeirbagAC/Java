package Métodos;

public class functions {

    public static void main(String[] args) {

        System.out.println(soma(10, 5));
        
        // System.out.println(mult(10, 5));
        
        functions mult = new functions();
        int resul = mult.mult(10, 5);
        System.out.println(resul);

    }

    public static int soma(int a, int b) {
        return a  +  b;
    }

    public int mult(int a, int b) {
        return a  *  b;
    }
}
