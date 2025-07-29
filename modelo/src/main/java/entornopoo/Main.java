package entornopoo;

public class Main {
    public static void main(String[] args) {
        Carta carta1 = new Carta("Rey", 13, "Picas", "Carton", 100, true);
        Carta carta2 = new Carta("As", 1, "Corazones", "Plastico", 50, false);


        System.out.println("Carta 1:");
        System.out.println(carta1.toString());
        System.out.println("\nCarta 2:");
        System.out.println(carta2.toString());


        Reloj reloj1 = new Reloj(33000.0, "Daitona", "Oro", "Azul", "Rolex", false);
        Reloj reloj2 = new Reloj(150.0, "Clásico", "Acero", "Plateado", "Casio", true);
        

        System.out.println("Reloj 1:");
        System.out.println(reloj1.toString());
        
        System.out.println("Reloj 2:");
        System.out.println(reloj2.toString());

        Termo termo1 = new Termo("Plástico", 2.0, "Rojo", true, "De Rosca", "Toto");
        Termo termo2 = new Termo("Acero inoxidable", 1.5, "Plateado", true, "Presión", "Stanley");
        
        System.out.println("Termo 1:");
        System.out.println(termo1.toString());
        
        System.out.println("Termo 2:");
        System.out.println(termo2.toString());


    }
}