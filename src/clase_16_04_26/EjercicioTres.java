package clase_16_04_26;

import java.util.Scanner;

public class EjercicioTres {

    // Escribir un programa que pregunte al usuario una cantidad a invertir,
    // el interés anual y el número de años,
    // y muestre por pantalla el capital obtenido en la inversión cada año que
    // dura la inversión.

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int cantidadInvertir;
        double interesAnual;
        int numeroDeAnios;
        int capitalObtenido;

        System.out.println("Ingrese la cantidad de dinero que desea invertir: ");
        cantidadInvertir = teclado.nextInt();

        if (cantidadInvertir < 1) {
            System.out.println("Debe ingresar un número mayor a 0 para invertir");
        } else {
            teclado = new Scanner(System.in);
            System.out.println("Ingrese la cantidad de años que desea invertir: ");
            numeroDeAnios = teclado.nextInt();
            if (numeroDeAnios < 1) {
                System.out.println("La cantidad de años a invertir debe ser mayor a 0");
            } else {

                // Falta desarrollar
                for (int i  = 0; i < numeroDeAnios; i++) {

                    interesAnual = cantidadInvertir * (0.35);
                }

                System.out.println("Ya puede comenzar a invertir");
            }
        }
    }
}
