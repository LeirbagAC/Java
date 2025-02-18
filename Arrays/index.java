public class index {

    public static void main(String[] args) {

        //Primeira forma
        String[] carros = {"Tesla", "Fusca", "Hilux"};

        carros[1] = "Mustang";

        System.out.println(carros[1]);
        
        //Segunda forma
        String[] frutas = new String[4];
        frutas[0] = "Banana";
        frutas[1] = "Maçã";
        frutas[2] = "Melão";
        frutas[3] = "Abacaxi";
        
        // System.out.println(frutas[3]);

        for(int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }

        System.out.println("######");
        
        //for melhorado
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        
    }
}