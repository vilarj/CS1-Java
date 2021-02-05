
/**
 * Escribe un programa que calcule los cuadradros y las raices de los numeros
 * del 10-0.
 *
 * RECEURDA QUE: ambas operaciones estan defininidas
 * en la clase Math. Eres libre de hacer uso de ellas
 */
public class For {
    public static void main(String[] args) {

//        int numero = 10;
//
//        while (numero > 10) {
//            numero--;
//        }

        for (int numero = 10; numero > 0; numero--) {
            System.out.println("##CUADRADO## " + numero + " elevado a 2 es: " + (numero*numero));
        }

        System.out.println();

        for (int numero = 10; numero > 0; numero--) {
            System.out.println("##RAIZ CUADRADA## La raiz cuadrada de " + numero + " es: " + (Math.sqrt(numero)));
        }
    }
}
