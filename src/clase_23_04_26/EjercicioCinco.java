package clase_23_04_26;

import java.util.Scanner;

public class EjercicioCinco {

    //Pedir a un usuario que ingrese un numero e identifique si es primo o no.

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int ingresoNumerico;
        int resto;
        int cociente;
        int contadorResto = 0;

        System.out.println("Ingrese un numero: ");
        ingresoNumerico = teclado.nextInt();
        for (int i = 0; i <= ingresoNumerico; i++){
            cociente = ingresoNumerico * i;
            resto = ingresoNumerico - cociente;

            if (resto == 0){
                contadorResto = contadorResto + 1;
            }
        }
        if (contadorResto == 2) {
            System.out.println("El numero: " + ingresoNumerico + " es primo");
        }
        else {
            System.out.println("El numero " + ingresoNumerico + " es compuesto.");
        }

    }
}
