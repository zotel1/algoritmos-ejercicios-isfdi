package clase_23_04_26;

import java.util.Scanner;

public class EjercicioNueve {

    /*Escribir un programa que ingrese los datos de los competidores de una carrera de 100
mts: orden, NyA, género, edad, minutos. Siendo género: M=mujeres, V=varones. Calcular
a. El total de competidores.
b. Promedio de edad
c. Tiempo promedio de competencia (en minutos)
d. Cantidad de mujeres y de varones.*/

    public static void main(String[] args) {
        Scanner tecladoDatos = new  Scanner(System.in);
        Scanner tecladoNombres = new  Scanner(System.in);
        Scanner tecladoGenero = new  Scanner(System.in);
        Scanner tecladoEdad = new  Scanner(System.in);
        Scanner tecladoMinutos = new  Scanner(System.in);
        String nombreApellido;
        String genero;
        int edad;
        int edadTotal = 0;
        double minutos;
        double minutosTotal = 0;
        String nombresTotales = " ";
        String ingresoDatos;
        int genMasculino = 0;
        int genFemenino = 0;

        System.out.println("Desea ingresar datos? s/n");
        ingresoDatos = tecladoDatos.nextLine();

        while (ingresoDatos.equalsIgnoreCase("s")) {
            System.out.println("Ingrese el nombre y apellido del participante: ");
            nombreApellido = tecladoNombres.nextLine();
            nombresTotales = nombreApellido + nombresTotales;

            System.out.println("Ingrese el genero del participante [M=mujeres, V=varones]: ");
            genero = tecladoGenero.nextLine();
            if (genero.equalsIgnoreCase("M")) {
                genMasculino = genMasculino + 1;
            }
            else {
                genFemenino = genFemenino + 1;
            }

            System.out.println("Ingrese el edad del participante: ");
            edad = tecladoEdad.nextInt();
            edadTotal = edadTotal + edad;

            System.out.println("Ingrese los minutos que corrio el participante: ");
            minutos = tecladoMinutos.nextInt();

            System.out.println("Desea ingresar datos? s/n");
            ingresoDatos = tecladoDatos.nextLine();

        }
        System.out.println("Fin de la aplicación...");
    }
}
