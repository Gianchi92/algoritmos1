package punteros;

public class ejercicio2 {
    public static void main(String[] args) {
        // Crear dos variables de tipo Integer
        Integer a = 15;
        Integer b = 22;

        // Generar dos "punteros" (en realidad son referencias en Java)
        Integer punteroA = a;
        Integer punteroB = b;

        // Mostrar los valores
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
        System.out.println("Valor apuntado por punteroA: " + punteroA);
        System.out.println("Valor apuntado por punteroB: " + punteroB);
    }
}
