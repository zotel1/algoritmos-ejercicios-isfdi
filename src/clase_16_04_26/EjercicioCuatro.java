package clase_16_04_26;

import java.util.Scanner;

public class EjercicioCuatro {

    /*
    * Escribir un programa que pida al usuario un número entero y muestre por pantalla
un triángulo rectángulo como el de más abajo, de altura el número introducido.
*
**
***
****
*****
*/

    public static void main(String[] args) {

        int ingreseNumero;
        Scanner teclado = new Scanner(System.in);
        String[][] triangulo = new String[0][];

        System.out.println("Ingrese un número");
        System.out.println("El mismo sera la altura del triangulo rectangulo.");

        ingreseNumero = teclado.nextInt();


        for (int i = 0; i <= ingreseNumero; i++) {
            System.out.print("[*]");
            for (int j = 0; j <= ingreseNumero; j++) {
                System.out.println("*");
            }
        }
    }
}
